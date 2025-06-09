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
    public boolean isPalindrome(ListNode head) {
        // Edge case: only one node
        if (head.next == null) {
            return true;
        }

        // Step 1: Count total nodes
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }

        // Step 2: Move to the midpoint
        count = count / 2;
        ListNode prev = null;
        ListNode curr = head;
        while (count > 0) {
            prev = curr;
            curr = curr.next;
            count--;
        }

        // Break the list into two halves
        prev.next = null;

        // Step 3: Reverse the second half
        ListNode front = null;
        prev = null;
        while (curr != null) {
            front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }

        // Step 4: Compare both halves
        ListNode head1 = head;
        ListNode head2 = prev;
        while (head1 != null) {
            if (head1.val != head2.val) {
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }

        return true;
    }
}
