# 🚀 Remove Nth Node From End of Linked List

## 📋 Problem Statement
Given the **head** of a singly linked list, remove the **nth** node from the **end** of the list and return the updated head.

---

## 💡 Intuition
To remove the nth node from the end, we first find the **length** of the linked list.  
The node to remove is at position **(length - n)** from the start.  
- If this position is **0**, it means we need to remove the **head** node.  
- Otherwise, we traverse to the node just before this position and adjust pointers to skip the target node.

---

## 🛠️ Approach
1. Traverse the linked list to **count** the total number of nodes.
2. Calculate the target position from the start: `count - n`.
3. If this position is **0**, remove the **head** by returning `head.next`.
4. Else, traverse to the node just before the target node.
5. Update the `next` pointer of this previous node to skip the node to be deleted.
6. Return the updated head of the list.

---

## ⏱️ Complexity Analysis

| Complexity Type  | Details                          |
|------------------|---------------------------------|
| **Time**         | \(O(n)\) — Two traversals       |
| **Space**        | \(O(1)\) — Constant extra space |

---

## 🔍 Code Explanation
The solution performs two passes over the linked list:  
- The first pass calculates the length.  
- The second pass locates the node to remove and adjusts pointers accordingly.  

No additional data structures are used, making it efficient in terms of space.

---

Feel free to explore the code in [code.java](code.java) 📂 to see the implementation details!  
Happy coding! 🎉
