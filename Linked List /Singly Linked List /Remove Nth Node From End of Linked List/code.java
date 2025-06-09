//LEETCODE SOLUTION:
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        
        // Count the total nodes in the list
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        
        // Find the node position to remove from start (0-based)
        count = count - n;
        
        // If the head node is to be removed
        if (count == 0) {
            head = head.next;
            return head;
        }
        
        // Traverse to the node just before the one to remove
        ListNode curr = head;
        ListNode prev = null;
        while (count > 0) {
            prev = curr;
            curr = curr.next;
            count--;
        }
        
        // Remove the nth node from the end
        prev.next = curr.next;
        
        return head;
    }
}
