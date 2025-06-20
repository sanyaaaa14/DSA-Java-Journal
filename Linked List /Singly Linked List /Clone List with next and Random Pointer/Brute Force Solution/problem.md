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

**Original List:**
Original Linked List:
1 -> 2 -> 3  
|    |    |  
v    v    v  
3    1    2

**Copied List (After Cloning):**
Copied Linked List Structure:

1 -> 2 -> 3  
|    |    |  
v    v    v  
3    1    2

---

## ⏱️ Time Complexity

- **First pass**: O(N)
- **Second pass**: For each node, we do a linear `find()` → O(N) * O(N) = **O(N²)**

❗ This is not efficient for large lists.

---

## 🧠 Space Complexity

- O(1) extra space (no hash maps or external data structures used).
- Final cloned list is considered output, not auxiliary space.

---

## ⚖️ Trade-offs

✅ Simpler to implement  
❌ Very inefficient for large inputs  
❌ Repeated traversals slow down performance

---

## 🧪 Can It Be Improved?

Yes!  
Optimized solutions exist using **HashMaps** (to map original → clone) or an **interleaving technique** (inserting clone nodes in between original ones), both of which work in **O(N) time and space**.

---

## 🏁 Conclusion

This brute-force approach works for small inputs and provides a clear conceptual foundation. But for interviews or production systems, use more optimized methods that avoid nested traversals.
