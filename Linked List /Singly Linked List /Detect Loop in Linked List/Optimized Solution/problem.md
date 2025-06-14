# 🧠 Detect Loop in Linked List (Floyd’s Cycle Detection)

## 📌 Problem Statement

You are given the head of a singly linked list.  
Determine whether the list contains a **cycle** (loop).

A cycle exists if, by continuously moving from one node to the next, you eventually visit a node you’ve already seen.

---

## 💡 Optimized Solution – Floyd’s Cycle Detection Algorithm (Tortoise and Hare)

This method uses **two pointers**:
- `slow` pointer moves **one step** at a time.
- `fast` pointer moves **two steps** at a time.

### 🔁 Working Principle
If there is a **loop**, `fast` and `slow` will eventually meet inside the loop.  
If there's **no loop**, the `fast` pointer will reach the end of the list (`null`).

---

## ✅ Why This Works

- In a loop, the fast pointer "laps" the slow pointer, causing them to meet.
- This approach does not require extra space, making it highly efficient.

---

## 📊 Time & Space Complexity

| Complexity | Value |
|------------|-------|
| Time       | O(n)  |
| Space      | O(1)  |

---

## 🚀 Advantages

- Most **optimal solution** for loop detection.
- Does **not use extra space** like a HashSet or ArrayList.
- Commonly asked in technical interviews.

---

## 📎 Related Concepts

- **Two-pointer technique**
- **Cycle detection**
- **Linked list traversal**

