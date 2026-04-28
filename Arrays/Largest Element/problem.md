# Problem: Find Largest Element in Array

## Intuition
To find the largest element in an array, we compare all elements and keep track of the maximum value seen so far.

- Start with the smallest possible integer value.
- Traverse the array one by one.
- If the current element is greater than the stored maximum, update it.
- After the loop, the stored value will be the largest element.

Example:

Array = `[3, 8, 2, 15, 6]`

- Start with smallest value
- Compare with 3 → largest = 3
- Compare with 8 → largest = 8
- Compare with 2 → no change
- Compare with 15 → largest = 15
- Compare with 6 → no change

Final answer = `15`

## Approach
1. Initialize `lar` with `Integer.MIN_VALUE`.
2. Traverse the array from index `0` to `arr.length - 1`.
3. If current element is greater than `lar`, update `lar`.
4. Return `lar` after traversal.

## Complexity
- **Time Complexity:** O(n) → We traverse the array once.
- **Space Complexity:** O(1) → Only one extra variable is used.
