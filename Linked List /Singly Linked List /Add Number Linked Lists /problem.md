# ➕ Add Two Numbers Represented by Linked Lists

---

## 🧩 Problem Statement

Given two numbers represented by two singly linked lists, where each node contains a single digit, the digits are stored in **forward order**. Write a function that adds the two numbers and returns the sum as a linked list, **also in forward order**.

---

## 📘 Input Format

- Two singly linked lists:
  - `first`: Head of the first list
  - `second`: Head of the second list
- Each node contains a single digit.
- The digits are stored in forward order (most significant digit first).

---

## 🎯 Output Format

- A singly linked list representing the sum of the two input numbers, stored in forward order.

---

## 🧠 Approach Explanation

### 🔁 Step-by-Step Logic

1. **Reverse both input linked lists** using a recursive function `reverse(curr, prev)` to make addition easier (as in normal math addition from least significant digit).
2. **Add digits** from both reversed lists node by node:
   - Create a new node for each digit of the result.
   - Handle carry generated from the addition.
3. If one list is longer, continue adding remaining digits with the carry.
4. If there's a leftover carry at the end, create a new node for it.
5. **Reverse the result list back** to restore forward order.
6. Remove any **leading zeros** unless the result is a single node (e.g., result of adding `0 + 0`).

---


### 🧪 Example Test Case

**List 1:**  
`6 → 1 → 7`  (represents 617)  

**List 2:**  
`2 → 9 → 5`  (represents 295)  

**Output:**  
`9 → 1 → 2`  (represents 912)

---

## ⏱ Time and Space Complexity

- **Time Complexity:** O(max(N, M)), where N and M are lengths of the two linked lists.
- **Space Complexity:** O(max(N, M)) for the result list.

---

## ⚙️ Key Functions

- `reverse(Node curr, Node prev)`: Recursively reverses the linked list.
- `addTwoLists(Node first, Node second)`: Handles the full addition logic using reversed input and output.

---

## ⚠️ Notes

- Leading zeros are trimmed using a simple loop at the end.
- A dummy head node (`head = new Node(0)`) is used to simplify list building.

---
