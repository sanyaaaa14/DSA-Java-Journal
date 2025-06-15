
# 🧩 Problem: Remove Loop in a Singly Linked List

## 🔍 Problem Statement

Given a singly linked list, your task is to detect and remove a loop (if present) without losing any nodes. The solution should not use extra space and must maintain the structure of the original list.

---

## 🛠️ Approach

We use **Floyd’s Cycle Detection Algorithm (Tortoise and Hare)** to:

- Detect the loop.
- Find the starting point of the loop.
- Remove the loop without using any additional data structure.

---

## 🧠 Step-by-Step Explanation

### 1. Detect the Loop

- Use two pointers:  
  `slow` → moves one step at a time  
  `fast` → moves two steps at a time  
- If `slow` and `fast` meet at some node, then a **loop exists**.

### 2. Find the Starting Point of the Loop

- Move `slow` to the head.
- Keep `fast` at the meeting point.
- Move both `slow` and `fast` one step at a time.
- The node where they meet again is the **start of the loop**.

### 3. Remove the Loop

- Traverse the loop using a single pointer from the loop starting node until you reach the node just before the start (i.e., `slow.next != fast`).
- Set `slow.next = null` to break the loop.

---

## ❗ Why Not Use a `prev` Pointer After Detecting Loop?

After `fast == slow`, one might consider using a `prev` pointer (one step behind `fast`) to break the loop using `prev.next = null`.  
However, this is **not a reliable or correct approach** for singly linked lists.

### 🚫 Here's Why It Doesn't Work:

- In a singly linked list, nodes only point forward.
- We **cannot access the previous node** of `fast` unless we manually track it.
- Even if we maintain a `prev` pointer behind `fast`, the meeting point (`slow == fast`) is **not guaranteed to be the last node** of the loop.

### 🔁 Example:

```
Linked List: 1 → 2 → 3 → 4 → 5 → 6
                          ↑       ↓
                          ←←←←←←←←←
Loop: Node 6 connects back to Node 3
Suppose slow and fast meet at Node 5.

A prev pointer behind fast would be at Node 4.

Doing prev.next = null would break the chain between Node 4 and 5, which is not the correct place to remove the loop.

This results in an incomplete and broken list, not the original structure.
```

### ✅ Correct Way:

After finding the loop's starting node, traverse from it to the last node of the loop.  
Set that last node’s `next = null`.

---

## 🧪 Test Case Example

Let’s consider this linked list with a loop:

```
1 → 2 → 3 → 4 → 5
          ↑     ↓
          ←←←←←←
```

- The loop starts at node 3.
- `slow` and `fast` meet at node 4.
- Now, reset `slow` to head and move both `slow` and `fast` one step at a time:
  - `slow = 1`, `fast = 4`
  - `slow = 2`, `fast = 5`
  - `slow = 3`, `fast = 3` → loop start found
- To remove the loop, traverse until the node before the loop starts (node 5) and set `next = null`.

---

## ✅ Time and Space Complexity

| Operation         | Complexity |
|------------------|------------|
| Time Complexity   | O(n)       |
| Space Complexity  | O(1)       |

---

## 📌 Summary

- Floyd’s Algorithm is efficient for loop detection and removal.
- Avoids the need for extra data structures like HashSet or ArrayList.
- Maintains O(n) time and O(1) space, making it optimal.
- Avoids incorrect approaches like using `prev.next = null`, which don't guarantee safe loop removal.
