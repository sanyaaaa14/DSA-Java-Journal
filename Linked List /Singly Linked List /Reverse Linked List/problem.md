# 🔁 Reverse a Singly Linked List – Three Approaches

## 🧠 Problem Statement
Given the head of a singly linked list, reverse the list and return the new head.

---

## ✅ Approach 1: Using ArrayList (Brute Force)

### 🔹 Idea
Store all node values in an `ArrayList`, then re-traverse the list and overwrite each node’s value from the end of the array.

### 🔹 Time Complexity
- $$O(n)$$

### 🔹 Space Complexity
- $$O(n)$$

---

## 🚀 Approach 2: In-place Iterative Reversal (Optimal)

### 🔹 Idea
Use three pointers (`prev`, `curr`, `next`) to reverse the `next` pointers as you traverse the list.

### 🔹 Time Complexity
- $$O(n)$$

### 🔹 Space Complexity
- $$O(1)$$

---

## 🌀 Approach 3: Recursive Reversal

### 🔹 Idea
Use recursion to traverse to the end of the list and reverse the links while returning from the recursive stack.

### 🔹 Time Complexity
- $$O(n)$$

### 🔹 Space Complexity
- $$O(n)$$ (due to recursive call stack)

---

## 📌 Summary

| Approach         | Time Complexity | Space Complexity | Description                     |
|------------------|------------------|------------------|---------------------------------|
| ArrayList        | O(n)             | O(n)             | Easy to implement               |
| In-place Iterative | O(n)           | O(1)             | Optimal and preferred           |
| Recursive        | O(n)             | O(n)             | Clean, but stack overhead       |
