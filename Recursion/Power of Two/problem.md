# Problem: Power of Two

## Intuition
A number is a power of two if it can be repeatedly divided by 2 until it reduces to 1.  
- For example:  
  - 8 → 8/2 = 4 → 4/2 = 2 → 2/2 = 1 ✅ (power of two)  
  - 12 → 12/2 = 6 → 6/2 = 3 (not divisible by 2 anymore) ❌ (not power of two)  

So the main idea is:  
- Keep dividing the number by 2.  
- If it reaches 1 → return `true`.  
- If it becomes odd (other than 1) or less than 1 → return `false`.  

## Approach
1. **Base Case**: If `n == 1`, return `true` since 1 = 2⁰.  
2. If `n < 1` or `n % 2 != 0`, return `false` (not a valid power of two).  
3. Otherwise, recursively divide `n` by 2 until the base case is reached.  

## Complexity
- **Time Complexity**:  
  Each recursive step divides `n` by 2 → about `log₂(n)` steps.  
  So, **O(log n)**.  

- **Space Complexity**:  
  Due to recursion stack, **O(log n)**.  

## Example
Input: `n = 16`  
Process: 16 → 8 → 4 → 2 → 1 ✅  
Output: `true`

Input: `n = 18`  
Process: 18 → 9 (odd, not power of two) ❌  
Output: `false`
