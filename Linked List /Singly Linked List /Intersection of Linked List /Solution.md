# Intuition
When two singly linked lists intersect, they share the same tail nodes starting from the intersection point.  
If we could somehow identify the first common node (i.e., the same memory reference), we can return it as the intersection node.  

One straightforward approach is to store all the nodes of one list in a data structure (like a `HashSet`) and then check if any node from the other list already exists in that set.  
If such a node is found, that’s where the intersection begins.

---

# Approach
1. **Traverse the second linked list (`headB`)** and store all its nodes in a `HashSet<ListNode>`.  
   - This allows O(1) lookup time for checking if a node has been seen before.
2. **Traverse the first linked list (`headA`)**:
   - For each node in `headA`, check if it exists in the set.
   - If it does, that node is the intersection point → return it.
3. If no common node is found after the traversal, return `null`.

This approach works because two intersecting lists share the same node references (not just values).

---

# Complexity
- **Time complexity:** O(n + m)  
  - O(m) for traversing list B and storing its nodes.  
  - O(n) for traversing list A and checking each node.  
  - Total = O(n + m)

- **Space complexity:** O(m)  
  - We store all nodes of list B in a `HashSet`.

---

# Code
```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> temp = new HashSet<>();

        // Store all nodes of list B
        ListNode curr = headB;
        while (curr != null) {
            temp.add(curr);
            curr = curr.next;
        }

        // Traverse list A and check for intersection
        curr = headA;
        while (curr != null) {
            if (temp.contains(curr)) {
                return curr; // intersection found
            }
            curr = curr.next;
        }

        // No intersection found
        return null;
    }
}
