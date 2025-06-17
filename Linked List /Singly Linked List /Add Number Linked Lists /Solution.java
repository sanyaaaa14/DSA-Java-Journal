//GeeksForGeeks||Practise Solution 
/* Node for linked list */
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {

    // Function to recursively reverse the linked list
    static Node reverse(Node curr, Node prev) {
        if (curr == null) {
            return prev; // Base case: return the new head
        }
        Node front = curr.next; // Store next node
        curr.next = prev;       // Reverse the link
        return reverse(front, curr); // Recurse for next node
    }

    // Function to add two numbers represented by linked lists
    static Node addTwoLists(Node first, Node second) {
        // Step 1: Reverse both input linked lists
        first = reverse(first, null);
        second = reverse(second, null);

        Node curr1 = first;
        Node curr2 = second;

        // Create a dummy node to simplify result construction
        Node head = new Node(0);
        Node tail = head;

        int carry = 0;

        // Step 2: Add corresponding digits and carry
        while (curr1 != null && curr2 != null) {
            int sum = curr1.data + curr2.data + carry;
            tail.next = new Node(sum % 10); // Add digit node
            tail = tail.next;
            carry = sum / 10; // Update carry
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        // Step 3: Process remaining digits in first list (if any)
        while (curr1 != null) {
            int sum = curr1.data + carry;
            tail.next = new Node(sum % 10);
            tail = tail.next;
            carry = sum / 10;
            curr1 = curr1.next;
        }

        // Step 4: Process remaining digits in second list (if any)
        while (curr2 != null) {
            int sum = curr2.data + carry;
            tail.next = new Node(sum % 10);
            tail = tail.next;
            carry = sum / 10;
            curr2 = curr2.next;
        }

        // Step 5: If there is still a carry left, add it
        while (carry != 0) {
            tail.next = new Node(carry % 10);
            tail = tail.next;
            carry = carry / 10;
        }

        // Step 6: Reverse the result list to restore forward order
        head = reverse(head.next, null); // Exclude dummy node

        // Step 7: Remove leading zeros, if any (except for a single-digit result)
        while (head != null && head.data == 0 && head.next != null) {
            head = head.next;
        }

        return head; // Final result head
    }
}
