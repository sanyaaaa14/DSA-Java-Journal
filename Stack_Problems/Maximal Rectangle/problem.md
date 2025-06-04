# 🧱 Maximal Rectangle — Convert Matrix to Histogram + Monotonic Stack

🧠 **Intuition**  
The idea is to treat each row of the binary matrix as the base of a histogram.  
If we maintain a running height of `1`s for each column, we can reduce the problem to finding the **Largest Rectangle in Histogram** for each row.  
This way, we repeatedly apply a known pattern to find the maximal area using a **monotonic stack**.

---

⚙️ **Approach**
- Traverse each row of the matrix.
- For each column:
  - If the cell is `'1'`, increment the height at that column.
  - If the cell is `'0'`, reset the height to 0.
- After each row update, apply the **Largest Rectangle in Histogram** algorithm:
  - Use a **monotonic increasing stack** to find the next smaller element to the left and right.
  - For every bar, compute the width and area:
    ```
    width = right - left - 1
    area = height * width
    ```
  - Track the maximum area encountered so far.

---

⏱️ **Complexity**
- **Time Complexity:** O(m × n)  
  - We process each cell once and calculate the histogram-based max area in O(n) per row.
  
- **Space Complexity:** O(n)  
  - Stack and height array use extra space proportional to the number of columns.

---

🧩 **Key Concepts Used**
- Matrix to Histogram transformation
- Monotonic Stack
- Largest Rectangle in Histogram pattern

---

📌 **Use Case**  
This approach is efficient for problems involving rectangular area detection in binary grids, such as:
- Image processing
- Grid-based DP problems
- Land or building area analysis

---
