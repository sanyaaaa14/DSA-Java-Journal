# 🔁 Reverse a String Using Recursion

## 📘 Problem Statement

Given a string `s`, reverse the string using recursion. You are **not allowed** to use built-in reverse methods.  
Return the reversed version of the string.

---

## 🧠 Intuition

Reversing a string involves swapping characters from both ends toward the center.  
Recursion naturally fits this approach since we can:

- Swap the first and last character.
- Recur for the substring inside.

This divide-and-conquer strategy stops when the `start >= end`.

---

## 🔧 Approach

1. Convert the input string to a character array.
2. Use a helper function `reverse(char[] s, int start, int end)`:
   - Base Case: Stop when `start >= end`.
   - Swap `s[start]` and `s[end]`.
   - Recur with updated indices (`start+1`, `end-1`).
3. Return the reversed character array as a string.

---

## 🔍 Example Dry Run

Input: `"hello"`

**Initial Array**: `['h', 'e', 'l', 'l', 'o']`

start = 0, end = 4 → swap 'h' and 'o' → ['o', 'e', 'l', 'l', 'h']
start = 1, end = 3 → swap 'e' and 'l' → ['o', 'l', 'l', 'e', 'h']
start = 2, end = 2 → base case (stop)

Final Output: `"olleh"`

---

## ⏱️ Time & Space Complexity

| Resource         | Complexity     |
|------------------|----------------|
| Time Complexity  | `O(n)`         |
| Space Complexity | `O(n)` (due to recursion stack) |

---

## 🧪 Sample Test Cases

| Input     | Output    |
|-----------|-----------|
| `"abc"`   | `"cba"`   |
| `"madam"` | `"madam"` |
| `"hello"` | `"olleh"` |

---

## ✅ Summary

- This approach uses recursion to mirror characters from both ends of the string.
- It demonstrates how recursion simplifies problems that have symmetrical operations.
- For larger inputs, consider an iterative approach to reduce call stack usage.
