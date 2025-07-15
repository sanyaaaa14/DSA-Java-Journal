- Recurse for the next index.

It forms a recursion tree where each level processes a character and passes the rest down.

---

## 🔧 Approach

1. Convert the string to a `char[]` so we can modify it in-place.
2. Create a recursive method `lowertoupper(char[] s, int index)`:
 - Base case: Stop when index reaches the end of the array.
 - If the current character is lowercase, convert it to uppercase using ASCII math.
 - Recurse to the next index.
3. Convert the modified array back to a string and return it.

---

## 🔍 Dry Run

**Input**: `"RecurSion"`

| Index | Character | Action               | Result   |
|-------|-----------|----------------------|----------|
| 0     | 'R'       | Already uppercase    | 'R'      |
| 1     | 'e'       | → 'E'                | 'E'      |
| 2     | 'c'       | → 'C'                | 'C'      |
| 3     | 'u'       | → 'U'                | 'U'      |
| 4     | 'r'       | → 'R'                | 'R'      |
| 5     | 'S'       | Already uppercase    | 'S'      |
| 6     | 'i'       | → 'I'                | 'I'      |
| 7     | 'o'       | → 'O'                | 'O'      |
| 8     | 'n'       | → 'N'                | 'N'      |

**Output**: `"RECURSION"`

---

## 🧪 Sample Test Cases

| Input       | Output       |
|-------------|--------------|
| `"abc"`     | `"ABC"`      |
| `"Java"`    | `"JAVA"`     |
| `"HeLLo"`   | `"HELLO"`    |
| `"WORLD"`   | `"WORLD"`    |

---

## ⏱️ Time & Space Complexity

| Metric           | Value         |
|------------------|---------------|
| Time Complexity  | `O(n)`        |
| Space Complexity | `O(n)` (call stack due to recursion) |

---

## ✅ Summary

- Recursion allows character-by-character transformation without loops.
- ASCII-based conversion avoids using any library functions.
- This method is efficient for small to medium-sized strings.
- Helps practice basic recursion and character manipulation.

---
