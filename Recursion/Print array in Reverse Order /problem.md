# 🔄 Printing an Array in Reverse Using Recursion (Call Before Print)

## 📘 Problem Statement

Given an array of integers, print its elements in **reverse order** using recursion by starting from index `0`, but calling the function **before** the print statement.

---

## 🧠 What is Recursion?

Recursion is a technique where a function calls itself to break down a problem into smaller subproblems. Here, recursion mimics a **stack**, allowing us to reverse the flow by printing after the recursive call returns.

---

## 🔍 Approach

In this technique:

- We start from index `0`.
- First, we **make a recursive call** to the next index.
- Only after the recursion returns, we **print** the current element.
- This way, the last element is printed first (reverse order).

---

## 🧮 Dry Run Example

Input: `[1, 2, 3]`

Recursive Flow:

printReverse(0) → calls printReverse(1)
printReverse(1) → calls printReverse(2)
printReverse(2) → calls printReverse(3)
printReverse(3) → base case

Unwinding:
print 3
print 2
print 1

**Output:**  
`3 2 1`

---

## ⏱️ Time & Space Complexity

| Resource         | Complexity      |
|------------------|-----------------|
| Time Complexity  | `O(n)`          |
| Space Complexity | `O(n)` (call stack for n elements) |

---

## ✅ Summary

- This approach demonstrates how **post-order recursion** can reverse output.
- No extra space or loops are needed.
- It's a clean and elegant way to reverse using the natural call stack.
