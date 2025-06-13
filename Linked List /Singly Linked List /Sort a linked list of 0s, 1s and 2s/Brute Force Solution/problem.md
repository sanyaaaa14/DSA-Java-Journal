# 🔢 Problem: Sort 0s, 1s, and 2s in a Linked List

Given a singly linked list consisting of nodes with data values `0`, `1`, or `2`, the task is to sort the list such that all 0s come first, followed by 1s, and then 2s. This is similar to the **Dutch National Flag problem**, adapted for a linked list.

---

## 💡 Approach: Count and Overwrite (Brute Force)

### ✅ Intuition:
Instead of rearranging node pointers, which is complex in a singly linked list, we take a simpler brute-force approach. We count the number of 0s, 1s, and 2s, and then overwrite the existing node values in sorted order.

---

## 🧠 Steps:

1. **Counting Phase**:
   - Traverse the linked list once to count the number of 0s, 1s, and 2s.

2. **Overwrite Phase**:
   - Traverse the list again and overwrite node values:
     - First fill in all 0s
     - Then fill in all 1s
     - Then all 2s

This avoids pointer manipulation entirely and is simple to implement.

---

## ⏱️ Time & Space Complexity:

| Metric           | Complexity       |
|------------------|------------------|
| Time Complexity  | `O(n)` — two passes through the list |
| Space Complexity | `O(1)` — no extra space used (only counters) |

---

## 📌 Note:
- This is not an in-place node rearrangement but value overwriting.
- Useful when node data can be changed and pointer manipulation is to be avoided.

