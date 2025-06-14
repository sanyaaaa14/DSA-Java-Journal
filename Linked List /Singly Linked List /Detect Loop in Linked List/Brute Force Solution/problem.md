# 🔄 Problem: Detect Loop in a Linked List

## 🧩 Problem Statement:
Given a singly linked list, determine whether it contains a loop or cycle. A loop occurs when a node's `next` pointer points to a previously visited node, forming a cycle in the list.

---

## 💡 Approach: Brute Force using a Visited List

### ✅ Intuition:
If we could keep track of all the nodes we have already visited, we can check if the current node has already been seen before. If yes, a loop is detected.

---

## 🧠 Steps:

1. Initialize an empty list `visited` to store references to the nodes.
2. Traverse the linked list using a pointer `curr`.
3. For each node, check whether it already exists in the `visited` list:
   - If yes → **loop detected**, return `true`.
   - If no → add it to `visited` and continue.
4. If traversal ends (`curr == null`), return `false`.

---

## ⏱️ Time & Space Complexity:

| Metric           | Complexity         |
|------------------|--------------------|
| Time Complexity  | `O(n^2)` — due to linear search in visited list |
| Space Complexity | `O(n)` — for storing visited node references |

---

## ⚠️ Note:
- This brute force method is inefficient for large linked lists.
- It uses an `ArrayList` which results in linear-time lookup. A `HashSet` would reduce time to `O(n)`.

