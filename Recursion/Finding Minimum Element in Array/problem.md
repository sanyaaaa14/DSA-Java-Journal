# 🔍 Finding Minimum Element in Array Using Recursion

## 📘 Problem Statement

Given an array of integers, find the **minimum element** using recursion without using any loop constructs.

---

## 🧠 What is Recursion?

Recursion solves a problem by breaking it into smaller subproblems. Here, we compare the current element with the minimum of the remaining array.

---

## 🔍 Approach

- Start from index `0`.
- At each step, find the **minimum** of the current element and the result of the recursive call.
- The base case is when the index reaches the **last element**, which is returned directly.

---

## 🧮 Dry Run Example

Input: `[5, 3, 7, 1]`

Recursive Trace:
findMin(0) = min(5, findMin(1))
findMin(1) = min(3, findMin(2))
findMin(2) = min(7, findMin(3))
findMin(3) = 1 (base case)

Unwinding:

min(7, 1) = 1
min(3, 1) = 1
min(5, 1) = 1

**Output:** `1`

---

## ⏱️ Time & Space Complexity

| Resource         | Complexity      |
|------------------|-----------------|
| Time Complexity  | `O(n)`          |
| Space Complexity | `O(n)` (call stack) |

---

## ✅ Summary

- A recursive approach elegantly finds the minimum without iteration.
- Ensure the base case is correctly set to avoid out-of-bound errors.
- Uses the natural call stack to reduce the problem step by step.


