# 📄 Intersection Point in Y-Shaped Linked Lists (Optimized Approach)

---

## 🔍 Problem Statement

Given two **Y-shaped singly linked lists**, where the two lists merge at a certain node and share the rest of the nodes from that point onward, find the **intersection point** of the two linked lists.

---

## ✅ Constraints

- The two linked lists are singly linked.
- The lists intersect at one point only (if they do).
- After the intersection point, the nodes are common to both lists.
- No extra space allowed.
- Time Complexity must be linear, i.e., **O(N + M)**.

---

## 💡 Optimized Approach Using Floyd’s Cycle Detection

### 🧠 Core Idea

We temporarily convert the problem into a **cycle detection problem** using **Floyd's Tortoise and Hare Algorithm**:

1. **Join the end of the first list to its head**, forming a cycle.
2. Now, the intersection point (if any) becomes the **starting point of the loop** when traversing from the second list.
3. Apply Floyd’s Cycle Detection on the second list to find the meeting point.
4. Reset one pointer to the head of the second list and move both pointers one step at a time to find the **starting node of the loop**, which is the **intersection node**.
5. This method uses **no extra space** and is done in **O(N + M)** time.
6. **Restore the original list structure** after detecting the intersection (not done in this code, but should be if modifying input is not allowed).

---

## 🧪 Example Test Case

List1: 1 → 2 → 3

6 → 7
/
List2: 4 → 5

- The two linked lists merge at node with value `6`.
- The nodes `6` and `7` are **shared** by both lists after the intersection point.
- Expected output: **6**

---

## 🛠 Time and Space Complexity

- **Time Complexity:** O(N + M)  
- **Space Complexity:** O(1)

---

## 🔄 Key Points Recap

- This approach uses Floyd’s Tortoise and Hare algorithm in a creative way to detect intersection without extra space.
- Works in linear time.
- **Only applicable** when modifying list temporarily is allowed.

---
