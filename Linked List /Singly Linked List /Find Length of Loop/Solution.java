//GeeksForGeeks||Practise Solution 
/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        Node slow = head;
        Node fast = head;

        // Phase 1: Detect loop using Floyd’s Cycle Detection
        while (fast != null && fast.next != null) {
            slow = slow.next;         // Move slow by 1
            fast = fast.next.next;    // Move fast by 2

            if (fast == slow) {       // Loop detected
                break;
            }
        }

        // If no loop is found
        if (fast == null || fast.next == null) {
            return 0;
        } else {
            // Phase 2: Count the number of nodes in the loop
            int count = 1;
            slow = fast.next;         // Start from the next node
            while (slow != fast) {    // Traverse the loop until we return to starting point
                slow = slow.next;
                count++;
            }
            return count;             // Return the total count of loop nodes
        }
    }
}
