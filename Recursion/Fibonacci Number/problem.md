# 🔁 Fibonacci Number (Recursive)

## 📘 Problem Statement

Given a number `n`, find the `n`th number in the **Fibonacci sequence** using recursion.

The Fibonacci sequence is defined as:
- `fib(0) = 0`
- `fib(1) = 1`
- For `n > 1`:  
  \[
  \text{fib}(n) = \text{fib}(n - 1) + \text{fib}(n - 2)
  \]

---

## 🔧 Approach: Recursive Definition

This approach uses the **mathematical recurrence relation** of Fibonacci:

- **Base Cases**:
  - If `n == 0` → return `0`
  - If `n == 1` → return `1`

- **Recursive Case**:
  - Return `fib(n - 1) + fib(n - 2)`

---

## 🔄 Recursive Breakdown (fib(4))

fib(4)
→ fib(3) + fib(2)
→ (fib(2) + fib(1)) + (fib(1) + fib(0))
→ ((fib(1) + fib(0)) + 1) + (1 + 0)

**Unwinding:**
fib(0) = 0
fib(1) = 1
fib(2) = 1 + 0 = 1
fib(3) = 1 + 1 = 2
fib(4) = 2 + 1 = 3


---

## 🧪 Sample Test Cases

| Input | Output |
|-------|--------|
| 0     | 0      |
| 1     | 1      |
| 4     | 3      |
| 6     | 8      |

---

## ⏱️ Time & Space Complexity

| Resource         | Complexity         |
|------------------|--------------------|
| Time Complexity  | `O(2^n)` – exponential due to repeated calls |
| Space Complexity | `O(n)` – due to call stack depth |

---

## 🧠 Mathematical Insight

The recursive solution mirrors the natural definition of Fibonacci numbers.  
However, it is highly **inefficient** for large `n` due to repeated subproblems.

---

## ⚠️ Limitations

- This method is **not optimized** for performance.
- It recalculates the same subproblems multiple times.

---

## ✅ Summary

- Recursion provides a clear and elegant way to express the Fibonacci definition.
- Suitable for educational purposes and small inputs.
- For large `n`, use **memoization** or **bottom-up dynamic programming** to optimize.
