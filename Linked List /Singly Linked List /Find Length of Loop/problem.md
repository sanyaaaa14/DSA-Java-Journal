# 🔁 Count Nodes in Loop (Floyd’s Cycle Detection)

## 📌 Problem Statement

Given the head of a singly linked list, detect whether it contains a **loop**, and if so, return the **length** of the loop.  
If there is no loop, return `0`.

---

## 💡 Optimized Solution – Floyd’s Cycle Detection + Loop Count

This approach combines **Floyd’s Cycle Detection Algorithm** with an additional step to count the number of nodes in the loop.

### 🚦 Phase 1: Detect Loop
- Use two pointers:
  - `slow` moves one step.
  - `fast` moves two steps.
- If `slow` and `fast` meet, a loop is present.

### 🔢 Phase 2: Count Loop Length
- Start from the meeting point.
- Move one pointer around the loop until it meets the starting point again.
- Count the number of steps taken.

---

## ✅ Why This Works

Once a cycle is detected, we can measure its length by continuing to traverse the loop until we circle back to the starting node.

---

## 📊 Time & Space Complexity

| Complexity | Value   |
|------------|---------|
| Time       | O(n)    |
| Space      | O(1)    |

> `n` = total number of nodes in the linked list.

---

## 🚀 Benefits

- Does **not use extra memory**.
- Handles both **loop detection** and **loop length calculation** in a single traversal.
- Highly efficient for interview scenarios.

---

## 📎 Related Concepts

- Floyd’s Cycle Detection
- Two-pointer technique
- Linked list loops and cycles
