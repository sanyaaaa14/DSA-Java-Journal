# 🎓 **PROBLEM NAME**: Nearest Smaller to Left (NSL)

## 🎯 **What are we doing, really?**
💭 Imagine you're walking along a row of buildings, and at each building, you want to find the nearest building to your left that is shorter than the current one.

## 🧠 **CORE IDEA** = 🔍 **Finding Nearest Smaller Element to the Left**

For each building (or element):
- **Go left** until you find a smaller building (element).
- If no smaller building is found, mark it as **-1**.

Then:


result[i] = Nearest Smaller Element to the Left of arr[i]
## 🧩 **🔓 MEMORY TRICK (STICKY FORMULA)**:
📏 "**NSL = Nearest Smaller Element to the Left**"  
Think of it as:  
📉 **“Find the closest smaller building to the left, or none at all!”**

---

## 🧱 **ANALOGY: Walking Along a Row of Buildings**
Imagine you're walking down a row of buildings (or elements):
- For each building, look leftwards to see if there's a smaller building (element).
- If found, that’s your answer; if not, the answer is **-1**.

---

## 🛠️ **BLUEPRINT TO CODE (WRITE THIS IN YOUR NOTEBOOK):**

1. **Use a stack** to store the buildings (or elements) as you move left to right. ✅  
2. **For each building**:  
   - While the stack is not empty and the building at the top of the stack is greater than or equal to the current building, pop it off. ✅  
   - If the stack is empty, mark **-1** (no smaller element found). Otherwise, set **result[i]** to the element at the top of the stack. ✅  
3. **Push the current building onto the stack** for future comparisons. ✅

### 🤖 **Use Stack to Maintain Order** (classic mono stack pattern!)

---

## 🧠 **BONUS RHYME (To Remember):**

```css
Scan from left to find smaller near,
If none exists, mark as -1 here.
Push the building, then move ahead,
Stack will help find the smaller ahead!
## ✅ **NOW YOU CAN WRITE CODE FROM MEMORY**:
- **Need stack** ✅  
- **Compare each element with the stack** ✅  
- **If no smaller element, return -1** ✅  
- **If a smaller element exists, return the top of the stack** ✅
