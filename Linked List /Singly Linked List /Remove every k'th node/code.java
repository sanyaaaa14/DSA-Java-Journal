//GeeksForGeeks Solution
/*
class Node {
    Node next;
    int data;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    /* You are required to complete this method */
    Node deleteK(Node head, int k) {
        // If k is 1, delete all nodes
        if (k == 1) {
            return null;
        }

        Node prev = null;
        Node curr = head;
        int count = 1;

        while (curr != null) {
            if (count == k) {
                // Skip the current node
                prev.next = curr.next;
                curr = prev.next;
                count = 1; // reset count after deletion
            } else {
                // Move forward
                prev = curr;
                curr = curr.next;
                count++;
            }
        }

        return head;
    }
}
