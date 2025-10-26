# Intuition
A linked list is a palindrome if the sequence of its node values reads the same forward and backward.  
Instead of using extra memory (like an array or list), we can use the **two-pointer technique** to find the middle of the list and then **reverse the second half**.  
By comparing the first and the reversed second half, we can check if the list is a palindrome efficiently.

---

# Approach
1. **Find the middle** of the linked list using the **slow and fast pointer technique**:  
   - `slow` moves one step at a time.  
   - `fast` moves two steps at a time.  
   - When `fast` reaches the end, `slow` will be at the midpoint.
2. **Reverse the second half** of the linked list starting from `slow`.  
   - Use three pointers (`prev`, `curr`, `temp`) to reverse the links.
3. **Compare** the first half (`head`) and the reversed second half (`prev`).  
   - Move both pointers step by step and compare values.  
   - If all values match, it’s a palindrome.
4. **Return true** if all comparisons pass; otherwise, return false.

---

# Complexity
- **Time complexity:** O(n)  
  - Finding the middle: O(n/2)  
  - Reversing the second half: O(n/2)  
  - Comparing halves: O(n/2)  
  - Total: O(n)
  
- **Space complexity:** O(1)  
  - Only a few pointers are used, and the list is modified in place.

---

# Code
```java
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
        if (head == null || head.next == null) return true;

        // Step 1: Find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the linked list
        ListNode prev = null;
        ListNode curr = slow;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        // Step 3: Compare the first and second halves
        ListNode end = prev;
        while (end != null) {
            if (head.val != end.val) return false;
            head = head.next;
            end = end.next;
        }

        return true;
    }
}
