## 📊 Largest Rectangle in Histogram — Monotonic Stack Solution

### 🧠 Intuition
To determine the largest rectangle in a histogram, we need to find how far each bar can extend to the **left** and **right** before encountering a smaller bar. By doing this, we can calculate the maximum area where each bar serves as the smallest bar in a rectangle.

---

### ⚙️ Approach
1. Use a **monotonic increasing stack** to find the **next smaller element to the right** of each bar.
2. Use another pass (right to left) to find the **previous smaller element to the left**.
3. For each bar at index `i`, compute:
   - `width = right[i] - left[i] - 1`
   - `area = heights[i] * width`
4. Track and return the maximum area found.

---

### ⏱️ Complexity
- **Time Complexity**: `O(n)`  
  Each bar is pushed and popped from the stack at most once in both passes.
  
- **Space Complexity**: `O(n)`  
  Additional space for `left`, `right`, and the stack.

---
