# Subset Generation using Recursion – Explanation

## Overview

This document explains the logic used in generating all possible subsets (the power set) of a given integer array using a recursive backtracking approach in Java.

## Methodology

- A recursive function is used to explore all combinations of elements.
- At each step in the recursion, we have **two choices**:
  - Include the current element in the subset.
  - Exclude the current element from the subset.
- The recursion proceeds until the end of the array is reached.
- Once a complete subset is formed (when the index reaches the array’s length), it is added to the result list.

## Steps Explained

1. **Base Case:**
   - When the index `i` reaches the length of the array, add a **copy** of the current subset to the result list.

2. **Recursive Case:**
   - **Exclude** the current element and move to the next index.
   - **Include** the current element in the subset, then move to the next index.
   - After inclusion, **backtrack** by removing the last added element to maintain the correct state for the next calls.

3. **Result Collection:**
   - A master list is maintained to collect all subsets formed during the recursion.

## Time and Space Complexity

- **Time Complexity:** `O(2^n)`
  - For `n` elements, there are `2^n` possible subsets.
- **Space Complexity:** `O(2^n * n)`
  - Each subset can have up to `n` elements, and we are storing all of them.

## Example

For an input array: `[1, 2]`, the subsets generated are:

- `[]`
- `[2]`
- `[1]`
- `[1, 2]`

## Applications

- Used in solving problems related to combinations and subsets.
- Helpful in decision-making algorithms, bitmasking problems, or backtracking-based solutions.

## Summary

The recursive approach is elegant and clear for subset generation. By making a binary choice at each step (include or exclude), we naturally explore all combinations of elements in the array.
