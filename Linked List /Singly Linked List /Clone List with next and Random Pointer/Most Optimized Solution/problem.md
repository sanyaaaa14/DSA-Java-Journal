# 🧬 Clone a Linked List with Next and Random Pointers (O(1) Space - Interleaving Method)

# 📘 Problem Statement
Given a linked list where each node contains:
- A `next` pointer to the next node in the list.
- A `random` pointer that may point to any node in the list (or `null`).

You need to clone the list such that:
- The new list is a deep copy (completely separate).
- All `next` and `random` pointers are correctly assigned in the copied list.

---

# 💡 Intuition
Using a `HashMap` is a common solution, but it takes extra space.  
To optimize, we can **interleave the cloned nodes** directly between original nodes.  
This allows us to set up both `next` and `random` pointers **in-place** without extra space.

---

# 🔧 Approach: Interleaving Nodes (O(1) Space)

### ✅ Step 1: Clone nodes with only `next` pointers
- Traverse the original list.
- For each original node, create a copy and store in `headcopy`.
- Link the copied nodes with `next`.

### ✅ Step 2: Interleave the original and copied nodes
- Traverse both original (`curr1`) and copy (`curr2`) lists.
- Insert each copy node right after its corresponding original node.

### ✅ Step 3: Assign random pointers
- Use the fact that `curr1.next` is the copy node.
- Set `curr2.random = curr1.random.next` if `random` is not null.

### ✅ Step 4: Separate the original and cloned list
- Restore the original list by unlinking the interleaved structure.
- Extract the copied list (`headcopy`) from the interleaved nodes.

---

# 🔁 Example

### Given:
Original: 1 → 2 → 3
Random: 1.random → 3, 2.random → 1, 3.random → 2


### Output:
Cloned: 1' → 2' → 3'
Random: 1'.random → 3', 2'.random → 1', 3'.random → 2'
---

# 📊 Complexity

- **Time Complexity:**  
  $$O(n)$$ — We make three passes through the list.

- **Space Complexity:**  
  $$O(1)$$ — No extra data structures used (only pointers).

---

# ✅ Summary

This solution:
- Does not use extra space like a map.
- Efficiently builds the cloned list by interleaving and then separating nodes.
- Is optimal for performance and memory.

