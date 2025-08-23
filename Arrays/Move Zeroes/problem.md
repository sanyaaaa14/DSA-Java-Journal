# Move Zeroes

## Problem
Given an integer array `nums`, move all `0`s to the end of it while maintaining the relative order of the non-zero elements.  
You must do this **in-place** without making a copy of the array.

---

## Intuition
We want to shift all non-zero elements to the **front** of the array, while filling the rest of the array with `0`s.  
This way, we preserve the original order of non-zero elements and ensure all zeroes are pushed to the end.

---

## Approach
1. Use a pointer `x` that keeps track of the position to insert the next non-zero element.  
2. Iterate through the array:
   - If the current element is non-zero, place it at index `x` and increment `x`.  
3. After processing all elements, fill the remaining positions in the array (from `x` to end) with `0`s.  

This ensures non-zero elements remain in order, and all zeroes are pushed to the back.

---

## Complexity
- **Time Complexity:** `O(n)` → single pass through the array plus filling zeroes.  
- **Space Complexity:** `O(1)` → done in-place without extra memory.  

---
