# Merge Sorted Arrays (Optimal In-Place Solution)

## Problem
You are given two sorted integer arrays `nums1` and `nums2`, and two integers `m` and `n`, representing the number of elements in `nums1` and `nums2` respectively.  
The goal is to merge `nums2` into `nums1` so that `nums1` becomes a single sorted array.  
`nums1` has enough extra space at the end to hold all elements of `nums2`.

---

## Intuition
If we try to merge from the **front**, we risk overwriting elements in `nums1` that haven’t been placed yet.  
Instead, we should merge from the **back of the arrays**, where we know there’s extra space in `nums1`.  

By comparing the largest remaining elements of both arrays and placing the larger one at the end of `nums1`, we can avoid overwriting and perform the merge **in-place** without using extra space.

---

## Approach
1. Use three pointers:
   - `p1` → last valid element in `nums1` (`m - 1`)  
   - `p2` → last element in `nums2` (`n - 1`)  
   - `i`  → last position in `nums1` (`m + n - 1`)  

2. Compare elements at `p1` and `p2`. Place the larger one at position `i` in `nums1`.  

3. Move the corresponding pointer (`p1` or `p2`) and decrement `i`.  

4. Continue until one array is exhausted.  

5. If elements remain in `nums2`, copy them to `nums1`.  
   (If elements remain in `nums1`, they are already in correct place, so no action needed.)  

---

## Complexity
- **Time Complexity:** `O(m + n)` → each element is checked once.  
- **Space Complexity:** `O(1)` → in-place merge, no extra array used.  

---
