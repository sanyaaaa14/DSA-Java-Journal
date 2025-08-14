# Reverse String

## Intuition
The goal is to reverse the characters in the given array in-place without using extra memory for another array. The most efficient approach is to swap characters from the start and end, moving towards the center.

## Approach
1. Use two pointers:
   - **Left pointer** starts at the beginning of the array.
   - **Right pointer** starts at the end of the array.
2. Swap the characters at the left and right positions.
3. Move the left pointer forward and the right pointer backward.
4. Repeat until the two pointers meet or cross.

## Complexity
- **Time Complexity:** `O(n)` — Each element is visited at most once.
- **Space Complexity:** `O(1)` — Only a few variables are used for swapping.
