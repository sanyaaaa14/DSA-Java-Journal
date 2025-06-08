# 📄 Deletion Operations in Singly Linked List

This document explains the basic deletion operations implemented on a **Singly Linked List** in Java. Each function removes a node from a different position: **beginning**, **end**, or a **specified middle position**.

---

## 🧹 `deleteAtBeg()`: Delete Node at the Beginning

### ✅ What it does:
Removes the first node (head) of the linked list.

### 🔍 How it works:
1. If the list is empty (`head == null`), it prints a message.
2. Otherwise:
   - Stores the current `head` in a temporary node.
   - Updates `head` to `head.next` (i.e., moves the head pointer).
   - Prints the data of the deleted node.

### ⏱ Time Complexity:
- **O(1)** — Constant time operation.

### 💾 Space Complexity:
- **O(1)** — No extra space used.

---

## 🧹 `deleteAtEnd()`: Delete Node at the End

### ✅ What it does:
Removes the last node in the linked list.

### 🔍 How it works:
1. If the list is empty (`head == null`), prints a message.
2. If the list has only one node (`head.next == null`):
   - Deletes the only node by setting `head = null`.
3. For lists with more than one node:
   - Iterates using a temporary pointer until it reaches the **second-last node** (`temp.next.next != null`).
   - Deletes the last node by setting `temp.next = null`.
   - Prints the data of the deleted node.

### ⏱ Time Complexity:
- **O(n)** — Needs to traverse the list to find the second-last node.

### 💾 Space Complexity:
- **O(1)** — No extra space used.

---

## 🧹 `deleteAtMid(int x)`: Delete Node at Position x (1-based index)

### ✅ What it does:
Removes the node at a specific position `x` in the linked list (1-based index).

### 🔍 How it works:
1. If the list is empty, prints a message.
2. If position is 1, behaves like `deleteAtBeg()`:
   - Deletes the head and updates the pointer.
3. Otherwise:
   - Uses a loop to iterate and keep track of the current and previous nodes.
   - Stops at the `(x-1)`th node so that `prev` points to the node before the one to be deleted.
   - If `curr` becomes null before reaching the desired position, it means the position is invalid.
   - Otherwise, bypasses the node to delete using `prev.next = curr.next`.

### ⏱ Time Complexity:
- **O(x)** — Traverses up to the `x`th node.

### 💾 Space Complexity:
- **O(1)** — No extra space used.

---

## 🧪 Example Use in `main()`

```java
int[] arr = {2, 3, 4, 5, 6, 7};
// Insert elements into the list
for(int i = 0; i < arr.length; i++){
    insertAtEnd(arr[i]);
}
// Delete node at position 0 (invalid case)
deleteAtMid(0);

