# ⚡ Quick Sort Algorithm

## 🧠 Intuition
Quick Sort is a highly efficient divide-and-conquer sorting algorithm. The main idea is to select a "pivot" element from the array and partition the other elements into two subarrays:
- Elements less than or equal to the pivot go to the left.
- Elements greater than the pivot go to the right.

The same process is recursively applied to both subarrays. This results in a sorted array when all the partitions are combined.

---

## 🛠️ Approach

### Partition Step:
- Choose the last element as the pivot.
- Iterate over the array and place all elements smaller than or equal to the pivot to its left and all greater elements to its right.
- Return the final index (position) of the pivot after placing it in its correct position.

### Recursive Step:
- Recursively apply the same logic to the left and right subarrays formed by partitioning around the pivot.

---

## 🔧 Steps in Detail

1. **Base Case**:
   - If `low >= high`, the subarray has 1 or 0 elements, so it's already sorted.

2. **Partition Function**:
   - Start from the left of the array and use a `pos` pointer to keep track of where to place the smaller element.
   - Swap smaller or equal elements with `pos` and move `pos` forward.
   - At the end, place the pivot at the `pos` index.

3. **Recursive Calls**:
   - Recursively sort the subarray to the left of the pivot.
   - Recursively sort the subarray to the right of the pivot.

---

## 📊 Time and Space Complexity

| Scenario       | Time Complexity     | Space Complexity |
|----------------|----------------------|------------------|
| Best Case      | O(n log n)           | O(log n)         |
| Average Case   | O(n log n)           | O(log n)         |
| Worst Case     | O(n²) (sorted array) | O(n) (due to call stack) |

- **Time Complexity**:  
  In the best and average cases, the pivot divides the array into balanced parts, resulting in O(n log n).  
  In the worst case (e.g., already sorted array with bad pivot), time becomes O(n²).

- **Space Complexity**:  
  Space is used for recursive stack calls. In the best/average case, depth is log n. In the worst case, depth becomes n.

---

## ✅ Summary

- **Not stable**: May not maintain the relative order of equal elements.
- **In-place**: Does not require extra space (except recursion stack).
- **Efficient on average**: One of the fastest sorting algorithms in practice.
- **Divide-and-conquer**: Breaks array around pivot and recursively sorts partitions.

---

