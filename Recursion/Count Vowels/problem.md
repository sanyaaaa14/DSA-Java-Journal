# 🔡 Count Vowels in a String Using Recursion

## 📘 Problem Statement

Given a string `s`, count the number of **vowels** in it using **recursion**.  
A vowel is one of the characters: `a`, `e`, `i`, `o`, `u` (case-insensitive).

---

## 🧠 Intuition

Recursion can traverse each character in the string one at a time, checking if it's a vowel and accumulating the count.

---

## 🔧 Approach

1. Use a recursive function with an index to process characters one by one.
2. For each character, convert it to lowercase.
3. Check if the character is a vowel.
4. Return `1 + recursive call` if it's a vowel; otherwise return just the recursive call.
5. The base case is when the index reaches the end of the string.

---

## 🔍 Example Dry Run

Input: `"Recursion"`

Lowercased: `"recursion"`

index 0: 'r' → not a vowel → count = 0
index 1: 'e' → vowel → count = 1
index 2: 'c' → not a vowel → count = 0
index 3: 'u' → vowel → count = 1
index 4: 'r' → not a vowel → count = 0
index 5: 's' → not a vowel → count = 0
index 6: 'i' → vowel → count = 1
index 7: 'o' → vowel → count = 1
index 8: 'n' → not a vowel → count = 0
→ Total vowels = 4

---

## ⏱️ Time & Space Complexity

| Resource         | Complexity      |
|------------------|-----------------|
| Time Complexity  | `O(n)`          |
| Space Complexity | `O(n)` (recursion stack) |

---

## ✅ Summary

- This recursive method is clean, readable, and demonstrates character-wise processing.
- Works well for small to moderate-sized strings.
- For large strings, an iterative solution may be preferred to avoid stack overflow.

