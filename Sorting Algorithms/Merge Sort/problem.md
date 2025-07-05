# 🧩 Merge Sort Algorithm

## 🧠 Intuition
Merge Sort is a classic divide-and-conquer sorting algorithm. The main idea is to divide the array into halves recursively until each subarray contains only one element (which is inherently sorted), and then merge those subarrays back together in a sorted manner.

It is particularly efficient for large datasets due to its stable time complexity of O(n log n), and is widely used in many programming libraries.

---

## 🛠️ Approach

### Divide Step:
- Recursively divide the input array into two halves.
- Keep dividing until each subarray has only one element.

### Conquer (Merge) Step:
- Use a helper function (`merge`) to merge two sorted subarrays into a single sorted array.
- The merging is done by comparing elements from both subarrays and inserting the smaller one into a temporary array.

### Combine:
- Copy the sorted temporary array back into the original array segment after merging.

---

## 🔧 Steps in Detail

1. **Base Case**:
   - If the subarray has only one element, return (it's already sorted).

2. **Recursive Calls**:
   - Calculate the middle index.
   - Recursively call `mergeSort` on the left and right halves.

3. **Merge Function**:
   - Create a temporary array to store sorted elements.
   - Use two pointers to traverse both halves and fill the temp array in sorted order.
   - After one half is exhausted, copy the remaining elements of the other half.
   - Copy everything back into the original array segment.

---

## 📊 Time and Space Complexity

| Scenario       | Time Complexity | Space Complexity |
|----------------|------------------|------------------|
| Best Case      | O(n log n)       | O(n)             |
| Average Case   | O(n log n)       | O(n)             |
| Worst Case     | O(n log n)       | O(n)             |

- **Time Complexity**:  
  At each level of recursion, the entire array is processed. Since the array is divided in half at each level, there are log n levels → O(n log n) total time.

- **Space Complexity**:  
  O(n) extra space is used for the temporary array during merging.

---

## ✅ Summary

- **Stable sort**: Maintains relative order of equal elements.
- **Not in-place**: Requires O(n) extra space.
- **Efficient and predictable**: Performs well on large datasets and linked lists.
- **Divide-and-conquer**: Breaks the problem into smaller pieces and combines the results.

---

