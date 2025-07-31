# Find Second Largest Element in Array – Explanation

## Problem Statement
You are given an array of integers. Your task is to find the second largest distinct element in the array. If the array contains fewer than two distinct elements, return -1.

---

## Explanation

1. **Initial Check**:  
   If the array has fewer than two elements, it's not possible to have a second largest element. Hence, return -1 immediately.

2. **Initialization**:  
   Use two variables:  
   - `firstlargest` to store the maximum element encountered so far.  
   - `secondLargest` to store the second largest distinct element.

3. **Traversal Logic**:  
   Traverse the array once:
   - If the current element is greater than `firstlargest`, update `secondLargest` with `firstlargest` before updating `firstlargest`.
   - If the current element is less than `firstlargest` but greater than `secondLargest`, update `secondLargest`.

4. **Final Check**:  
   If `secondLargest` remains unchanged (i.e., no distinct second largest found), return -1.

---

## Dry Run Example

**Input:**  
Array: `[10, 5, 10]`  
Length: `3`

**Step-by-step Execution:**  
- Initialize `firstlargest = -∞`, `secondLargest = -∞`
- First element `10` becomes `firstlargest`
- Second element `5` is less than `firstlargest` and greater than `secondLargest`, so becomes `secondLargest`
- Third element is equal to `firstlargest`, so skip

**Output:**  
`5`

---

## Complexity Analysis

- **Time Complexity:** O(n), where `n` is the size of the array  
- **Space Complexity:** O(1), as no extra space is used except variables

---
