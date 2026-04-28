# Problem: Check Prime Number

## Intuition
A prime number is a number greater than 1 that has exactly two factors: 1 and itself.

To determine whether a number is prime:
- If the number is less than or equal to 1, it cannot be prime.
- Otherwise, check if it is divisible by any number from 2 up to the square root of the number.
- If it is divisible by any of these numbers, it is not prime.
- If no divisor is found, the number is prime.

The reason we check only up to √n is because if `n = a × b`, then at least one of the factors must be less than or equal to √n.

## Approach
1. If `n <= 1`, return `false`.
2. Loop from `i = 2` to `i <= √n`:
   - If `n % i == 0`, return `false` because `i` is a divisor.
3. If no divisor is found after the loop, return `true`.

## Complexity
- **Time Complexity:** O(√n) → We check divisors only up to the square root of `n`.
- **Space Complexity:** O(1) → No extra space is used.
