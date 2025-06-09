# 🔄 Rotate Linked List

## 📋 Problem Statement
Given the **head** of a singly linked list, rotate the list to the right by **k** places.

🧠 For example:
- Input: `1 → 2 → 3 → 4 → 5`, `k = 2`  
- Output: `4 → 5 → 1 → 2 → 3`

---

## 💡 Intuition
When rotating a list to the right, the last `k` nodes should come to the front.  
To do this efficiently:
- Count the total number of nodes.
- Break the list at the `(length - k)` position.
- Reattach the broken part at the front.

If `k` is larger than the length, we take `k % length`.

---

## 🛠️ Approach
1. **Handle Edge Cases**:  
   If the list is empty or has one node, or if `k == 0`, return the list as-is.

2. **Find Length**:  
   Traverse the list to find the total number of nodes (`count`).

3. **Optimize k**:  
   `k = k % count` (no need to rotate more than the length).

4. **Find Breaking Point**:  
   Traverse the list to the `(count - k)`-th node.

5. **Break & Reconnect**:
   - Set the next of `(count - k)`-th node to `null`.
   - The node after that becomes the new head.
   - Connect the tail of the rotated part to the original head.

---

## ⏱️ Complexity Analysis

| Complexity Type  | Details                      |
|------------------|------------------------------|
| ⌛ Time           | \(O(n)\) — Traverse list twice |
| 🧠 Space          | \(O(1)\) — Constant space     |

---

## 🔍 Code Overview
This solution uses **pointer manipulation** and only **two passes** over the list. No extra data structures are used, which makes it memory-efficient.

---

📂 Check the implementation in [code.java](code.java)  
Happy Coding! ✨💻
