# 🧹 Introduction to Delete Operations in Doubly Linked List (Java)

This document provides detailed explanations of various **deletion operations** performed on a Doubly Linked List using Java. The deletion logic covers edge cases like empty lists, single-node lists, and deletion from any position.

---

## 🔹 1. Deletion at Beginning  
### ➤ Function: `deleteAtBeg()`

This method removes the first node from the doubly linked list.

- **If the list is empty**, it prints an appropriate message.
- **If there's only one node**, it deletes it and sets `head` to `null`.
- **If multiple nodes exist**:
  - Prints the data of the node being deleted.
  - Moves the head pointer to the second node.
  - Sets the new head’s `prev` to `null`.

This effectively removes the first node and maintains DLL integrity.

---

## 🔹 2. Deletion at End  
### ➤ Function: `deleteAtEnd()`

This method deletes the last node from the list.

- **If the list is empty**, it prints a message.
- **If there is only one node**, it removes it by setting `head = null`.
- **If there are multiple nodes**:
  - Traverses the list to the last node.
  - Prints the data of the deleted node.
  - Updates the `next` of the second last node to `null`.
  - Optionally nullifies the `prev` reference of the deleted node.

Removes the tail node while ensuring the DLL remains connected.

---

## 🔹 3. Deletion at a Specific Position  
### ➤ Function: `deleteAtPosition(int pos)`

Deletes a node at a given **position (1-based index)** in the list.

- **If position is 1**, it behaves like `deleteAtBeg()`:
  - Deletes the head node.
  - Adjusts the head pointer.
- **If the position is in the middle or end**:
  - Traverses the list until reaching the desired node.
  - If deleting the last node:
    - Removes it by updating the previous node’s `next` to `null`.
  - If deleting a middle node:
    - Links the previous node’s `next` to the next node.
    - Updates the next node’s `prev` to point to the previous node.
  - Prints the data of the deleted node.

Ensures correct pointer adjustments for safe node removal.

---

## 🔹 4. Print Utility  
### ➤ Function: `print(Node head)`

This method is used to print the elements of the list.

- If the list is empty, it prints a message.
- Otherwise:
  - Iterates from the head and prints each node’s data.

Useful for verifying deletion results and overall list status.

---

## ✅ Summary

This section demonstrates multiple strategies to safely **delete nodes** in a Doubly Linked List. Whether deleting from the head, tail, or a specific position, all operations:

- Maintain bidirectional links
- Handle edge cases gracefully
- Provide clear console output for testing and debugging

Mastering these operations is crucial for efficient list manipulation in Java.
