# Problem: Decimal to Binary Conversion

## Intuition
A decimal number can be converted to binary by repeatedly dividing the number by `2` and storing the remainders.

- If the remainder is `0`, the binary digit is `0`.
- If the remainder is `1`, the binary digit is `1`.

The first remainder gives the least significant bit, so the digits are collected in reverse order and then reversed at the end.

Example: `13`

- 13 % 2 = 1
- 6 % 2 = 0
- 3 % 2 = 1
- 1 % 2 = 1

Collected digits: `1011` (in reverse order: `1101`)  
Final binary = `1101`

## Approach
1. If `n == 0`, return `"0"`.
2. Create a `StringBuilder` to store binary digits.
3. While `n > 0`:
   - Append `n % 2` (remainder).
   - Divide `n` by `2`.
4. Reverse the string because digits were added from least significant to most significant.
5. Return the final binary string.

## Complexity
- **Time Complexity:** O(log n) → Number of divisions by 2.
- **Space Complexity:** O(log n) → Space used to store binary digits.
