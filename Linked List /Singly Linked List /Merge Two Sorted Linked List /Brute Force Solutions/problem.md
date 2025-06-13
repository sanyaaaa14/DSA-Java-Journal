# 🔗 Merge Two Sorted Linked Lists — Brute Force Approaches

You are given the heads of two sorted singly linked lists `head1` and `head2`. Your task is to merge them into one sorted linked list.

---

## 🧪 Brute Force Approach 1: Using Extra ArrayList

### 💡 Idea:
This approach involves:
- Collecting all elements from both lists into an ArrayList.
- Sorting the list.
- Creating a new linked list from the sorted array.

### 🔄 Steps:
1. Traverse both `head1` and `head2`, and store their data values into an `ArrayList`.
2. Sort the ArrayList.
3. Create a **new linked list** by inserting nodes from the sorted array.

### ⏱️ Time Complexity:
- Collecting data: `O(N + M)`
- Sorting: `O((N + M) log(N + M))`
- Rebuilding list: `O(N + M)`
- **Total: O((N + M) log(N + M))**

### 💾 Space Complexity:
- `O(N + M)` extra space (for the array)

### ⚠️ Drawbacks:
- Not memory efficient.
- Slower for large inputs due to sorting.

---

## 🧪 Brute Force Approach 2: Using Extra Linked List (Sorted Insertion)

### 💡 Idea:
This approach creates a new linked list and inserts each node from `head1` and `head2` into it in sorted order **without using arrays**.

### 🔄 Steps:
1. Create a **new dummy node** to represent the head of the result list.
2. Traverse both `head1` and `head2`.
3. For each node, create a new node and **insert it in the correct position** in the result list to maintain sorted order.

### ⏱️ Time Complexity:
- Inserting each node into the correct position: `O(N * K)` where K is the current size of the result list
- In the worst case: `O((N + M)^2)`

### 💾 Space Complexity:
- `O(N + M)` for storing new nodes.

### ⚠️ Drawbacks:
- Less efficient than optimized in-place approaches.
- Still avoids using arrays but has quadratic time in the worst case.

---

## ✅ Summary

| Approach                      | Time Complexity           | Space Complexity | Comments                                |
|------------------------------|---------------------------|------------------|-----------------------------------------|
| Brute Force with ArrayList   | O((N + M) log(N + M))     | O(N + M)         | Simple, but uses sorting and extra space|
| Brute Force with Linked List | O((N + M)^2) (worst case) | O(N + M)         | No array used, but inefficient inserts  |

> These brute force approaches are useful for understanding the fundamentals but are not recommended for production or large datasets. Optimized in-place merging (two-pointer technique) is preferred.
