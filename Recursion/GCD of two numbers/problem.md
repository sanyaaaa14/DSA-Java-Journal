# 📘 GCD of Two Numbers (Euclidean Algorithm)

## 🔍 Problem Statement

Given two integers `a` and `b`, find their **Greatest Common Divisor (GCD)** — the largest positive number that divides both `a` and `b` without leaving a remainder.

---

## 🧠 What is GCD?

The **GCD** of two numbers is the largest number that divides both numbers exactly.

For example:
- GCD(12, 18) = 6
- GCD(100, 10) = 10
- GCD(7, 5) = 1 (when they are co-prime)

---

## 🔧 Approach: Euclidean Algorithm (Recursive)

The Euclidean algorithm is based on the principle:
> GCD(a, b) = GCD(b, a % b)

We recursively apply this until `b == 0`, at which point `a` will be the GCD.

### ✨ Why it works:

Mathematically,  
\[
\text{gcd}(a, b) = \text{gcd}(b, a \mod b)
\]
Because if `a = bq + r`, then any number that divides both `a` and `b` must also divide `r`.

---

## 🔄 Recursive Flow

Let’s say we want to compute `gcd(48, 18)`:

gcd(48, 18)
→ gcd(18, 48 % 18) = gcd(18, 12)
→ gcd(12, 18 % 12) = gcd(12, 6)
→ gcd(6, 12 % 6) = gcd(6, 0)
→ return 6

---

## 🧪 Sample Test Cases

| Input      | Output |
|------------|--------|
| 12, 18     | 6      |
| 100, 10    | 10     |
| 7, 5       | 1      |
| 0, 5       | 5      |
| 0, 0       | 0 (edge case, undefined mathematically) |

---

## ⏱️ Time & Space Complexity

| Resource         | Complexity             |
|------------------|------------------------|
| Time Complexity  | `O(log(min(a, b)))`    |
| Space Complexity | `O(log(min(a, b)))` — due to recursion |

---

## ✅ Summary

- GCD is a fundamental number theory operation.
- The **Euclidean algorithm** is an efficient and elegant method.
- It works using simple division and recursion.
- Can also be implemented **iteratively** for better space optimization.

---

