# Intuition
The task is to remove the Nth node from the end of a linked list.  
A simple way to do this is to **first determine the total length** of the list. Once we know the length, the node to be removed can be found at position `(length - n)` from the beginning.  
Using a **sentinel (dummy) node** simplifies the removal process, especially when the head itself needs to be deleted.

---

# Approach
1. **Initialize a sentinel node** pointing to the head of the list.  
   - This helps handle edge cases (like removing the head) easily.
2. **Traverse the list once** to calculate its total length.
3. **Find the (length - n)th node** — this is the node *just before* the one to be removed.
4. **Update the `next` pointer** of that node to skip the target node (`prev.next = prev.next.next`).
5. **Return `sentinel.next`** as the potentially new head of the list.

This two-pass approach is simple and clear, though it can be optimized to a one-pass solution using two pointers.

---

# Complexity
- **Time complexity:** O(n)  
  The algorithm traverses the linked list twice — once to find the length and once to remove the node.
  
- **Space complexity:** O(1)  
  Only a few pointers are used, so constant extra space is required.

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a sentinel node
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        
        // First pass: find the length of the list
        ListNode curr = head;
        int length = 0;
        while (curr != null) {
            length++;
            curr = curr.next;
        }

        // Second pass: find the node before the target
        ListNode prev = sentinel;
        int prevPos = length - n;
        for (int i = 0; i < prevPos; i++) {
            prev = prev.next;
        }

        // Remove the target node
        prev.next = prev.next.next;

        // Return the updated list
        return sentinel.next;
    }
}
