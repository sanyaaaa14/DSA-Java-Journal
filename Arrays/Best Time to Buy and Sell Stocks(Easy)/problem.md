# Best Time to Buy and Sell Stock – Solution

## Intuition
The goal is to find the maximum profit by buying and selling the stock once.  
We can track the **minimum price so far** and calculate potential profit for each day, updating the maximum profit accordingly.

---

## Approach
1. Initialize:
   - `min` as the first element in the `prices` array.
   - `maxprofit` as 0.
2. Loop through each day's price:
   - Update `min` to be the smaller value between `min` and the current day's price.
   - Calculate the profit for the current day as `prices[i] - min`.
   - Update `maxprofit` if the calculated profit is greater than the current `maxprofit`.
3. Return `maxprofit` at the end.

---

## Complexity
- **Time Complexity:**  
  **O(n)** — We only iterate through the array once.
  
- **Space Complexity:**  
  **O(1)** — No extra data structures are used apart from a few variables.

---

## Dry Run Example
**Input:**  
`prices = [7, 1, 5, 3, 6, 4]`

**Execution:**
- Start: `min = 7`, `maxprofit = 0`
- Day 1: price = 7 → min = 7 → profit = 0 → maxprofit = 0  
- Day 2: price = 1 → min = 1 → profit = 0 → maxprofit = 0  
- Day 3: price = 5 → min = 1 → profit = 4 → maxprofit = 4  
- Day 4: price = 3 → min = 1 → profit = 2 → maxprofit = 4  
- Day 5: price = 6 → min = 1 → profit = 5 → maxprofit = 5  
- Day 6: price = 4 → min = 1 → profit = 3 → maxprofit = 5  

**Output:** `5`
