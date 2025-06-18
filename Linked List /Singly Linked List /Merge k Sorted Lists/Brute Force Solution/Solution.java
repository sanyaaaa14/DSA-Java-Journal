//GeeksForGeeks||Practise Solution 
/* 
Node class for singly linked list

class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}
*/

class Solution {
    
    // Function to merge two sorted linked lists
    Node merge(Node head1, Node head2) {
        // Dummy node to help build the merged list
        Node head = new Node(0);
        Node tail = head;

        // Traverse both lists and merge them
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
            tail.next = null;  // Ensure proper termination
        }

        // Attach the remaining part of the list, if any
        if (head1 != null) {
            tail.next = head1;
        } else {
            tail.next = head2;
        }

        // Return the head of the merged list (skipping dummy node)
        return head.next;
    }

    // Function to merge K sorted linked lists using pairwise merge
    Node mergeKLists(List<Node> arr) {
        // Edge case: empty list of linked lists
        if (arr == null || arr.size() == 0) return null;

        // Initialize with the first list
        Node head = arr.get(0);

        // Sequentially merge each linked list into the final result
        for (int i = 1; i < arr.size(); i++) {
            head = merge(head, arr.get(i));
        }

        // Return the fully merged sorted list
        return head;
    }
}
