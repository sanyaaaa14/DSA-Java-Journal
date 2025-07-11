# 🧮 Factorial of a Number (Recursive)

## 📘 Problem Statement

Given a positive integer `n`, your task is to compute the **factorial** of `n` using recursion.

The **factorial** of a number `n` is defined as the product of all integers from `1` to `n`, and is denoted as:

\[
n! = n \times (n - 1) \times (n - 2) \times \dots \times 1
\]

### Example:
- `factorial(5)` → `5 × 4 × 3 × 2 × 1 = 120`

---

## 🔧 Approach: Recursion

The function is defined recursively as:

- **Base Case**:  
  If `n == 1`, then return `1`.  
  This stops the recursion.

- **Recursive Case**:  
  Multiply `n` with the factorial of `n-1`.

---

## 🔄 Recursive Tree (Example for n = 4)

factorial(4)
→ 4 * factorial(3)
→ 3 * factorial(2)
→ 2 * factorial(1)
→ 1

**Unwinding:**
factorial(1) = 1
factorial(2) = 2 * 1 = 2
factorial(3) = 3 * 2 = 6
factorial(4) = 4 * 6 = 24


---

## 🧠 Mathematical Insight

Factorial is **naturally recursive**, meaning its definition refers to smaller subproblems of the same kind — perfect for solving with recursion.

---

## 🧪 Sample Test Cases

| Input | Output |
|-------|--------|
| 1     | 1      |
| 3     | 6      |
| 5     | 120    |
| 6     | 720    |

---

## ⏱️ Time & Space Complexity

| Resource          | Complexity       |
|-------------------|------------------|
| Time Complexity   | `O(n)`           |
| Space Complexity  | `O(n)` (due to recursive call stack) |

---

## ✅ Summary

- Factorial is a classic example of recursion.
- Always ensure a valid **base case** to prevent infinite recursion.
- This method is elegant, readable, and closely reflects the mathematical definition.

