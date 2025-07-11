# ✴️ Power of a Number (Recursive)

## 📘 Problem Statement

Given two integers `x` and `n`, compute `x` raised to the power `n` using recursion.

That is:
\[
x^n = x \times x \times \dots \times x \quad (\text{n times})
\]

For example:  
- \( 2^3 = 2 \times 2 \times 2 = 8 \)  
- \( 5^0 = 1 \)

---

## 🔧 Approach: Simple Recursion

We recursively multiply `x` with the result of `power(x, n - 1)` until the base case is reached.

- **Base Case**:
  - If `n == 0`, return `1` (any number raised to power 0 is 1).
  
- **Recursive Case**:
  - Return `x * power(x, n - 1)`.

---

## 🔄 Recursive Breakdown (x = 2, n = 4)

power(2, 4)
→ 2 * power(2, 3)
→ 2 * power(2, 2)
→ 2 * power(2, 1)
→ 2 * power(2, 0)
→ 1 (base case)

**Unwinding:**
power(2, 0) = 1
power(2, 1) = 2 * 1 = 2
power(2, 2) = 2 * 2 = 4
power(2, 3) = 2 * 4 = 8
power(2, 4) = 2 * 8 = 16


---

## 🧠 Mathematical Insight

Recursion reduces the power problem from `x^n` to `x * x^(n-1)`, making it solvable step-by-step.

Advanced optimizations like **exponentiation by squaring** reduce time to `O(log n)` but are beyond the basic recursion scope.

---

## 🧪 Sample Test Cases

| Input (x, n) | Output |
|--------------|--------|
| 2, 3         | 8      |
| 5, 0         | 1      |
| 3, 1         | 3      |
| 2, 4         | 16     |

---

## ⏱️ Time & Space Complexity

| Resource         | Complexity       |
|------------------|------------------|
| Time Complexity  | `O(n)`           |
| Space Complexity | `O(n)` (due to recursive call stack) |

---

## ✅ Summary

- Power problems can be solved recursively using the relation `x^n = x * x^(n-1)`.
- A proper base case like `n == 0` is crucial to stop recursion.
- This approach mirrors the mathematical definition and is simple to implement.
