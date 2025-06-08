# 🔍 Middle of the Linked List – Two Approaches

## 📌 Problem Statement
Given the head of a singly linked list, return the middle node.  
If there are two middle nodes, return the second one.

---

## ✅ Approach 1: Count and Traverse

### 🔹 Intuition
The most straightforward idea is to first count the total number of nodes, then traverse again up to the middle.

### 🔹 Approach
1. Traverse the list once to get the count of nodes.
2. Traverse again `count / 2` steps from the beginning.
3. Return the node reached.

### 🔹 Time Complexity
- $$O(n)$$ — Two passes through the list.

### 🔹 Space Complexity
- $$O(1)$$ — Only a few pointers used.

---

## 🚀 Approach 2: Two Pointers (Fast and Slow)

### 🔹 Intuition
Use two pointers: one moving twice as fast as the other. When the faster one reaches the end, the slower one will be at the middle.

### 🔹 Approach
1. Initialize `slow` and `fast` at the head.
2. Move `slow` one step, and `fast` two steps at a time.
3. When `fast` reaches the end, return `slow`.

### 🔹 Time Complexity
- $$O(n)$$ — Only one traversal needed.

### 🔹 Space Complexity
- $$O(1)$$ — No additional data structures used.

---

## 📌 Summary

| Approach              | Time Complexity | Space Complexity | Description                    |
|-----------------------|------------------|-------------------|--------------------------------|
| Count & Traverse      | O(n)             | O(1)              | Simple, two passes             |
| Fast and Slow Pointers| O(n)             | O(1)              | Optimal, single pass           |
