# ✨ All Possible Subsequences of a String using Recursion

## 📘 Problem Statement

Given a string `s`, generate **all possible non-empty subsequences** of the string using **recursion**.  
The result should be **sorted** in **lexicographical order**.

---

## 🧠 Intuition

A **subsequence** is formed by making a decision at each character:  
- Either include the character, or  
- Skip the character.

This approach gives a **binary decision tree**, resulting in `2^n` total combinations.

---

## 🔄 Recursive Approach

The recursive function maintains:
- A current index in the string.
- A temporary string to build the subsequence.
- A list to store all valid subsequences.

### Base Case:
- When the current index reaches the string’s length, add the temporary string to the result list (if it's not empty).

### Recursive Case:
- Recurse by **excluding** the current character.
- Recurse by **including** the current character.

---

## 🔁 Example Dry Run

For input `s = "ab"`:

1. Start with an empty string
2. Options at each level:
   - Skip `'a'` → skip `'b'` → `""`
   - Skip `'a'` → include `'b'` → `"b"`
   - Include `'a'` → skip `'b'` → `"a"`
   - Include `'a'` → include `'b'` → `"ab"`

Final Result (after removing `""` and sorting):  
`["a", "ab", "b"]`

---

## ⏱️ Time & Space Complexity

| Resource          | Complexity           |
|------------------|----------------------|
| Time Complexity   | `O(2^n * n)` (Each subsequence and sorting) |
| Space Complexity  | `O(2^n * n)` (Result storage)               |

---

## ✅ Summary

- Uses recursion with backtracking principles.
- Lexicographically sorted output ensures a well-structured result.
- Simple yet powerful pattern for string-based recursive generation.
