# 🔁 Reverse a Singly Linked List – Two Approaches

## 🧠 Problem Statement
Given the head of a singly linked list, reverse the list and return the head of the reversed list.

---

## ✅ Approach 1: Using ArrayList (Brute Force)

### 🔹 Idea
Store all node values in an `ArrayList`, then overwrite the linked list by reading values in reverse order.

### 🔹 Steps
1. Traverse the list and store each node's value in an `ArrayList`.
2. Re-traverse the list and update each node's value from the end of the list.

### 🔹 Time Complexity
- $$O(n)$$ – One traversal to store values, one to overwrite them.

### 🔹 Space Complexity
- $$O(n)$$ – Extra space used for the `ArrayList`.

---

## 🚀 Approach 2: In-place Reversal (Optimal)

### 🔹 Idea
Reverse the list by modifying the `next` pointers of nodes using three pointers: `prev`, `curr`, and `next`.

### 🔹 Steps
1. Initialize `prev` as `null` and `curr` as `head`.
2. Iterate through the list and reverse pointers.
3. At the end, `prev` will point to the new head.

### 🔹 Time Complexity
- $$O(n)$$ – Each node is visited exactly once.

### 🔹 Space Complexity
- $$O(1)$$ – Only constant extra space is used for pointers.

---

## 📌 Summary

| Approach        | Time Complexity | Space Complexity | Description                    |
|----------------|------------------|------------------|--------------------------------|
| ArrayList       | O(n)             | O(n)             | Brute force, easier to read    |
| In-place        | O(n)             | O(1)             | Optimal, preferred in practice |

