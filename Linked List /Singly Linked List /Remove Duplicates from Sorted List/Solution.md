# Intuition
In a sorted linked list, duplicate nodes will always appear consecutively.  
So, if we traverse the list once, we can easily identify duplicates by comparing each node’s value with the next node’s value.  
Whenever two consecutive nodes have the same value, we can remove the duplicate by skipping the next node.

# Approach
1. Start with a pointer `curr` at the head of the linked list.  
2. Traverse the list while both `curr` and `curr.next` are not `null`.  
3. For each node:
   - If the current node’s value (`curr.val`) is equal to the next node’s value (`curr.next.val`), it means we found a duplicate.
     - Remove the duplicate by setting `curr.next = curr.next.next`.
   - Otherwise, move the `curr` pointer one step forward.
4. Continue this process until the end of the list.
5. Return the head of the modified list.

# Complexity
- **Time complexity:**  
  $$O(n)$$ — where *n* is the number of nodes in the linked list.  
  We traverse the list only once.

- **Space complexity:**  
  $$O(1)$$ — no extra space is used other than a few pointers.

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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}
