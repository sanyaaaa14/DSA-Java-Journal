//GeeksForGeeks||Practise Solution 
class Node {
    int data;   // Stores data of the node
    Node next;  // Points to the next node in the linked list
}

class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        Node slow = head;
        Node fast = head;

        // Step 1: Detect loop using Floyd’s Cycle Detection Algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                break;  // Loop detected
            }
        }

        // If no loop is found, simply return
        if (fast == null || fast.next == null) {
            return;
        }

        // Step 2: Find the length of the loop
        slow = fast.next;
        int count = 1;
        while (slow != fast) {
            slow = slow.next;
            count++;
        }

        // Step 3: Initialize two pointers
        slow = head;
        fast = head;

        // Move fast pointer 'count' steps ahead
        while (count > 0) {
            fast = fast.next;
            count--;
        }

        // Step 4: Move both pointers at same speed to find the start of loop
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Step 5: Move to the node before the starting point of the loop
        while (slow.next != fast) {
            slow = slow.next;
        }

        // Step 6: Break the loop
        slow.next = null;
    }
}
