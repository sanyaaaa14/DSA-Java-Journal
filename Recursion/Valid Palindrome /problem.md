# 🔁 Valid Palindrome Using Recursion

## 📘 Problem Statement

Given a string `s`, determine whether it is a **valid palindrome**, considering only alphanumeric characters and ignoring cases.

A palindrome is a word, phrase, number, or sequence that reads the same backward as forward.  
Your task is to:
- Ignore spaces, punctuation, and case.
- Use recursion to determine if the cleaned string is a palindrome.

---

## 🧠 Intuition

Even though the string may contain mixed characters, once it's cleaned to keep only alphanumerics and normalized to lowercase, we can easily check for a palindrome recursively by comparing characters from the outer ends moving inward.

---

## 🔧 Approach

1. **Preprocessing**:
   - Convert the input string to lowercase.
   - Remove all non-alphanumeric characters.

2. **Recursive Check**:
   - Define a helper function `palindrome(s, start, end)`:
     - **Base Case**: If `start >= end`, return `true`.
     - **Mismatch Case**: If `s[start] != s[end]`, return `false`.
     - Otherwise, recursively check the substring between the indices.

---

## 🧮 Dry Run Example

Input: `"A man, a plan, a canal: Panama"`

Cleaned: `"amanaplanacanalpanama"`

Recursive calls:

palindrome("amanaplanacanalpanama", 0, 20)
→ compare 'a' and 'a' → match → move inward
→ compare 'm' and 'm' → match → ...
→ ...
→ base case reached → return true

---

## 🧪 Sample Test Cases

| Input                            | Output  |
|----------------------------------|---------|
| `"racecar"`                      | `true`  |
| `"A man, a plan, a canal: Panama"` | `true`  |
| `"hello"`                        | `false` |
| `" "`                            | `true`  |
| `"ab@a"`                         | `true`  |

---

## ⏱️ Time & Space Complexity

| Resource         | Complexity               |
|------------------|--------------------------|
| Time Complexity  | `O(n)` (cleaning + check)|
| Space Complexity | `O(n)` (cleaned string + recursion stack) |

---

## ✅ Summary

- This method demonstrates how **recursion** can be used to solve real-world string processing problems.
- Always ensure to **clean and normalize** the input before applying logic.
- Recursive approach keeps the solution elegant and expressive, closely reflecting the definition of a palindrome.
