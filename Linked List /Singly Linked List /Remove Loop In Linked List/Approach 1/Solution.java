//GeeksForGeeks||Practise Solution 
class Node {
    int data;  // Stores the data of the node
    Node next; // Points to the next node in the linked list
}

class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        Node slow = head; // Slow pointer moves one step at a time
        Node fast = head; // Fast pointer moves two steps at a time

        // First step: Detect if a loop exists
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                break; // Loop detected
            }
        }

        // If no loop is found, return
        if (fast == null || fast.next == null) {
            return;
        }

        // Second step: Find the starting point of the loop
        slow = head;
        while (fast != slow) {
            slow = slow.next;
            fast = fast.next;
        }

        // Third step: Find the node just before the starting node of the loop
        while (slow.next != fast) {
            slow = slow.next;
        }

        // Remove the loop by setting the next pointer of the last node to null
        slow.next = null;
    }
}
