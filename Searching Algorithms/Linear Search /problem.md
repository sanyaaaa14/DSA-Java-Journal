# Problem: Linear Search in Array

## Intuition
To find an element in an array, the simplest approach is to check each element one by one.

- If the current element matches the target value, return its index.
- If the loop ends without finding the target, return `-1`.

This method is called **Linear Search** because we traverse the array in a linear sequence from start to end.

Example:

Array = `[4, 2, 7, 9, 5]`, Target = `7`

- Check index 0 → 4 ❌
- Check index 1 → 2 ❌
- Check index 2 → 7 ✅

Return `2`

## Approach
1. Traverse the array from index `0` to `arr.length - 1`.
2. Compare each element with `x`.
3. If a match is found, return the current index.
4. If no match is found after traversal, return `-1`.

## Complexity
- **Time Complexity:** O(n) → In worst case, we may check all elements.
- **Space Complexity:** O(1) → No extra space is used.
