# Reverse Nodes in k-Group

## Problem Statement

You are given the head of a **singly linked list** and an integer `k`. Your task is to reverse the nodes of the list in groups of size `k` and return the updated head of the linked list.

If the number of remaining nodes in the list is **less than `k`**, still reverse them (i.e., **even the last incomplete group should be reversed**).

---

## Function Signature

```java
public static Node reverseKGroup(Node head, int k)

```
## Input

- **head**: The head node of a singly linked list.
- **k**: An integer representing the size of the group to reverse.

---

## Output

- Return the head of the modified linked list after reversing every `k` nodes.

---

## Explanation of Logic

### Step-by-step Breakdown:

#### 1. Dummy Node
A dummy node is created and linked to the head of the list to simplify edge cases during reversal.

#### 2. Outer While Loop
Reverses the list `k` nodes at a time using the `first` pointer, which tracks the node just before the current group.

#### 3. Pointers Used
- `second`: First node of the current group.
- `prev`: Tracks the previous node in reversal logic.
- `curr`: Current node being reversed.
- `front`: Stores the next node temporarily to preserve the link during reversal.

#### 4. Reversing k Nodes
A standard in-place reversal is done for `k` nodes using the above pointers.

#### 5. Connecting Groups
After reversing:
- `first.next` is updated to point to the new head of the reversed group.
- The tail of the reversed group (`second`) is connected to `curr` (start of the next group).

#### 6. Repeat
- The `first` pointer is moved to `second` (new position after reversal).
- The process continues for the next group.

#### 7. Final Result
- The list is fully reversed in groups of `k`.
- `head.next` (from the dummy node) is returned as the new head.

---

## Example

### Input:
Linked List: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7
k = 3

### Output:

3 -> 2 -> 1 -> 6 -> 5 -> 4 -> 7

- First group (1, 2, 3) → reversed to (3, 2, 1)
- Second group (4, 5, 6) → reversed to (6, 5, 4)
- Last group (7) → reversed alone as it has less than `k` elements

---

## Time and Space Complexity

- **Time Complexity**: O(N), where N is the number of nodes in the linked list.
- **Space Complexity**: O(1), as the reversal is done in-place without using extra space.

