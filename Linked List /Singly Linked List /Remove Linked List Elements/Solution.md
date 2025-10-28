# Intuition
When removing nodes from a linked list that contain a specific value, we must handle edge cases carefully — especially when the node to be removed is the **head** itself.  
To simplify this process, we can use a **sentinel (dummy) node** that points to the head of the list. This way, even if the head needs to be removed, we can do so without losing access to the rest of the list.

---

# Approach
1. **Create a sentinel (dummy) node** that points to the head of the linked list.  
   - This dummy node helps avoid special handling for the head node.
2. **Use a pointer `prev`** to iterate through the list starting from the sentinel.
3. For each node:
   - If `prev.next.val == val`, skip the node by updating `prev.next = prev.next.next`.
   - Otherwise, move `prev` to the next node.
4. Continue until the end of the list.
5. Finally, return `sentinel.next`, which is the potentially new head of the modified list.

This ensures that all nodes with the given value are removed, including those at the beginning.

---

# Complexity
- **Time complexity:** O(n)  
  Each node is visited exactly once.
  
- **Space complexity:** O(1)  
  Only a few extra pointers are used (constant space).

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
    public ListNode removeElements(ListNode head, int val) {
        // Create a sentinel (dummy) node
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;

        ListNode prev = sentinel;
        
        // Traverse and remove target nodes
        while (prev != null && prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next; // skip the node
            } else {
                prev = prev.next; // move to next
            }
        }

        // Return the new head
        return sentinel.next;
    }
}

