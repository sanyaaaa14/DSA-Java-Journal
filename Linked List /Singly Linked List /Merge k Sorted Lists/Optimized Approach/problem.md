# 📘 Merge K Sorted Linked Lists – Divide and Conquer Approach

## 🧠 Problem Statement

Given an array `arr[]` of `K` sorted linked lists, the task is to merge them into a single sorted linked list and return the head of the final merged list.

---

## ✅ Approach: Divide and Conquer (Merge Sort Inspired)

This solution is inspired by the **merge sort** algorithm.  
Instead of merging one by one from left to right, we divide the array and merge the linked lists in pairs.

### 🔄 Steps:

1. Use a recursive function `mergesort(arr, start, end)` to divide the list range:
   - Base condition: if `start >= end`, return.
   - Recursively divide into left and right halves.
   - Merge the results of two halves and store at `arr[start]`.

2. In the main `mergeKLists` function, call `mergesort` on the full range of the array.

3. Return the merged list at `arr[0]`.

---

## 🔧 Helper Function: `merge(Node head1, Node head2)`

This function merges two sorted linked lists:

- Initialize a dummy node `head` and a `tail` pointer.
- Compare nodes from `head1` and `head2` and link the smaller one to `tail`.
- Continue until one list is exhausted.
- Link the remaining nodes from the other list.
- Return `head.next` (skipping dummy node).

---

## 🕰️ Time Complexity

- Merging two lists of total `N` nodes takes `O(N)` time.
- At each level of recursion, we perform `K` total merges.
- Since we halve the list each time → `log K` levels.
- **Total Time Complexity = O(N log K)**, where `N` is the total number of nodes across all lists.

✅ This is the **optimal solution** for this problem.

---

## 📦 Space Complexity

- **O(log K)** recursion stack space.
- No extra data structures are used apart from recursion.
- Node pointers are reused.

---

## ⚠️ Why this is better than linear merging

- Linear merging takes `O(N*K)` in the worst case.
- This divide-and-conquer method ensures that we're balancing the merges and reducing the number of comparisons by working in log levels.

---

## 🧪 Example

If `K = 4`, and you have:
List 1: 1 -> 4 -> 5
List 2: 1 -> 3 -> 4
List 3: 2 -> 6
List 4: 0 -> 7


**Recursive Merge Steps:**
- Merge List 1 & 2 → [1,1,3,4,4,5]  
- Merge List 3 & 4 → [0,2,6,7]  
- Merge above two → Final merged list: [0,1,1,2,3,4,4,5,6,7]

---

## 📌 Final Thoughts

This divide-and-conquer approach is both efficient and scalable for large values of `K`.  
It's the same strategy used in real-world libraries for efficient merging (e.g., in Java's `PriorityQueue`-based approach or C++'s `merge()` STL).

---

