/* 
Node is defined as:

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    // Function to check if the linked list contains a loop using Floyd’s Cycle Detection
    public static boolean detectLoop(Node head) {
        // Initialize two pointers: slow moves one step, fast moves two steps
        Node slow = head;
        Node fast = head;

        // Traverse the list
        while (fast != null && fast.next != null) {
            slow = slow.next;          // Move slow pointer one step
            fast = fast.next.next;     // Move fast pointer two steps

            // If slow and fast pointers meet, loop is detected
            if (slow == fast) {
                return true;
            }
        }

        // If the list ends (no loop), return false
        return false;
    }
}
