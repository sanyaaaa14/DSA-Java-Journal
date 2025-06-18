//GeeksForGeeks||Practise Solution
/* 
Node class is assumed to be:
class Node {
    int data;
    Node next;
    Node bottom;
    
    Node(int d) {
        data = d;
        next = null;
        bottom = null;
    }
}
*/

class Solution {

    // Function to merge two sorted linked lists using bottom pointers
    Node merge(Node head1, Node head2) {
        // Dummy node to start the merged list
        Node head = new Node(0);
        Node tail = head;

        // Traverse both lists and merge them
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.bottom = head1;
                head1 = head1.bottom;
                tail = tail.bottom;
                tail.bottom = null; // Disconnect any existing chain
            } else {
                tail.bottom = head2;
                head2 = head2.bottom;
                tail = tail.bottom;
                tail.bottom = null; // Disconnect any existing chain
            }
        }

        // Attach the remaining part of either list
        if (head1 != null) {
            tail.bottom = head1;
        } else {
            tail.bottom = head2;
        }

        // Return merged list starting after dummy node
        return head.bottom;
    }

    // Function to flatten the entire multilevel linked list
    Node flatten(Node root) {
        Node head1, head2, head3 = null;

        // Continue until only one list remains
        while (root.next != null) {
            head1 = root;
            head2 = root.next;

            // Save reference to next of next
            if (root.next.next != null) {
                head3 = root.next.next;
            }

            // Disconnect the two lists from rest of the chain
            head1.next = null;
            head2.next = null;

            // Merge the two lists and store in root
            root = merge(head1, head2);

            // Reattach remaining list if present
            if (head3 != null) {
                root.next = head3;
            }
        }

        // Return final flattened list
        return root;
    }
}
