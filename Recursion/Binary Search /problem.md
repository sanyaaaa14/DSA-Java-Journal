# 🔍 Binary Search Using Recursion

## 📘 Problem Statement

Given a **sorted array** of integers and a target value `k`, implement a function to **search** for the target using the **Binary Search algorithm**.  
If the target exists, return its **index**. Otherwise, return **-1**.

---

## 🧠 Intuition

Binary Search follows the **divide-and-conquer** approach.  
Instead of scanning each element one-by-one, we cut the array in half on each step by comparing the middle element with the target.

---

## 🧬 Recursive Approach

The recursive method breaks the problem into smaller subproblems by repeatedly checking the middle element and narrowing the search space.

### Base Case:
- If `start > end`, the element is not found → return `-1`.

### Recursive Case:
- If `arr[mid] == x` → return `mid`
- If `arr[mid] > x` → search in the left half (`start` to `mid - 1`)
- If `arr[mid] < x` → search in the right half (`mid + 1` to `end`)

---

## 🔄 Recursive Trace Example

For `arr = [1, 3, 5, 7, 9]` and `k = 7`:

Search(arr, 7, 0, 4) → mid = 2 → arr[2] = 5 < 7
Search(arr, 7, 3, 4) → mid = 3 → arr[3] = 7 ✅
→ return 3

---

## ⏱️ Time & Space Complexity

| Resource          | Complexity       |
|-------------------|------------------|
| Time Complexity   | `O(log n)`       |
| Space Complexity  | `O(log n)` (due to recursive call stack) |

---

## ✅ Summary

- Recursive Binary Search is an elegant and efficient method for searching in **sorted arrays**.
- Ensure to handle base conditions properly to avoid stack overflow or infinite recursion.
- Recursive version is easier to understand mathematically but may use more stack space than iterative.
