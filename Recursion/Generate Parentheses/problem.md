# Generate Parentheses – Explanation

## Problem Statement

Given an integer `n`, generate all combinations of well-formed parentheses consisting of `n` pairs of opening and closing brackets.

## Approach

We use **backtracking** to build valid combinations of parentheses. The recursive function adds `(` or `)` step-by-step under certain constraints to ensure the generated string is valid.

## Key Concepts

- A valid parentheses string has:
  - The **number of opening `(` brackets equal to `n`**.
  - The **number of closing `)` brackets also equal to `n`**.
  - At no point should the number of closing brackets exceed the number of opening ones.

## Parameters Used in Recursion

- `n`: Number of pairs of parentheses required.
- `left`: Number of `(` used so far.
- `right`: Number of `)` used so far.
- `temp`: Current string formed.
- `a`: Result list collecting valid combinations.

## Recursive Strategy

1. **Base Case:**
   - If the total number of brackets (`left + right`) equals `2 * n`, then:
     - Add the current string to the result list.

2. **Recursive Cases:**
   - If `left < n`: We can still add a `(` bracket.
   - If `right < left`: We can add a `)` bracket only if there are unmatched `(` brackets to balance.

## Example (n = 2)

Step-by-step recursion might look like:

- `(` → `((`
- `(())` ✅
- `()` → `()(` → `()()` ✅

Valid outputs:  
- `"(())"`  
- `"()()"`

## Time and Space Complexity

- **Time Complexity:** `O(2^2n)` in the worst case (due to binary choices), though pruning reduces unnecessary paths.
- **Space Complexity:** `O(2^n * n)` — for storing all combinations (each of length `2n`).

## Summary

This approach ensures that only valid strings are built during the recursion, avoiding the need to validate them afterward. It’s efficient and elegant for problems involving constraints and combinations.
