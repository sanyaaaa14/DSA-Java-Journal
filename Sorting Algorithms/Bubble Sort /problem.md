# 🧼 Bubble Sort with Early Termination Optimization

## 🧠 Intuition
Bubble Sort is a simple comparison-based sorting algorithm where adjacent elements are compared and swapped if they are in the wrong order. This process is repeated until the array is sorted.

To make the algorithm more efficient, we use a `swapped` flag to detect whether any elements were swapped during a pass.  
- If no swaps are made in a complete pass, the array is already sorted.
- This helps avoid unnecessary iterations in best-case scenarios.

---

## 🛠️ Approach

1. Start from the beginning of the array and perform multiple passes over it.
2. In each pass:
   - Compare each pair of adjacent elements.
   - Swap them if they are in the wrong order.
3. After each pass, the largest unsorted element "bubbles up" to its correct position at the end.
4. Use a boolean `swapped` flag:
   - Reset it to `false` before each outer loop pass.
   - If any swap occurs during the pass, set it to `true`.
   - If `swapped` remains `false` after the inner loop, break early — the array is already sorted.

This optimization significantly improves performance on already sorted or nearly sorted arrays.

---

## 📊 Time and Space Complexity

| Case          | Time Complexity |
|---------------|-----------------|
| Best Case     | O(n)            |
| Average Case  | O(n²)           |
| Worst Case    | O(n²)           |

- **Space Complexity**: O(1) — Sorting is done in-place, requiring no extra space.

---

## ✅ Summary

- Bubble Sort is a fundamental algorithm ideal for learning purposes.
- It's inefficient for large datasets due to its quadratic time complexity.
- However, it performs well on small or nearly sorted inputs when the early termination optimization (`swapped` flag) is used.
- The simplicity of the algorithm makes it easy to implement and understand.

---
