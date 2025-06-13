# 🧠 Problem: Remove Duplicates from a Sorted Linked List

## 📝 Problem Statement

Given a **sorted singly linked list**, the task is to remove all duplicate nodes such that each element appears only once.

---

## 🚀 Optimized Approach (In-Place Using Two Pointers)

This approach modifies the linked list **in-place**, meaning no extra space is used to store unique values. It relies entirely on pointer manipulation to skip over duplicate nodes.

---

## 🔄 Step-by-Step Explanation

### ✅ Step 1: Handle Base Case

If the list is empty or contains only one node, it's already duplicate-free. The function simply returns the head.

---

### 🔁 Step 2: Traverse with Two Pointers

- Use two pointers:
  - `prev` (initially pointing to the head)
  - `curr` (initially pointing to the node next to head)

- Iterate through the list while `curr` is not null:
  - If the value of `curr` is **equal** to the value of `prev`, it means it's a duplicate.
    - Skip the duplicate by setting `prev.next` to `curr.next`.
    - Move `curr` to `prev.next`.
  - If the values are **not equal**, move both pointers one step forward.

This way, all duplicates are skipped directly, and only unique nodes remain in the modified list.

---

## ⏱️ Time Complexity

- **O(N)** – The entire list is traversed only once, where `N` is the number of nodes.

---

## 💾 Space Complexity

- **O(1)** – No additional space is used apart from a few pointer variables.

---

## ⚖️ Summary

- This is the **most optimal** solution for removing duplicates from a sorted singly linked list.
- It avoids the use of extra space and achieves the task efficiently in a single pass.
- Ideal for real-world applications where memory usage is critical.
- Demonstrates effective use of **pointer manipulation** in linked list problems.

---

> ✅ Recommended for production-level code and efficient solutions in technical interviews.
