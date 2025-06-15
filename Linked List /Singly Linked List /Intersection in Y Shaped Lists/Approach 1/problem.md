# 🔗 Problem: Find Intersection Point in Y-Shaped Linked Lists

## 🧠 Objective  
Given two singly linked lists that **intersect at some point**, return the node where the two lists merge. If they do not intersect, return `null`.

---

## ✅ Approach Used: Length Difference Alignment

This approach aligns both linked lists to the same starting point from the end and then traverses them together to find the intersection.

---

## 📘 Step-by-Step Explanation

### 🔹 Step 1: Count the Length of Both Lists  
- Traverse `head1` and count nodes in `count1`.  
- Traverse `head2` and count nodes in `count2`.

### 🔹 Step 2: Equalize Starting Point  
- Calculate the difference between `count1` and `count2`.  
- Advance the head of the **longer list** by the difference, so that both pointers have the same number of nodes remaining until the end.

### 🔹 Step 3: Traverse Together  
- Move both pointers one step at a time.  
- When `curr1 == curr2`, you’ve found the intersection node.  
- If you reach the end (`null`) without finding a match, then the lists don’t intersect.

---

## 🧪 Test Case Example

### Example:

List A:  
`1 → 2 → 3`  
&emsp;&emsp;&emsp;&emsp;↘  
&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp;`6 → 7`  
&emsp;&emsp;&emsp;&emsp;↗  
List B:  
`4 → 5`

### Execution:

- `count1 = 5` (List A: 1 → 2 → 3 → 6 → 7)  
- `count2 = 4` (List B: 4 → 5 → 6 → 7)

Advance List A by 1 node to equalize remaining lengths.

Then:
- Compare nodes step-by-step:  
  - `2 != 4`, `3 != 5`, `6 == 6` → ✅ Intersection found at node with value `6`.

---

## 🕒 Time and Space Complexity

| Metric              | Value                                                 |
|---------------------|-------------------------------------------------------|
| Time Complexity     | `O(m + n)` where `m` and `n` are the lengths of the two lists |
| Space Complexity    | `O(1)` (constant space, no extra structures used)     |

---

## 📌 Notes

- This solution works only when **both lists are singly linked** and may or may not intersect.
- The intersection is by **reference**, not by value — i.e., the node objects must be the same (`==`), not just have the same `data`.

---

## ✅ Advantages

- Does not require extra space like `HashSet`.  
- Works efficiently even if the lengths of the two lists are significantly different.
