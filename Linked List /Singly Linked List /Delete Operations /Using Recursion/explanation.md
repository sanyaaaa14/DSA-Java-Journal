# 🧾 Deletion of xth Node in a Singly Linked List (Using Recursion)

## 📌 Problem Statement
You are given a singly linked list and an integer **x**. Your task is to **delete the xth node** (1-based indexing) from the list.

### 📥 Input Examples:
- Linked List: `1 → 3 → 4`, x = 3  
  ✅ Output: `1 → 3`

- Linked List: `1 → 5 → 2 → 9`, x = 2  
  ✅ Output: `1 → 2 → 9`

### 📋 Constraints:
- The size of the linked list is between **2** and **1,000,000**
- `1 ≤ x ≤ size of the linked list`

---

## 🧠 How It Works

### 💡 What It Does:
This approach removes the xth node from the linked list using a **recursive function**. It simplifies the problem by working its way down the list until the target position is reached, then adjusts the links as the recursion unwinds.

### 🔍 Step-by-Step Logic:
- **Base Case:**  
  If the current position is 1, it means we are at the node to delete.  
  ➡️ Simply return the next node, effectively removing the current one.

- **Recursive Case:**  
  If not at the xth position, continue moving forward by recursively calling the function on the next node with `x - 1`.  
  🔄 Once the deletion is done deeper in the call stack, the function links the current node back to the updated next node.

---

## ⏱️ Time Complexity:
- **O(n)** — In the worst case, the recursion goes through `x` nodes to find the one that needs to be deleted.

## 🧮 Space Complexity:
- **O(x)** — Each recursive call uses stack space. In the worst case, depth of recursion is `x`.

---

## ✅ Summary:
This recursive method is a clean and elegant way to delete a node at a given position in a singly linked list. By thinking in terms of smaller subproblems and adjusting pointers on the way back, the solution is both concise and efficient within the given constraints. 🔁🧩


