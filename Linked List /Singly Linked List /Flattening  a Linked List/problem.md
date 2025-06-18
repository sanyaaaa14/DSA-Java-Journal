# Flatten a Multilevel Linked List

## Problem Description

Given a linked list where each node has two pointers:
- `next`: Points to the next node in the horizontal direction.
- `bottom`: Points to a linked list in the vertical direction.

Each vertical list is individually sorted. The task is to **flatten the entire structure into a single sorted linked list**, using the `bottom` pointer only.

---

## Approach

The solution uses **pairwise merging** of bottom-linked lists to flatten the entire structure.

---

## Function Breakdown

### `merge(Node head1, Node head2)`

- Merges two bottom-linked sorted lists (`head1` and `head2`) into a single sorted list.
- Uses a dummy node (`head`) to simplify the merging logic.
- Iteratively compares `data` values of `head1` and `head2`, and appends the smaller one to the `tail`.
- Ensures each node’s `bottom` pointer is correctly set, and `next` pointers are removed.

### `flatten(Node root)`

- Flattens the entire multilevel linked list:
  1. Takes two horizontally adjacent lists (`head1`, `head2`) at a time.
  2. Merges them using the `merge()` function.
  3. Repeats the process with the merged result and the next horizontal list (`head3`).
- Continues this process until all horizontal levels are merged into a single vertical list.

---

## Pointer Cleanup

- Before merging:
  - `head1.next = null` and `head2.next = null` ensures `next` pointers don’t interfere during merging.
- After merging:
  - The merged node is reattached to the remaining portion of the list using `root.next = head3`.

---

## Example

### Input:

```text
5  -> 10 -> 19 -> 28
|     |     |     |
7     20    22    35
|           |     |
8           50    40
|                 |
30                45
```
## Flattened Linked List Output

All nodes are now connected through `bottom` pointers in sorted order:

```text
5 -> 7 -> 8 -> 10 -> 19 -> 20 -> 22 -> 28 -> 30 -> 35 -> 40 -> 45 -> 50
```

- All `next` pointers are disregarded.
- This list is connected only through `bottom` pointers internally.
- The arrow `->` above is for readability (since we can't show vertical `bottom` pointers easily in text), but technically:
  - `5.bottom = 7`
  - `7.bottom = 8`
  - `8.bottom = 10`
  - ...
  - and so on till `50.bottom = null`
```
```
(Note: This is represented using `bottom` pointers only; `next` is removed.)

---

## Time and Space Complexity

- **Time Complexity**: O(N * M), where:
  - `N` is the number of horizontal nodes (`next` list),
  - `M` is the average length of each vertical list (`bottom` list),
  - Each merge takes linear time.
- **Space Complexity**: O(1) auxiliary space since merging is done in-place.

---

## Conclusion

This method efficiently flattens a multilevel sorted linked list by merging one list at a time using in-place pointer manipulation and avoids recursion or unnecessary storage.
