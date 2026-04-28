# Problem: Factorial of a Number

## Intuition
The factorial of a number `n` is the product of all positive integers from `1` to `n`.

It is represented as:

- `n! = n × (n-1) × (n-2) × ... × 2 × 1`

Special cases:
- `0! = 1`
- `1! = 1`

To calculate factorial iteratively, we can multiply numbers from `1` to `n` and store the result.

Example: `5!`

- 1 × 2 = 2
- 2 × 3 = 6
- 6 × 4 = 24
- 24 × 5 = 120

So, `5! = 120`

## Approach
1. If `n == 0` or `n == 1`, return `1`.
2. Initialize a variable `f = 1`.
3. Loop from `1` to `n`:
   - Multiply `f` by current number.
4. Return `f`.

## Complexity
- **Time Complexity:** O(n) → We multiply numbers from `1` to `n`.
- **Space Complexity:** O(1) → Only one extra variable is used.
