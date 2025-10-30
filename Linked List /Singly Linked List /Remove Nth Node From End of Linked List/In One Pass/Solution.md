# Intuition
To remove the Nth node from the end of a linked list, we need to locate the node just before the one we want to remove. A straightforward way would be to first calculate the total length of the list and then traverse again to find the (length - N)th node. However, this requires two passes through the list.  
A more efficient method uses two pointers — a **fast pointer** and a **slow pointer** — to find the target node in just one pass.

# Approach
1. Create a **sentinel (dummy)** node before the head to simplify edge cases (like removing the first node).
2. Initialize two pointers — `first` and `second` — at the sentinel node.
3. Move the `first` pointer **n steps ahead**. This creates a gap of `n` nodes between `first` and `second`.
4. Move both pointers forward simultaneously until `first` reaches the end of the list.
   - At this point, `second` will be pointing to the node **just before** the one that needs to be removed.
5. Adjust the `next` pointer of `second` to **skip** the target node (`second.next = second.next.next`).
6. Return `sentinel.next` as the new head of the modified list.

# Complexity
- **Time complexity:**  
  $$O(L)$$ — where *L* is the length of the linked list.  
  Each node is visited at most once.

- **Space complexity:**  
  $$O(1)$$ — constant extra space is used.

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
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode first = sentinel;
        ListNode second = sentinel;

        // Move first pointer n steps ahead
        while (n > 0) {
            first = first.next;
            n--;
        }

        // Move both pointers until first reaches the end
        while (first.next != null) {
            first = first.next;
            second = second.next;
        }

        // Remove the target node
        second.next = second.next.next;

        return sentinel.next;
    }
}
