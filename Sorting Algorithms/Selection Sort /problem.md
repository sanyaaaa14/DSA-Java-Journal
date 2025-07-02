# 📚 Selection Sort – Step-by-Step Explanation

## 🚀 Problem Statement
Sort an array of integers in ascending order using the **Selection Sort** algorithm.

---

## 💡 Intuition
The idea behind Selection Sort is simple:
- Repeatedly find the **minimum element** from the unsorted part of the array.
- Swap it with the **first unsorted element**.
- Gradually, the left side of the array becomes sorted.

---

## 🛠️ Approach

1. **Start from the first element** and consider it the minimum.
2. **Traverse the rest of the array** to find the actual minimum.
3. **Swap the found minimum** with the first unsorted element.
4. Move to the next position and **repeat** until the array is sorted.

---

## 🔁 Example: int[] arr = {64, 25, 12, 22, 11};

Input:  
## 🔁 Iterations (Selection Sort Step-by-Step)

### i = 0
- Minimum in `[64, 25, 12, 22, 11]` is **11** at index **4**  
- Swap `arr[0]` and `arr[4]`  
- 🔁 Array becomes: `[11, 25, 12, 22, 64]`

---

### i = 1
- Minimum in `[25, 12, 22, 64]` is **12** at index **2**  
- Swap `arr[1]` and `arr[2]`  
- 🔁 Array becomes: `[11, 12, 25, 22, 64]`

---

### i = 2
- Minimum in `[25, 22, 64]` is **22** at index **3**  
- Swap `arr[2]` and `arr[3]`  
- 🔁 Array becomes: `[11, 12, 22, 25, 64]`

---

### i = 3
- Minimum in `[25, 64]` is **25** at index **3**  
- ✅ No swap needed

---

### ✅ Sorted Output:

[11, 12, 22, 25, 64]



## ⏱️ Complexity

| Resource | Complexity |
|----------|------------|
| Time     | O(n²)      |
| Space    | O(1)       |

- **Time**: Two nested loops → quadratic time  
- **Space**: In-place sorting → no extra space used

---

## ✅ Summary

- ✅ Simple and intuitive  
- ❌ Not suitable for large datasets (O(n²))  
- ✅ In-place (no extra space)  
- ✅ Stable if implemented carefully *(not this version)*  

