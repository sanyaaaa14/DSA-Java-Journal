# Problem: Single Number

## Intuition  
At first glance, we notice that every number appears twice except for one.  
A simple way to solve this is to use a **HashMap** to keep track of the frequency of each number.  
- Numbers that appear twice will have a count of 2.  
- The number that appears only once will have a count of 1.  

Once we have the frequency map, we can loop through it and return the number with frequency `1`.

> ⚡ There’s also an optimal solution using **XOR** (since `a ^ a = 0` and `a ^ 0 = a`), but here we’re focusing on the HashMap approach.

---

## Approach  
1. Create a HashMap to store each number and its frequency.  
2. Iterate over the array:  
   - Add the number to the map.  
   - Increase its count using `getOrDefault()`.  
3. Iterate through the map’s keys:  
   - Return the number whose count is `1`.  
4. If no such number exists (edge case), return `-1`.

---

## Complexity  
- **Time Complexity:** `O(n)`  
  - One pass to build the frequency map (`O(n)`).  
  - One pass to find the unique element (`O(n)` in worst case).  
- **Space Complexity:** `O(n)`  
  - Extra space for storing frequency of numbers in HashMap.
