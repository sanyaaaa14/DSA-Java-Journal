# Merge Sorted Array

## Problem
You are given two sorted integer arrays `nums1` and `nums2`, and two integers `m` and `n` representing the number of elements in `nums1` and `nums2` respectively.  
Merge `nums2` into `nums1` as one sorted array.  

The final sorted array should not be returned by the function but instead stored inside the array `nums1`.  
To accommodate this, `nums1` has a length of `m + n`, where the first `m` elements denote the initial elements, and the last `n` elements are set to 0 and should be ignored.

---

## Intuition
The task requires merging two sorted arrays. A simple approach is to use a copy of the first array and merge it with the second array in sorted order, filling back into `nums1`.

---

## Approach
1. Copy the first `m` elements of `nums1` into a temporary array (`nums1copy`).
2. Use three pointers:
   - `p1` for traversing `nums1copy`
   - `p2` for traversing `nums2`
   - `i` for placing merged elements back into `nums1`.
3. Compare elements from `nums1copy` and `nums2`, and insert the smaller one into `nums1`.
4. If elements remain in either array, append them to `nums1`.
5. At the end, `nums1` will contain the fully merged sorted array.

---

## Complexity
- **Time Complexity:**  
  `O(m + n)` → Each element from both arrays is processed once.
  
- **Space Complexity:**  
  `O(m)` → Additional space used to store a copy of the first `m` elements of `nums1`.

---
