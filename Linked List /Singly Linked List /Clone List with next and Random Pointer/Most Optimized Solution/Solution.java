//GeeksForGeeks||Practise Solution 
/* linked list node
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

    public Node cloneLinkedList(Node head) {
        // Base case: if list is empty, return null
        if (head == null) return head;

        // Step 1: Create a separate copy of the list using only 'next' pointers
        Node temp = head;
        Node headcopy = new Node(0); // Dummy head for clone list
        Node tailcopy = headcopy;

        while (temp != null) {
            tailcopy.next = new Node(temp.data); // Copy current node's data
            tailcopy = tailcopy.next;
            temp = temp.next;
        }

        headcopy = headcopy.next; // Move headcopy to actual start

        // Step 2: Interleave original and copied nodes
        Node curr1 = head;
        Node curr2 = headcopy;
        Node front1;
        Node front2;

        while (curr1 != null) {
            front1 = curr1.next;      // Save next of original
            front2 = curr2.next;      // Save next of clone

            curr1.next = curr2;       // Insert clone node after original node
            curr2.next = front1;      // Link clone node to next original node

            curr1 = front1;           // Move to next original
            curr2 = front2;           // Move to next clone
        }

        // Step 3: Assign random pointers to cloned nodes
        curr1 = head;
        curr2 = head.next;

        while (curr1 != null) {
            curr2 = curr1.next; // Get corresponding clone node
            if (curr1.random != null) {
                curr2.random = curr1.random.next; // Point to clone of random node
            }
            curr1 = curr2.next; // Move to next original node
        }

        // Step 4: Restore original list and separate cloned list
        curr1 = head;
        curr2 = headcopy;

        while (curr1 != null && curr2 != null) {
            curr1.next = curr2.next; // Restore original next
            curr1 = curr1.next;

            if (curr1 != null) {
                curr2.next = curr1.next; // Link clone to next clone
            }

            curr2 = curr2.next; // Move to next clone node
        }

        // Return the head of the deep copied list
        return headcopy;
    }
}
