# Problem: Binary to Decimal Conversion

## Intuition
A binary number contains only `0` and `1`.  
To convert it into decimal, we process each digit from left to right.

For every new binary digit:
- Multiply the current result by `2` (shift left in binary).
- Add the current digit (`0` or `1`).

This works because each step moves the previous digits to the next power of 2 position.

Example: `1011`

- Start with `0`
- `0 * 2 + 1 = 1`
- `1 * 2 + 0 = 2`
- `2 * 2 + 1 = 5`
- `5 * 2 + 1 = 11`

So, decimal value = `11`.

## Approach
1. Initialize `decimal = 0`.
2. Traverse the binary string from left to right.
3. For each character:
   - Convert character to digit using `charAt(i) - '0'`.
   - Update result: `decimal = decimal * 2 + digit`
4. Return `decimal`.

## Complexity
- **Time Complexity:** O(n) → We traverse the string once.
- **Space Complexity:** O(1) → Only one variable is used.
