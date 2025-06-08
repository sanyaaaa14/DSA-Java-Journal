# 🧾 Delete Without Head Pointer (Singly Linked List)

## 📌 Problem Statement
You are given only a pointer/reference to a node (`del_node`) in a singly linked list. You **do not** have access to the head of the list. Your task is to delete the **value of this given node** from the linked list.

### ⚠️ Important Notes:
- You **cannot access the head** of the linked list.
- You can assume that the node to be deleted **is not the last node**.
- Only one node needs to be removed — the one you are given the reference to.
- You must maintain the **order** of nodes before and after the given node.

---

## 🧪 Examples

### Example 1:
**Input:**  
Linked List = `1 -> 2`, del_node = 1  
**Output:**  
`2`

### Example 2:
**Input:**  
Linked List = `10 -> 20 -> 4 -> 30`, del_node = 20  
**Output:**  
`10 -> 4 -> 30`

---

## 🧠 Method 1: Using Temporary Node

### 🔧 Logic:
This method uses a temporary pointer to store the next node. The value from the next node is copied into the current node, and the current node's `next` pointer is updated to skip over the temporary node — effectively removing it from the chain.

### 📌 Steps:
1. Create a temporary node: `temp = node.next`.
2. Copy `temp.data` into `node.data`.
3. Set `node.next = temp.next`.

### ⏱️ Time Complexity:
- **O(1)** — Constant time operation.

### 🧮 Space Complexity:
- **O(1)** — No extra space used.

---

## 🧠 Method 2: Making Inline Changes

### 🔧 Logic:
This is a more concise version that does not use an extra pointer. Instead, it directly modifies the current node by copying the `data` from the next node, and updates the `next` pointer to skip the next node.

### 📌 Steps:
1. Copy `node.next.data` into `node.data`.
2. Update `node.next = node.next.next`.

### ⏱️ Time Complexity:
- **O(1)** — Constant time operation.

### 🧮 Space Complexity:
- **O(1)** — No extra space used.

---

## ✅ Summary:
Both methods efficiently remove a node from the list **without needing the head**. The idea is to **overwrite the current node with the next node's data**, and **skip the next node**, which gives the appearance of deletion.

