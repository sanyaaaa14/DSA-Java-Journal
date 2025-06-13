# 🧠 Problem: Remove Duplicates from a Sorted Linked List

## 📝 Problem Statement

You're given a **sorted singly linked list**. The task is to remove all duplicate elements from the list so that each element appears only once.

Because the list is sorted, any duplicate elements will appear consecutively.

---

## 💡 Brute Force Approach (Using Extra Space)

This approach makes use of additional space to store only the unique elements from the list, and then rewrites the original list using these unique values.

---

## 🔄 Step-by-Step Explanation

### ✅ Step 1: Handle Base Cases

- If the list is empty or has only one node, there is nothing to remove.
- The function simply returns the original list in this case.

---

### 📦 Step 2: Store Unique Elements

- Traverse the linked list from the head.
- Since the list is sorted, duplicates appear consecutively.
- Maintain a temporary list (like an `ArrayList`) to store only the first occurrence of each element.
- Compare each node with the last stored unique value, and only add it if it’s different.

---

### 🔁 Step 3: Rebuild the Linked List

- Traverse the original list again.
- Overwrite each node's value with the values from the temporary list of unique elements.
- At the end of this process, make sure the last node's `next` pointer is set to null to properly terminate the list.

---

## ⏱️ Time Complexity

- **O(N)** – The list is traversed twice:
  1. Once to collect unique values.
  2. Once to overwrite the list.

---

## 💾 Space Complexity

- **O(N)** – Extra space is used to store the unique values before rewriting the list.
- This space is proportional to the number of distinct elements in the list.

---

## ⚖️ Summary

- This brute-force solution is easy to implement and understand.
- It is helpful in learning how to manipulate and rewrite linked lists.
- However, it is **not the most optimal** approach in terms of space.
- A better solution would involve **in-place removal** of duplicates using pointer manipulation, which can be done in a single traversal with **O(1)** extra space.

---

> ✅ Suitable for beginners to understand linked list operations and value handling, though not optimal for memory-constrained environments.
