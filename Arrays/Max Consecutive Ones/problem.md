# Problem: Max Consecutive Ones

## Intuition
The task is to find the longest streak of consecutive `1`s in a binary array.  
A simple way to solve this is by keeping track of the current count of `1`s and updating the maximum whenever a `0` is encountered.

## Approach
1. Initialize two variables:
   - `currcount` → to keep track of the current consecutive `1`s.
   - `maxcount` → to store the maximum consecutive `1`s found so far.
2. Traverse the array:
   - If the element is `1`, increment `currcount`.
   - If the element is `0`, update `maxcount` with the maximum of `maxcount` and `currcount`, then reset `currcount` to `0`.
3. After the loop, perform one last check to ensure any streak ending at the last index is considered.
4. Return the maximum between `maxcount` and `currcount`.

## Complexity
- **Time Complexity:** `O(n)` → The array is traversed once.
- **Space Complexity:** `O(1)` → Only a few extra variables are used.
