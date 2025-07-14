# 📘 Printing an Array Using Recursion

## 🔍 Problem Statement

Given an array of integers and its size `n`, print all elements of the array using recursion (without using loops).

---

## 🧠 What is Recursion?

Recursion is a programming technique where a function calls itself to solve smaller instances of the same problem.

In this case, we recursively print each element by:
- **Printing the current index element**
- **Calling the function for the next index**

---

## 🔧 Recursive Approaches

There are two common approaches to printing an array recursively:

### 🔹 Top-Down (Forward Order)

Print the current element first, then recursively call for the rest.

printArray(arr, index)
→ print arr[index]
→ call printArray(arr, index + 1)

---

## 🔄 Example Execution (Top-Down)

Input: `arr = [10, 20, 30]`

printArray(arr, 0)
→ prints 10
→ printArray(arr, 1)
→ prints 20
→ printArray(arr, 2)
→ prints 30

Output:  

---

## 🧪 Sample Test Cases

| Input             | Output       |
|------------------|--------------|
| [1, 2, 3, 4]      | 1 2 3 4      |
| [7, 0, -5]        | 7 0 -5       |
| []                | (empty line) |

---

## 🧮 Time & Space Complexity

| Resource          | Complexity         |
|-------------------|--------------------|
| Time Complexity   | `O(n)`             |
| Space Complexity  | `O(n)` (recursion stack) |

---

## ✅ Summary

- Recursion breaks a problem into smaller subproblems.
- Printing arrays recursively helps reinforce understanding of function call stacks.
- Works both in forward and reverse order by changing the placement of the print statement.
- Clean and useful for practicing recursion base and recursive cases.

---
