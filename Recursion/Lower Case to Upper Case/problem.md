# 🔠 Convert Lowercase Letters to Uppercase Using Recursion

## 📘 Problem Statement

Given a string `str` consisting of lowercase and/or uppercase letters, convert all lowercase characters to uppercase using **recursion only**.  
You are not allowed to use any built-in method like `toUpperCase()`.

---

## 🧠 Intuition

We can recursively process each character in the string:

- If it is a lowercase letter (between `'a'` and `'z'`), convert it to its uppercase counterpart.
- Move recursively to the next index until we reach the end of the string.

This problem is well-suited for recursion because it involves repetitive processing of each character in sequence.

---

## 🔧 Approach

1. Convert the input string to a `char[]` array so we can modify it in-place.
2. Use a recursive function `lowertoupper(char[] s, int index)`:
   - Base Case: If index exceeds the length, stop the recursion.
   - If `s[index]` is a lowercase letter, convert it using ASCII logic:
     ```
     s[index] = 'A' + (s[index] - 'a')
     ```
   - Recurse for the next index.
3. After conversion, return a new `String` from the modified `char[]` array.

---

## 🔍 Dry Run Example

Input: `"heLLo"`

Step-by-step:
Index 0: 'h' → 'H'
Index 1: 'e' → 'E'
Index 2: 'L' → Already uppercase
Index 3: 'L' → Already uppercase
Index 4: 'o' → 'O'

Output: `"HELLO"`

---

## ⏱️ Time & Space Complexity

| Resource         | Complexity     |
|------------------|----------------|
| Time Complexity  | `O(n)`         |
| Space Complexity | `O(n)` (due to recursion call stack) |

---

## 🧪 Sample Test Cases

| Input     | Output    |
|-----------|-----------|
| `"abc"`   | `"ABC"`   |
| `"aBcD"`  | `"ABCD"`  |
| `"Xyz"`   | `"XYZ"`   |
| `"HELLO"` | `"HELLO"` |

---

## ✅ Summary

- Recursion provides a clean and elegant way to process characters one by one.
- ASCII value manipulation allows character conversion without built-in methods.
- This solution is recursive and modifies the string in-place (via a char array).

