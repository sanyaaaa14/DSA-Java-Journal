//GeeksForGeeks||Practise Solution 
/*class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

// arr is an array of Nodes of the heads of linked lists

class Solution {
    // Function to merge two sorted linked lists
    Node merge(Node head1, Node head2) {
        Node head = new Node(0); // dummy node
        Node tail = head;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
            tail.next = null; // ensure tail points to null to avoid carryovers
        }

        if (head1 != null) {
            tail.next = head1;
        } else {
            tail.next = head2;
        }

        return head.next; // skip dummy node
    }

    // Recursive merge sort function
    void mergesort(List<Node> arr, int start, int end) {
        if (start >= end) return;

        int mid = start + (end - start) / 2;
        mergesort(arr, start, mid);
        mergesort(arr, mid + 1, end);

        // Merge the two halves and update the array
        arr.set(start, merge(arr.get(start), arr.get(mid + 1)));
    }

    // Main function to merge K lists
    Node mergeKLists(List<Node> arr) {
        if (arr == null || arr.size() == 0) return null;
        mergesort(arr, 0, arr.size() - 1);
        return arr.get(0);
    }
}
