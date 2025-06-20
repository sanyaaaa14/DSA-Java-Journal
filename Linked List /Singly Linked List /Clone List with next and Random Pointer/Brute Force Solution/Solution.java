//GeeksForGeeks||practise Solution
/*linked list node
class Node {
    int data;
    Node next;
    Node random;

    Node(int x) {
        data = x;
        next = null;
        random = null;
    }
}
*/
class Solution {

    // Helper function to find the corresponding node in the copied list
    // Given original head, copied head, and target node x from original list,
    // it returns the node in the copied list corresponding to x
    public Node find(Node head, Node headcopy, Node x) {
        Node curr1 = head;
        Node curr2 = headcopy;
        while (curr1 != x) {
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return curr2;
    }

    // Main function to clone the linked list with next and random pointers
    public Node cloneLinkedList(Node head) {
        Node temp = head;

        // Create a dummy head for the copied list
        Node headcopy = new Node(0);
        Node tailcopy = headcopy;

        // First pass: Copy all nodes with only 'data' and 'next' pointers
        while (temp != null) {
            tailcopy.next = new Node(temp.data);
            tailcopy = tailcopy.next;
            temp = temp.next;
        }

        // Move headcopy to the actual start of the copied list
        headcopy = headcopy.next;

        // Second pass: Copy the 'random' pointers using the find function
        temp = head;
        tailcopy = headcopy;
        while (temp != null) {
            tailcopy.random = find(head, headcopy, temp.random);
            tailcopy = tailcopy.next;
            temp = temp.next;
        }

        // Return the head of the copied list
        return headcopy;
    }
}
