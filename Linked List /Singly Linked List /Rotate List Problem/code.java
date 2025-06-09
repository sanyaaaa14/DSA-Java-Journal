//LEETCODE SOLUTION
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }

        // Step 1: Count the total number of nodes
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Step 2: Normalize k if it's greater than count
        k = k % count;
        if (k == 0) {
            return head;
        }

        // Step 3: Find the (count - k)th node
        count = count - k;
        ListNode prev = null;
        ListNode curr = head;
        while (count > 0) {
            prev = curr;
            curr = curr.next;
            count--;
        }

        // Step 4: Reconnect pointers
        prev.next = null;
        ListNode tail = curr;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;

        return curr;
    }
}
