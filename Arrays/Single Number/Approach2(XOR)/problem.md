# Problem: Single Number

## Intuition  
The key observation is the property of the **XOR operation**:  
- `a ^ a = 0`  
- `a ^ 0 = a`  

Since every number except one appears twice, performing XOR across all numbers will cancel out the duplicates and leave only the unique number.  

This is much more efficient compared to the HashMap approach.

---

## Approach  
1. Initialize a variable `xor = 0`.  
2. Traverse the array:  
   - Update `xor = xor ^ nums[i]`.  
3. At the end of the loop, `xor` will contain the unique number.  

---

## Complexity  
- **Time Complexity:** `O(n)`  
  - We iterate through the array once.  
- **Space Complexity:** `O(1)`  
  - No extra data structure is needed.  
