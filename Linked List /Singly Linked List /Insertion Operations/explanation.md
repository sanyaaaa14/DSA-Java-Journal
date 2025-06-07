# 🧠 Explanation: Insertion Operations in Singly Linked List

This document explains the purpose, time complexity, and space complexity of each insertion-related function in the Singly Linked List implementation.

---

## 🔹 insertAtBeg(int data)

### ➤ What it Does:
Inserts a new node at the **beginning** of the linked list.

### 🕒 Time Complexity:
O(1) — constant time as it only involves pointer adjustment.

### 💾 Space Complexity:
O(1) — only one new node is created.

---

## 🔹 insertAtEnd(int data)

### ➤ What it Does:
Inserts a new node at the **end** of the linked list by traversing to the last node and appending the new node.

### 🕒 Time Complexity:
O(n) — requires traversal to the end of the list.

### 💾 Space Complexity:
O(1) — only one node is added; no extra space used.

---

## 🔹 insertAtMid(int data, int x)

### ➤ What it Does:
Inserts a new node **after the x-th node** (1-based index) in the list.

### 🕒 Time Complexity:
O(n) — traverses up to the x-th node.

### 💾 Space Complexity:
O(1) — no extra space except the new node.

---

## 🔹 insertAtBegRecursively(int[] arr, int index, int size, Node prev)

### ➤ What it Does:
Recursively inserts elements from an array at the **beginning**, resulting in a reversed linked list.

### 🕒 Time Complexity:
O(n) — one recursive call per element.

### 💾 Space Complexity:
O(n) — due to recursion stack and node creation.

---

## 🔹 insertAtEndRecursively(int[] arr, int index, int size)

### ➤ What it Does:
Recursively inserts array elements at the **end**, preserving the original order.

### 🕒 Time Complexity:
O(n) — one recursive call per element.

### 💾 Space Complexity:
O(n) — recursion uses call stack plus space for each new node.

---

## 🔹 print(Node head)

### ➤ What it Does:
Prints the elements of the linked list from head to tail.

### 🕒 Time Complexity:
O(n) — traverses the entire list.

### 💾 Space Complexity:
O(1) — uses only a temporary pointer for traversal.

---

## 🔹 main(String[] args)

### ➤ What it Does:
Demonstrates the use of above functions by:
- Inserting an array of values at the end
- Inserting a value in the middle
- Printing the final linked list

---

## ✅ Summary

These functions together provide a comprehensive understanding of insertion operations in a singly linked list. They cover both **iterative and recursive** approaches and help compare insertion performance at different positions within the list.

