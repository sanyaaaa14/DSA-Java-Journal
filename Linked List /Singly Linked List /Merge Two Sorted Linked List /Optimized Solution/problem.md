# 🧠 Problem: Merge Two Sorted Linked Lists

## 📝 Problem Statement

Given two singly linked lists `head1` and `head2`, where both are **sorted in non-decreasing order**, the task is to merge them into a single sorted linked list.  
The final list should also be sorted in non-decreasing order.

---

## 🚀 Optimized Approach (Iterative Merge Using Dummy Node)

This approach merges the two sorted lists **in-place**, without using any additional data structures. A dummy node is used to simplify pointer handling and eliminate edge case confusion.

---

## 🔄 Step-by-Step Explanation

### ✅ Step 1: Initialize Dummy Node

- Create a **dummy node** with a temporary value (e.g., `0`).
- Use a pointer `tail` to track the end of the merged list, starting from the dummy node.

---

### 🔁 Step 2: Traverse Both Lists

- While both `head1` and `head2` are not null:
  - Compare the data of the current nodes.
  - Attach the **smaller node** to `tail.next`.
  - Move `tail` to the newly attached node.
  - Advance the pointer (`head1` or `head2`) from which the node was taken.
  - Ensure `tail.next` is set to `null` to prevent unwanted links from previous list.

---

### 🔚 Step 3: Attach Remaining Nodes

- Once one of the lists is exhausted, attach the remaining nodes of the other list directly to `tail.next` (since they are already sorted).

---

### 🎯 Step 4: Return the New Head

- The merged list starts from `dummy.next` (as `dummy` was a placeholder).

---

## ⏱️ Time Complexity

- **O(N + M)** – where `N` and `M` are the lengths of the two linked lists.
- Each node is visited exactly once during the merge.

---

## 💾 Space Complexity

- **O(1)** – No extra space is used apart from a few pointers.
- The merge is done in-place by reusing the original nodes.

---

## ✅ Summary

- This is an **efficient and clean solution** for merging two sorted linked lists using a **dummy node and iterative traversal**.
- It avoids recursion, thus saving stack space and improving performance.
- Commonly used in merge sort on linked lists and problems involving stream merging.

---

> ✅ Ideal for interviews and foundational linked list problems involving sorted order.
