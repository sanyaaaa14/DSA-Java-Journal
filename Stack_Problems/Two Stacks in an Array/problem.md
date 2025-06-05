# 🧱 Two Stacks in One Array

## 📝 Problem Statement

Design a data structure to implement **two stacks using a single array** in a space-efficient manner. You must implement the following operations:

- `push1(int x)`: Pushes an integer `x` into Stack 1.
- `push2(int x)`: Pushes an integer `x` into Stack 2.
- `pop1()`: Removes and returns the top element from Stack 1. Returns `-1` if the stack is empty.
- `pop2()`: Removes and returns the top element from Stack 2. Returns `-1` if the stack is empty.

Both stacks should be able to grow dynamically toward each other without overlapping or exceeding the array boundary.

---

## 🔍 Constraints

- `1 ≤ number of queries ≤ 10⁴`
- `1 ≤ number of elements in the stack ≤ 100`
- The sum of the count of elements in both stacks is **strictly less than the size of the given array**

---

## 🧠 Intuition

The naive approach of dividing the array into two fixed halves may lead to wasted space if one stack grows more than the other. A more efficient solution allows both stacks to grow toward each other from opposite ends of the array. This ensures that unused space in one part of the array can be used by the other stack when needed.

- Stack 1 starts from the **beginning** of the array and grows **forward**.
- Stack 2 starts from the **end** of the array and grows **backward**.
- Insertions are allowed as long as `top1 + 1 < top2`.

---

## ⚙️ Approach

- Initialize two pointers:
  - `top1` at `-1` for Stack 1
  - `top2` at `size` for Stack 2
- For `push1`, increment `top1` and insert the element if there's space.
- For `push2`, decrement `top2` and insert the element if there's space.
- For `pop1`, return the element at `top1` and decrement the pointer.
- For `pop2`, return the element at `top2` and increment the pointer.
- Return `-1` if pop operations are attempted on empty stacks.

---

## ⏱️ Time & Space Complexity

| Operation | Time Complexity | Space Complexity |
|-----------|------------------|------------------|
| push      | O(1)             | O(n) (array size)|
| pop       | O(1)             | O(n)             |

All operations are performed in constant time, and both stacks share a single array of size `n`.

---

## 🧩 Key Concepts

- Dual pointer technique
- Space-efficient data structures
- Stack simulation using arrays
- Boundary condition handling

---

## 📌 Use Cases

This approach is commonly used in:

- Memory-constrained environments (embedded systems)
- Competitive programming challenges
- Low-level system implementations

It’s an excellent example of optimizing data structures to maximize available resources without sacrificing performance.

