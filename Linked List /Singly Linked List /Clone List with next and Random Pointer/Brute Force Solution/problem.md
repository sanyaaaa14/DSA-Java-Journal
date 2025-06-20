# 🧬 Clone a Linked List with Next and Random Pointers (Brute Force)

## 📘 Problem Statement

Given a **linked list** where each node contains:
- `next` pointer to the next node in the list.
- `random` pointer that can point to any node in the list (including `null`).

Your task is to **deep clone** the linked list such that the new list is a completely separate copy of the original list with both `next` and `random` pointers correctly assigned.

---

## 🔧 Approach: Brute Force using `find()` Traversal

This approach makes **two passes** over the original list:
1. **First Pass**: Clone the data and build a new linked list using only the `next` pointers.
2. **Second Pass**: For every node in the new list, match the `random` pointer by **traversing the original list** and finding the corresponding node using a helper `find()` function.

---

## 🔎 Helper Method: `find(Node head, Node headCopy, Node x)`

- This function finds the node in the `headCopy` list which corresponds to node `x` in the original `head` list.
- Both lists are traversed simultaneously until `curr1 == x`.
- At that point, `curr2` is the corresponding node in the copied list.

---

## 🛠️ Steps

1. **Clone Node Data:**
   - Traverse the original list `temp` and create new nodes with same data.
   - Link them using `next` pointers and maintain a dummy `headcopy`.

2. **Clone Random Pointers:**
   - Traverse original list (`temp`) and the new list (`tailcopy`) together.
   - Use `find()` to get the corresponding random node for `temp.random`.
   - Assign it to `tailcopy.random`.

---

## 💡 Example


### 🔍 Interpretation:
- `1` → next → `2`, random → `3`
- `2` → next → `3`, random → `1`
- `3` → next → `null`, random → `2`

---

## 💡 Approach: Brute Force Using Extra Traversal

This approach works in two passes:

### ✅ Step 1: Clone Next Pointers
- Traverse the original list and clone the nodes with the same data.
- Link them using only the `next` pointers.
- This creates a shallow copy of the list.

### ✅ Step 2: Assign Random Pointers
- For every node in the original list, find the node it points to via `random`.
- Use a helper method `find()` to get the corresponding node in the cloned list.
- This requires an O(n) traversal for each node → making the total O(n²).

---

## 📎 Helper Function – `find()`

The `find(original, copy, target)` function:
- Traverses the original list to locate `target`.
- Simultaneously traverses the copy list.
- When the node in the original list matches `target`, it returns the corresponding node in the copy list.

---

## ⏱️ Time and Space Complexity

| Resource            | Complexity         |
|---------------------|--------------------|
| Time Complexity     | O(n²) – due to nested traversal in `find()` |
| Space Complexity    | O(1) – No additional data structures used |

---

## ❌ Limitations

- **Very inefficient for large lists** due to repeated traversal.
- **Better Alternatives**:
  - Use a `HashMap<Node, Node>` to store mapping from original → clone.
  - Use the interleaving node technique for O(1) space and O(n) time.

---

## ✅ Summary

While simple to understand, this brute force solution is not optimal. It is useful for learning and smaller inputs but not recommended for performance-critical applications.
