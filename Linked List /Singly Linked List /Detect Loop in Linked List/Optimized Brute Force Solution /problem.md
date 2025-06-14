# 🔁 Problem: Detect a Loop in a Linked List

## 📌 Problem Statement
You are given the head of a **singly linked list**. Your task is to determine whether the linked list contains a **loop** (also called a cycle).

A loop exists if some node in the list can be reached again by continuously following the `next` pointer.

---

## 🔍 Approach: Optimized Brute Force using HashSet

### ✅ Intuition
The simplest way to detect a loop is to keep track of all the nodes we visit. If we ever visit a node we've already seen, we can conclude that a loop exists.

### 🧱 Logic
- Create a `HashSet` to store the references (addresses) of the visited nodes.
- Traverse the linked list node by node.
- For each node:
  - Check if it exists in the set.
    - If **yes**, a loop is detected. Return `true`.
    - If **no**, add the node to the set and continue.
- If the traversal completes without repetition, return `false`.

---

## ⏱️ Time and Space Complexity

| Metric           | Complexity     |
|------------------|----------------|
| Time Complexity  | O(n)           |
| Space Complexity | O(n)           |

Where `n` is the number of nodes in the linked list.

---

## 💡 Notes
- This approach is applicable **only to singly linked lists**.
- Using a `HashSet` makes the `contains` operation O(1) on average, which improves efficiency over using an `ArrayList`.
- For optimal solutions, consider **Floyd’s Cycle Detection Algorithm (Tortoise and Hare)** which uses **O(1)** space.

---

## 🧾 Summary
- **Data Structure:** Singly Linked List
- **Detection Method:** HashSet to track visited nodes
- **Use Case:** Effective for detecting loops with extra space in linear time

---
