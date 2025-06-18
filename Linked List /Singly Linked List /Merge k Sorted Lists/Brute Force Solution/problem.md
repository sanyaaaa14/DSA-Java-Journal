# 📘 Merge K Sorted Linked Lists – Explanation

## 🧠 Problem Statement

You are given an array `arr[]` consisting of `K` **sorted** linked lists.  
The task is to merge all the linked lists into one single **sorted** linked list and return the head of the final list.

---

## ✅ Approach: Sequential Pairwise Merging

This solution uses a **brute-force** yet effective approach by merging one list at a time from left to right.

### 🔄 Steps:

1. Initialize `head` as the first linked list in the array.
2. Iterate from the second list (`i = 1`) to the last list (`i = K - 1`).
3. For each list, merge it with the current `head` using a helper `merge` function.
4. After finishing all merges, `head` will point to the fully merged sorted linked list.

---

## 🔧 Helper Function: `merge(Node head1, Node head2)`

This function merges two sorted linked lists and returns the head of the merged list.

### 🧩 Logic:

- Create a dummy node `head` and a `tail` pointer to build the merged list.
- Traverse both lists:
  - If `head1.data <= head2.data`, link `tail.next` to `head1` and move `head1`.
  - Else, link `tail.next` to `head2` and move `head2`.
  - Move `tail` forward and set `tail.next = null` to avoid unwanted links.
- Once one list ends, link the remaining nodes of the other list.
- Return `head.next` (ignoring the dummy node).

---

## 🕰️ Time Complexity

- Merging two lists of lengths `M` and `N` takes `O(M + N)` time.
- For `K` lists, this approach takes:  
  **O(N * K)** in the worst case, where `N` is the total number of nodes across all lists.

---

## 📦 Space Complexity

- **O(1)** auxiliary space (excluding output), as no extra data structures are used.
- The new merged list uses the same existing nodes (re-pointing pointers).

---

## ⚠️ Notes

- This is not the most optimal approach.  
  Optimal approach uses **Min-Heap (PriorityQueue)** with time complexity **O(N log K)**.

- However, this approach is easier to implement and understand for smaller values of `K`.

---
