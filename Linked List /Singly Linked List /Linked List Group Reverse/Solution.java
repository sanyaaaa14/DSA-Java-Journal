//GeeksForGeeks||Practise Solution
/* Node class of the linked list */
class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class Solution {

    // Function to reverse nodes in k-group
    public static Node reverseKGroup(Node head, int k) {
        // Dummy node added at the beginning to simplify edge cases
        Node first = new Node(0);
        first.next = head;
        head = first; // Reassign head to dummy

        // Loop to process the entire list in groups of size k
        while (first.next != null) {
            Node second = first.next; // Start of the current group
            Node prev = first;        // Node before the current group
            Node curr = second;       // Current node for reversal
            Node front = null;        // To hold the next node temporarily
            int x = k;

            // Try to reverse k nodes
            while (x > 0 && curr != null) {
                front = curr.next;  // Save next node
                curr.next = prev;   // Reverse link
                prev = curr;        // Move prev forward
                curr = front;       // Move curr forward
                x--;
            }

            // After reversing k nodes:
            // Connect previous part to new head of this group
            first.next = prev;
            // Connect the tail of the reversed group to the remaining list
            second.next = curr;

            // Move first to the end of this group for the next iteration
            first = second;

            // Optional: check if enough nodes remain for next group
            // but current logic will automatically stop if nodes < k
            x = k;
        }

        // Return the head skipping the dummy node
        head = head.next;
        return head;
    }
}
