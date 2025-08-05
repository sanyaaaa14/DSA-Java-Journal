# Remove Duplicates from Sorted Array – Explanation

## Problem Statement
Given a sorted array of integers (non-decreasing order), remove the duplicates **in-place** such that each unique element appears only once. Return the new length of the array containing only unique elements.

You must do this using **O(1)** extra memory, meaning modifications must happen within the input array itself.

---

## Explanation

### Key Observations:
- The input array is already **sorted**, so duplicates will be **adjacent**.
- We need to remove these duplicates **in-place** and return the number of unique elements.

---

## Approach Used

1. **Pointer `x`**:
   - This keeps track of the **index of the last unique element** in the array.
   - It starts at 0, since the first element is always unique.

2. **Loop from i = 0 to end of array**:
   - If the current element `nums[i]` is **greater than `nums[x]`**, it means we’ve found a new unique element.
   - We then:
     - Move `x` one step ahead (`x+1`)
     - Assign this new unique element to `nums[x] = nums[i]`

3. After the loop ends, the first `(x+1)` elements in `nums[]` will be **unique**, and the rest of the array can be ignored.

---

## Dry Run Example

**Input:**  
`nums = [0, 0, 1, 1, 2]`  

**Steps:**
- Start with `x = 0`
- Compare each `nums[i]` with `nums[x]`
- Only when a greater value is found, move `x` and copy the value
- Final array (first few elements): `[0, 1, 2]`
- Return value: `3`

---

## Output
The function returns `x + 1`, which is the count of **unique elements** in the array.

---

## Complexity Analysis

- **Time Complexity:** O(n)  
  (Where `n` is the number of elements in the array — single pass through the array.)

- **Space Complexity:** O(1)  
  (Only constant space is used; no extra data structures.)

---
