# 🔍 Linear Search using Recursion

## 📘 Problem Statement

Given an array of integers and a target value `x`, your task is to implement a recursive function that returns the **index of the first occurrence** of `x` in the array. If `x` is not found, return `-1`.

---

## 🧠 Intuition

Linear search checks each element in the array one-by-one. This approach can be implemented recursively by checking the current index and then moving to the next index until the element is found or the end of the array is reached.

---

## 🔧 Approach

- Create a helper function `linearSearch(arr, x, i)` that starts at index `i`.
- If `arr[i] == x`, return `i`.
- If `i == arr.length`, return `-1` (base case).
- Otherwise, move to the next index recursively.

---

## 🔁 Recursive Flow

For `arr = [2, 4, 6, 8]`, `x = 6`:

linearSearch(arr, 6, 0) → arr[0] ≠ 6
linearSearch(arr, 6, 1) → arr[1] ≠ 6
linearSearch(arr, 6, 2) → arr[2] == 6 ✅
→ return 2


---

## 🧪 Sample Test Cases

| Input             | Target | Output |
|------------------|--------|--------|
| [1, 2, 3, 4, 5]   | 3      | 2      |
| [10, 20, 30, 40]  | 25     | -1     |
| [5, 5, 5, 5, 5]   | 5      | 0      |
| []               | 7      | -1     |

---

## ⏱️ Time & Space Complexity

| Resource         | Complexity        |
|------------------|-------------------|
| Time Complexity  | `O(n)`            |
| Space Complexity | `O(n)` (due to call stack) |

---

## ✅ Summary

- This recursive method is elegant but not optimal in terms of space due to function calls.
- It's a good example of how recursive thinking can replace iteration in simple search problems.
- Works well for small inputs and learning recursion fundamentals.
