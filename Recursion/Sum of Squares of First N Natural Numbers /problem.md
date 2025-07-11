# 🧮 Sum of Squares of First N Natural Numbers (Recursive)

## 📘 Problem Statement

Given a number `n`, compute the sum of squares of the first `n` natural numbers using recursion.

Mathematically:
\[
\text{Sum} = 1^2 + 2^2 + 3^2 + \dots + n^2
\]

For example:
- Input: `n = 3`  
  Output: \( 1^2 + 2^2 + 3^2 = 1 + 4 + 9 = 14 \)

---

## 🔧 Approach: Recursion

We can recursively define the sum of squares as:

- **Base Case**:
  - If `n == 0`, return `0`.

- **Recursive Case**:
  - Return \( n^2 + \text{sumOfSquares}(n - 1) \)

---

## 🔄 Recursive Breakdown (n = 3)

sumOfSquares(3)
→ 3^2 + sumOfSquares(2)
→ 2^2 + sumOfSquares(1)
→ 1^2 + sumOfSquares(0)
→ 0

**Unwinding:**
sumOfSquares(0) = 0
sumOfSquares(1) = 1^2 + 0 = 1
sumOfSquares(2) = 2^2 + 1 = 4 + 1 = 5
sumOfSquares(3) = 3^2 + 5 = 9 + 5 = 14

---

## 🧪 Sample Test Cases

| Input | Output |
|-------|--------|
| 1     | 1      |
| 3     | 14     |
| 5     | 55     |
| 10    | 385    |

---

## ⏱️ Time & Space Complexity

| Resource         | Complexity       |
|------------------|------------------|
| Time Complexity  | `O(n)`           |
| Space Complexity | `O(n)` (due to recursive call stack) |

---

## ✅ Summary

- The sum of squares of natural numbers can be defined recursively as:
  \[
  \text{sum}(n) = n^2 + \text{sum}(n-1)
  \]
- Recursive solutions are elegant and reflect mathematical patterns.
- Always ensure a base case (`n == 0`) to stop recursion.
