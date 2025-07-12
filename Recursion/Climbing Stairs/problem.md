# 🧗 Climbing Stairs (Recursive Approach)

## 📘 Problem Statement

You are climbing a staircase. It takes `n` steps to reach the top. Each time, you can either:
- Climb **1 step**, or
- Climb **2 steps**.

Return the total number of distinct ways to climb to the top.

---

## 🔧 Approach: Recursion

At any given step `n`, you can reach it either:
- From step `n-1` (by taking 1 step), or
- From step `n-2` (by taking 2 steps)

This gives the recurrence:
\[
\text{climbStairs}(n) = \text{climbStairs}(n-1) + \text{climbStairs}(n-2)
\]

- **Base Case**:
  - If `n <= 1`, there is exactly **1 way** to reach the top.

This is mathematically similar to the Fibonacci sequence.

---

## 🔄 Recursive Breakdown (n = 4)

climbStairs(4)
→ climbStairs(3) + climbStairs(2)
→ (climbStairs(2) + climbStairs(1)) + (climbStairs(1) + climbStairs(0))
→ ((climbStairs(1) + climbStairs(0)) + 1) + (1 + 1)
→ ((1 + 1) + 1) + 2 = 5

There are **5 ways** to climb 4 stairs.

---

## 🧪 Sample Test Cases

| Input | Output | Explanation                          |
|-------|--------|--------------------------------------|
| 1     | 1      | [1]                                  |
| 2     | 2      | [1+1], [2]                           |
| 3     | 3      | [1+1+1], [1+2], [2+1]                |
| 4     | 5      | [1+1+1+1], [2+1+1], [1+2+1], [1+1+2], [2+2] |

---

## ⏱️ Time & Space Complexity

| Resource         | Complexity             |
|------------------|------------------------|
| Time Complexity  | `O(2^n)` — exponential |
| Space Complexity | `O(n)` — due to recursion stack |

---

## 🧠 Insight

- The recursive structure models a binary decision tree (1 step or 2 steps at each level).
- Ideal for **learning recursion**, but inefficient for larger inputs.
- Problem exhibits **overlapping subproblems** → a perfect candidate for **Dynamic Programming** optimization.

---

## ✅ Summary

- Recursive approach mirrors the problem definition.
- Simple and intuitive, but not suitable for large `n`.
- For optimization, use:
  - **Memoization** (Top-down DP)
  - **Tabulation** (Bottom-up DP)
  - **O(1) space Fibonacci-style solution**

