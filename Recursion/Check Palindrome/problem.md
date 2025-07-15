# 🔁 Palindrome Check Using Recursion

## 📘 Problem Statement

Given a string `s`, determine whether it is a **palindrome** using recursion.  
A string is a palindrome if it reads the same forward and backward (e.g., `"madam"`, `"racecar"`).

---

## 🧠 What is Recursion?

Recursion is a programming technique where a function calls itself to solve smaller subproblems.  
In this case, we check the first and last characters of the string, and recursively continue for the substring in between.

---

## 🔍 Approach

- Use a helper recursive function that takes the string `s`, a `start` index, and an `end` index.
- **Base Case:**  
  If `start >= end`, it means we have checked the entire string → return `true`.
- **Mismatch Case:**  
  If `s.charAt(start) != s.charAt(end)`, the string is not a palindrome → return `false`.
- **Recursive Case:**  
  Recurse on the substring from `start + 1` to `end - 1`.

---

## 🧮 Dry Run Example

Input: `"racecar"`

isPalindrome("racecar", 0, 6)
→ compare 'r' and 'r' → match → call isPalindrome("racecar", 1, 5)
→ compare 'a' and 'a' → match → call isPalindrome("racecar", 2, 4)
→ compare 'c' and 'c' → match → call isPalindrome("racecar", 3, 3)
→ Base case hit → return true

All recursive calls return true → the string is a palindrome.

---

## 🧪 Sample Test Cases

| Input      | Output |
|------------|--------|
| `"madam"`  | `true` |
| `"apple"`  | `false`|
| `"noon"`   | `true` |
| `"a"`      | `true` |
| `""`       | `true` |

---

## ⏱️ Time & Space Complexity

| Resource         | Complexity      |
|------------------|-----------------|
| Time Complexity  | `O(n)`          |
| Space Complexity | `O(n)` (call stack) |

---

## ✅ Summary

- Recursive palindrome checks are elegant and intuitive.
- Requires careful base case handling to avoid errors.
- Works well for short to medium strings; for large strings, iteration may be more efficient.

