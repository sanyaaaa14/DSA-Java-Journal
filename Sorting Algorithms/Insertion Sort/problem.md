# 🧩 Insertion Sort

## 🧠 Intuition
Insertion Sort works the way we sort playing cards in our hands:
- Start with the second card and compare it with the one before.
- If it’s smaller, shift the previous cards until you find the right place.
- Insert the current card in the correct position.

This process continues until the entire deck (array) is sorted.

---

## 🛠️ Approach

1. Start from the second element (index 1), assuming the first element is already sorted.
2. For each element, compare it with all previous elements.
3. Shift larger elements to the right to make space.
4. Insert the current element into its correct position in the sorted part of the array.
5. Repeat until the array is completely sorted.

This is done in-place without using extra space.

---

## 📊 Time and Space Complexity

| Case          | Time Complexity |
|---------------|-----------------|
| Best Case     | O(n)            |
| Average Case  | O(n²)           |
| Worst Case    | O(n²)           |

- **Space Complexity**: O(1) — Sorting is performed in-place.

---

## ✅ Summary

- Insertion Sort is simple and efficient for small or nearly sorted arrays.
- It is **adaptive**, meaning it becomes more efficient when the array is already partially sorted.
- Unlike selection or bubble sort, it does **fewer comparisons and swaps** in best-case scenarios.
- Not efficient for large datasets due to its O(n²) time in the average and worst cases.

---
