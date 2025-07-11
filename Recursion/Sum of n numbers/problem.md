# ➕ Sum of First N Natural Numbers (Recursive)

## 📘 Problem Statement

Given a non-negative integer `n`, write a recursive function to calculate the **sum of the first `n` natural numbers**.

### Mathematically:
\[
\text{Sum}(n) = n + (n - 1) + (n - 2) + \dots + 1 + 0
\]

---

## 🔧 Approach: Recursion

We use recursion by breaking the problem into smaller subproblems:

- **Base Case**:  
  If `n == 0`, return `0`.  
  This terminates the recursion.

- **Recursive Case**:  
  Return `n + findSum(n - 1)`.

---

## 🔄 Recursive Tree (Example for n = 4)

findSum(4)
→ 4 + findSum(3)
→ 3 + findSum(2)
→ 2 + findSum(1)
→ 1 + findSum(0)
→ 0
**Unwinding:**
findSum(0) = 0
findSum(1) = 1 + 0 = 1
findSum(2) = 2 + 1 = 3
findSum(3) = 3 + 3 = 6
findSum(4) = 4 + 6 = 10

---

## 🧠 Why Recursion?

- The problem breaks down into smaller self-similar subproblems.
- Easy to understand and implement.
- Closely mirrors the mathematical definition.

---

## 🧪 Sample Test Cases

| Input | Output |
|-------|--------|
| 0     | 0      |
| 1     | 1      |
| 4     | 10     |
| 5     | 15     |
| 10    | 55     |

---

## ⏱️ Time & Space Complexity

| Resource          | Complexity       |
|-------------------|------------------|
| Time Complexity   | `O(n)`           |
| Space Complexity  | `O(n)` (due to recursive call stack) |

---

## ✅ Summary

- This is a basic example of recursion used to sum the first `n` numbers.
- Recursion helps simplify problems by solving smaller instances of the same problem.
- Base cases are essential to avoid infinite loops or stack overflow.
