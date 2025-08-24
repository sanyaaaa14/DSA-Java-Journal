# Problem: Missing Number

## Intuition 1 (Sorting)
The simplest way to solve this problem is:
1. Sort the array.
2. Traverse the sorted array and check for the first index where the number does not match the index value.
3. That index will be the missing number.
4. If all indices match, then the missing number is `n`.

However, this approach requires sorting, which takes **O(n log n)** time.

---

## Intuition 2 (Optimal Using Sum Formula)
A more efficient solution comes from the observation that the sum of numbers from `0` to `n` can be directly calculated using the formula:  
\[
\text{totalSum} = \frac{n \times (n+1)}{2}
\]  

The missing number is simply the difference between the `totalSum` and the sum of the elements present in the array.

---

## Approach
1. Calculate the expected sum (`totalSum`) of numbers from `0` to `n`.
2. Calculate the sum of all elements in the array (`partialSum`).
3. The missing number is `totalSum - partialSum`.
4. Return the result.

---

## Complexity
- **Sorting Approach:**  
  - Time Complexity: `O(n log n)`  
  - Space Complexity: `O(1)`  

- **Optimal Sum Formula Approach:**  
  - Time Complexity: `O(n)` (traversing array once)  
  - Space Complexity: `O(1)` (constant extra space)  
