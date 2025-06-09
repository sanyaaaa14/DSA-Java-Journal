# 🔁 Delete Every Kth Node in Linked List

## 📋 Problem Statement
Given a singly linked list, your task is to delete **every kth node** in the list.  
Return the updated head of the list after the deletions.

🧠 For example:
If the list is `1 → 2 → 3 → 4 → 5 → 6 → 7 → 8` and `k = 3`,  
The modified list should be: `1 → 2 → 4 → 5 → 7 → 8`

---

## 💡 Intuition
We want to keep counting nodes and delete every node where the count is divisible by **k**.  
We move one node at a time, and whenever the count reaches **k**, we skip that node by adjusting pointers.

Edge Case:
- If `k == 1`, that means every node must be deleted, so we return `null`.

---

## 🛠️ Approach
1. If `k == 1`, return `null` immediately.
2. Initialize:
   - `prev = null`
   - `curr = head`
   - `count = 1`
3. Traverse the list:
   - If `count == k`, skip the current node by updating `prev.next = curr.next`, reset count to 1.
   - Else, move `prev` and `curr` forward and increment count.
4. Return the updated head.

---

## ⏱️ Complexity Analysis

| Complexity Type  | Details                          |
|------------------|----------------------------------|
| **Time**         | \(O(n)\) — Single traversal      |
| **Space**        | \(O(1)\) — No extra space used   |

---

## 🔍 Code Explanation
This algorithm uses a **single pass** with two pointers:
- `curr`: for the current node.
- `prev`: to maintain the link for skipping the kth node.
By counting the nodes as we traverse, we can dynamically remove every kth node.

---

📂 Check the implementation in [code.java](code.java)  
Happy Coding! 😄💻
