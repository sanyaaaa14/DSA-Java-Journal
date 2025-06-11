# 📘 Introduction to Insertion Operations in Doubly Linked List (Java)

This document explains the different insertion-related methods used in the `doublyLinkedList` Java class. Each method is responsible for inserting nodes into a **Doubly Linked List (DLL)** in a specific way — including iterative and recursive approaches.

---

## 🔹 1. Insertion at Beginning  
### ➤ Function: `insertAtBeg(int data)`

This method inserts a new node at the **start** of the doubly linked list.

- If the list is empty, the new node becomes the head.
- Otherwise:
  - The new node's `next` is set to the current head.
  - The current head's `prev` is updated to the new node.
  - Finally, the head pointer is updated to the new node.

This ensures the new node becomes the first element in the list.

---

## 🔹 2. Insertion at End  
### ➤ Function: `insertAtEnd(int data)`

This method inserts a new node at the **end** of the doubly linked list.

- If the list is empty, the new node becomes the head.
- Otherwise:
  - It traverses the list until it reaches the last node.
  - Links the last node's `next` to the new node.
  - Sets the new node’s `prev` to point back to the last node.

This places the new node at the tail of the list.

---

## 🔹 3. Recursive Insertion at End  
### ➤ Function: `insertAtEndRecursively(int[] arr, int index, int size, Node back)`

This method inserts nodes **recursively at the end** from an array.

- Uses an index to keep track of the current array element.
- A `Node back` pointer is used to track the previous node.
- For each array element:
  - A new node is created.
  - Its `prev` is set to `back`.
  - Its `next` is assigned recursively.

Returns the head of the new list built from the array.

---

## 🔹 4. Recursive Insertion at Beginning  
### ➤ Function: `insertAtBegRecursively(int[] arr, int index, int size, Node front)`

This method inserts elements **recursively at the beginning** of the list using an array.

- Starts from the first element of the array and recursively builds the list.
- Each new node is inserted before the current `front`.
- Updates `next` of new node to point to the existing front.
- Updates `prev` of the front (if not null) to the new node.

Returns the new head of the constructed list.

---

## 🔹 5. Insertion at a Specific Position  
### ➤ Function: `insertAtMid(int data, int pos)`

This method inserts a node at a **specified index position** in the list.

- If `pos == 0`, behaves like insertion at the beginning.
- Otherwise:
  - Traverses the list until it reaches the node at `pos - 1`.
  - If the position is valid, the new node is inserted between `curr` and `curr.next`.
  - Both `next` and `prev` pointers are updated accordingly.

If the position is out of bounds (beyond the list length), an error message is printed.

---

## 🔹 6. Print Utility  
### ➤ Function: `print(Node head)`

Although not an insertion method, this function is used to **print** the current state of the doubly linked list.

- If the list is empty, it prints an appropriate message.
- Otherwise:
  - It starts from the head node.
  - Traverses forward and prints each node’s `data`.

Useful for visualizing insertions during testing.

---

## ✅ Summary

This module demonstrates the versatility of insertion in Doubly Linked Lists using Java. The use of both **iterative and recursive approaches** ensures a deeper understanding of:

- Dynamic node linking using `next` and `prev`.
- Index-based insertion logic.
- Recursive creation of doubly linked lists from arrays.

These functions lay a strong foundation for mastering doubly linked list manipulations.
