# Remove Element – Explanation

## Problem Statement

Given an integer array `nums` and an integer value `val`, remove all occurrences of `val` in-place and return the new length of the array.

The order of elements can be changed, but elements beyond the new length do not matter.

## Approach

- Use a two-pointer technique to overwrite elements equal to `val`.
- Initialize a pointer `x` to 0. It will track the position to place the next valid (non-`val`) element.
- Iterate through the array:
  - If `nums[i]` is not equal to `val`, copy it to `nums[x]`, and increment `x`.
- The first `x` elements of `nums` will now contain the valid elements.

## Time and Space Complexity

- **Time Complexity:** O(n), where n is the length of the input array. We traverse the array only once.
- **Space Complexity:** O(1), as we use only a constant amount of extra space (no additional arrays).

## Example

**Input:**

```
nums = [3, 2, 2, 3], val = 3
```

**Output:**

```
New length = 2
Modified nums = [2, 2, _, _]
```

Note: The underscores `_` represent ignored values beyond the returned length.

## Key Concepts Used

- In-place array modification  
- Two-pointer technique  
- Space optimization
