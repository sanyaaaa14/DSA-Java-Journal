# Problem: Binary Search in Sorted Array

## Intuition
When the array is sorted, we do not need to check every element one by one.  
We can compare the target with the middle element and eliminate half of the search space each time.

- If the middle element equals the target, return its index.
- If the target is greater than the middle element, search in the right half.
- If the target is smaller than the middle element, search in the left half.

This repeated halving makes Binary Search much faster than Linear Search.

Example:

Array = `[1, 3, 5, 7, 9]`, Target = `7`

- Middle = 5 → Target is greater, search right half
- Middle = 7 → Found at index `3`

## Approach
1. Initialize two pointers:
   - `start = 0`
   - `end = nums.length - 1`
2. While `start <= end`:
   - Find middle index: `mid = (start + end) / 2`
   - If `nums[mid] == target`, return `mid`
   - If `nums[mid] < target`, move to right half: `start = mid + 1`
   - Else, move to left half: `end = mid - 1`
3. If target is not found, return `-1`.

## Complexity
- **Time Complexity:** O(log n) → Search space is halved in every step.
- **Space Complexity:** O(1) → No extra space is used.
