# 🧬 Clone a Linked List with Next and Random Pointers (Using HashMap)

## 📘 Problem Statement

Given a linked list where each node contains:

- A `next` pointer pointing to the next node in the list.
- A `random` pointer that can point to any node in the list (including `null`).

Your task is to create a **deep copy** of the list, meaning that the new list should be completely independent from the original, with all `next` and `random` pointers correctly assigned.

---

## 🔧 Approach: HashMap for Node Mapping

This approach makes multiple passes over the list and uses a `HashMap<Node, Node>` to store the **mapping of original nodes to their copies**.

---

## 🛠️ Steps

### ✅ Step 1: Clone Node Data and Next Pointers

- Traverse the original list using a temporary pointer `temp`.
- For each node, create a new node with the same `data`.
- Link these nodes together using `next` pointers to form a shallow copy.
- Maintain a dummy node (`headcopy`) to build the new list easily.

### ✅ Step 2: Build Mapping Using HashMap

- Traverse both original and copied lists in parallel.
- Store each original node as the key and its copy as the value in a `HashMap`.

### ✅ Step 3: Assign Random Pointers

- Traverse both original (`temp`) and copied (`tailcopy`) lists again.
- For each node, use the map to find the cloned version of `temp.random` and assign it to `tailcopy.random`.

---

## 💡 Example

Given:
- 1 → next → 2, random → 3  
- 2 → next → 3, random → 1  
- 3 → next → null, random → 2
After cloning, the new list should preserve both structure and randomness.

---

## ⏱️ Time and Space Complexity

| Resource         | Complexity     |
|------------------|----------------|
| Time Complexity  | O(n) – 3 passes |
| Space Complexity | O(n) – due to HashMap |

---

## ✅ Advantages

- Efficient: No repeated traversals like brute force.
- Simple to implement and understand.
- Preserves all structure and pointer references accurately.

---

## ❌ Limitations

- Uses extra space proportional to the number of nodes (O(n)).

---

## 🔄 Alternative (More Optimized)

- An **O(1) space** approach exists using the **interleaving node technique**, where each copy node is inserted between original nodes, and then separated later.

---

## ✅ Summary

This HashMap-based approach offers a clean and efficient way to deep clone a linked list with both `next` and `random` pointers in **linear time** with extra space. It’s a commonly used pattern in coding interviews for deep copy problems.

