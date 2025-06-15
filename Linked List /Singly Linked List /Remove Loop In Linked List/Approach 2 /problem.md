# 🧠 Problem: Remove Loop in a Linked List

## 🔍 Problem Statement

Given a singly linked list, your task is to detect and remove a loop, if one exists. A loop occurs when a node’s `next` pointer points to any of the previous nodes in the list, forming a cycle. The goal is to restore the list to a proper linear structure — the last node should point to `null`.

> ⚠️ You must remove the loop without deleting any nodes or modifying node values.

---

## 🎯 Objective

- Detect whether the loop exists in the linked list.
- If a loop is found, remove it by changing the next pointer of the node that points back into the loop.

---

## 🧭 Approach Overview

This solution uses **Floyd’s Cycle Detection Algorithm**, also known as the **Tortoise and Hare algorithm**, to first detect the presence of a loop in the list. After detection, the algorithm locates the starting node of the loop and removes the loop by setting the `next` pointer of the last node in the loop to `null`.

---

## 🔄 Step-by-Step Breakdown

### 1. Detect the Loop
Two pointers, `slow` and `fast`, traverse the list at different speeds:
- `slow` moves one node at a time.
- `fast` moves two nodes at a time.
If they meet, a loop exists.

### 2. Count the Number of Nodes in the Loop
Once the loop is detected, the number of nodes in the loop is counted by traversing from the meeting point until the traversal returns to the same node.

### 3. Find the Starting Node of the Loop
Two pointers are initialized at the head of the list. One pointer is advanced by the loop count steps. Then both pointers move one step at a time until they meet again — this meeting point is the **start of the loop**.

### 4. Remove the Loop
To remove the loop, traverse from the loop start node until the node that points back to it (i.e., the last node in the loop). Set this node's `next` pointer to `null`, breaking the cycle.

---

## ⏱️ Time Complexity

- **O(N)** in the worst case
  - Detecting the loop: O(N)
  - Counting loop nodes: O(N)
  - Finding the start of the loop: O(N)
  - Removing the loop: O(N)
  
Overall: **Linear time**

---

## 💾 Space Complexity

- **O(1)**  
  No extra space is used. Only a constant number of pointers are used throughout the algorithm.

---

## 📌 Key Concepts

- Floyd’s Cycle Detection Algorithm (Tortoise and Hare)
- Linked list traversal
- Cycle handling in linear data structures
- Pointer manipulation

---

## ✅ Edge Cases Handled

- No loop present in the list → returns without change
- Loop starts at the head of the list
- Self-loop (single node pointing to itself)
- Long loop in the middle or end of the list

---

## 🧠 Conclusion

This solution efficiently detects and removes a loop in a singly linked list using constant space and linear time. The technique is elegant and avoids the need for extra data structures like hash sets, making it suitable for space-constrained environments or embedded systems.

