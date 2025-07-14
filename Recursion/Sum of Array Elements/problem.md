# ➕ Sum of Array Elements Using Recursion

## 📘 Problem Statement

Given an integer array, calculate the **sum of all its elements** using recursion (without using loops).

---

## 🧠 What is Recursion?

Recursion is a method where the solution to a problem depends on solutions to smaller instances of the same problem. In this case, we reduce the array size on each call.

---

## 🔍 Approach

- Start from index `0`.
- At each step, add the current element to the result of the recursive call for the remaining array.
- Base case: when the index reaches the end of the array, return `0`.

---

## 🧮 Dry Run Example

Input: `[2, 4, 6]`

Recursive Breakdown:

sumArray(0) = 2 + sumArray(1)
sumArray(1) = 4 + sumArray(2)
sumArray(2) = 6 + sumArray(3)
sumArray(3) = 0 (base case)

Unwinding:

sumArray(2) = 6 + 0 = 6
sumArray(1) = 4 + 6 = 10
sumArray(0) = 2 + 10 = 12


**Output:** `12`

---

## ⏱️ Time & Space Complexity

| Resource         | Complexity      |
|------------------|-----------------|
| Time Complexity  | `O(n)`          |
| Space Complexity | `O(n)` (due to recursive call stack) |

---

## ✅ Summary

- Recursive approach breaks down the problem into smaller pieces.
- Avoids use of iteration.
- Clean and expressive solution ideal for learning recursion.

