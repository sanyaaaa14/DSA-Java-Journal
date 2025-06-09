# 🔁 Palindrome Linked List

## 📋 Problem Statement
Given the head of a singly linked list, return `true` if it is a **palindrome** or `false` otherwise.

A linked list is a palindrome if it reads the same forward and backward.  
✅ Example: `1 → 2 → 2 → 1` → `true`

---

## 💡 Intuition
To check if a linked list is a palindrome, we must compare its first half with the **reverse of the second half**.

The trick lies in doing this efficiently:
- Without using extra space.
- Without modifying the list permanently (optional).
- And handling odd/even number of nodes properly.

---

## 🛠️ Approach

1. **Count the total number of nodes** in the list to determine the middle point.
2. **Split the list into two halves** at the midpoint:
   - For even-length lists: both halves are equal.
   - For odd-length lists: the **middle node is part of the second half**.
3. **Reverse the second half** of the list.
4. **Compare both halves** node-by-node.

🔍 **Important Note (⚠️ Handling Odd Length):**  
If the list has an **odd number of nodes**, the extra middle node is included in the **second half** when splitting.  
This is why we only compare until `head1 != null`.  
Even if the second half has one extra node (the middle one), it does not affect palindrome checking, because it's symmetric around the center.  
E.g. `1 → 2 → 3 → 2 → 1` → valid palindrome.

---

## ⏱️ Complexity Analysis

| Complexity Type  | Details                      |
|------------------|------------------------------|
| ⌛ Time           | \(O(n)\) — Full list traversal |
| 🧠 Space          | \(O(1)\) — In-place reversal   |

---

## 🧠 Notes
- Reversal of the second half is done in-place to keep space usage minimal.
- The first and second halves are compared efficiently.
- This approach ensures both **odd and even** length lists are handled seamlessly.

---

📂 Check the implementation in [code.java](code.java)  
Happy coding! 🧑‍💻✨
