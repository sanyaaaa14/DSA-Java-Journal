# Introduction to Linked List in Java

## 📌 What is a Linked List?

A **Linked List** is a linear data structure in which elements (called **nodes**) are linked using pointers. Each node contains two parts:
- **Data**: The value stored in the node.
- **Pointer** (or reference): The address of the next node in the list.

There are several types of linked lists:
- **Singly Linked List** – each node points to the next node.
- **Doubly Linked List** – each node points to both the previous and the next node.
- **Circular Linked List** – the last node points back to the first node.

---

## 🛠️ General Use Cases of Linked List

Linked Lists are useful in situations where:
- Frequent insertions and deletions are required.
- Memory needs to be dynamically allocated.
- Data structures like stacks, queues, graphs, and adjacency lists are implemented.

Common applications:
- Browser history (using doubly linked list)
- Music or image playlists
- Hash table chaining
- Dynamic memory allocation systems

---

## 🔍 How Linked List is Better than Array in Java

1. **Dynamic Size**:  
   Arrays have a fixed size. Once declared, their size cannot be changed.  
   → In contrast, Linked Lists can grow or shrink at runtime without needing to reallocate or copy data.

2. **Efficient Insertions/Deletions**:  
   Inserting or deleting elements in arrays (especially in the middle) requires shifting elements, which is an O(n) operation.  
   → In a Linked List, you can insert/delete in O(1) time if the pointer/reference is known.

3. **No Wasted Memory or Overhead for Pre-sizing**:  
   With arrays, developers often allocate extra space in advance, leading to memory waste.  
   → Linked Lists allocate memory as needed for each new node, ensuring efficient memory use.

---

## 🔍 How Linked List is Better than ArrayList in Java

1. **Insertions/Deletions at Arbitrary Positions**:  
   ArrayLists, like arrays, require shifting elements during insertion/deletion (O(n)).  
   → Linked Lists handle insertions/deletions in O(1) time (when pointer is available), making them more efficient for frequent modifications.

2. **No Need for Internal Resizing**:  
   ArrayLists internally use arrays. When they exceed capacity, they create a larger array and copy elements (which is costly).  
   → Linked Lists grow node-by-node, so they never require resizing or copying existing elements.

3. **Consistent Performance for Additions**:  
   For large datasets, Linked Lists maintain consistent performance for adding elements at both ends.  
   → ArrayLists may degrade in performance during resizing operations or when inserting at the beginning.

---

## ✅ When to Prefer Linked List in Java

- When your application requires frequent insertions/deletions.
- When memory reallocation in arrays becomes expensive.
- When implementing dynamic data structures like stacks, queues, or graph representations.

---

### 🔚 Summary

While arrays and ArrayLists offer constant time access and are memory efficient for static data, **Linked Lists** shine in scenarios that involve **dynamic data manipulation**. Understanding the differences and when to use each is key to writing optimized Java code.

