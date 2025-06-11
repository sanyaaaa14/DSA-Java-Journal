# 📘 Introduction to Doubly Linked List in Java

---

## 📌 What is a Doubly Linked List?

A **Doubly Linked List (DLL)** is a data structure in Java where each node contains three parts:

- `data`: Value stored in the node.
- `prev`: A reference to the previous node.
- `next`: A reference to the next node.

It allows **bidirectional traversal** unlike a Singly Linked List, which only moves forward.

---

## 🧠 Why Was Doubly Linked List Introduced?

Singly Linked Lists come with several limitations:

| Singly Linked List Limitation        | Solution with DLL                    |
|--------------------------------------|--------------------------------------|
| No backward traversal                | DLL supports bidirectional traversal |
| Difficult to delete from middle      | DLL stores `prev` pointer            |
| Reversal is inefficient              | DLL makes it simpler and faster      |

So, DLLs offer:
- ✅ More flexibility
- ✅ Efficient deletion/insertion at both ends
- ✅ Easy reversal of the list

---

## 🔍 Real-World Use Cases

- 🌐 Browsers – Back/Forward navigation  
- 📝 Text editors – Undo/Redo  
- 🎵 Media players – Playlist navigation  
- 📂 File explorer – Folder hierarchy navigation  
- 🔄 LRU Cache  
- 🧠 Java’s `LinkedList` class uses DLL under the hood

---

## 🧱 Node Structure in Java

```java
class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
```

## ⚖️ Comparison: Singly vs Doubly Linked List in Java

| Feature               | Singly Linked List  | Doubly Linked List         |
|-----------------------|---------------------|-----------------------------|
| Navigation            | Forward only        | Forward and backward        |
| Pointers per Node     | One (`next`)        | Two (`prev`, `next`)        |
| Memory Usage          | Less                | Slightly more               |
| Insertion at Tail     | O(n)                | O(n) or O(1) with tail      |
| Deletion from Middle  | O(n)                | O(1)\*                      |
| Reverse Traversal     | Not possible        | Possible                    |

> \* If the node reference is already available.

---

## 💡 Benefits of Using DLL in Java

- 🔁 Reversible navigation  
- 🧩 Efficient node insertion/deletion in both directions  
- 🔍 Easy implementation of complex algorithms like LRU Cache  
- 💼 Used in Java collections (`LinkedList`, `Deque`, etc.)

---

## 📈 Time and Space Complexity

| Operation              | Time Complexity        |
|------------------------|------------------------|
| Insertion at Head      | O(1)                   |
| Insertion at Tail      | O(n) or O(1)\*         |
| Deletion from Middle   | O(1)\*                 |
| Forward Traversal      | O(n)                   |
| Backward Traversal     | O(n)                   |

> \* Assuming node reference is known or a `tail` pointer is maintained.

---

## ✅ Summary

The **Doubly Linked List (DLL)** in Java is a highly flexible and useful data structure when **two-way navigation** or **efficient mid-list operations** are needed.

Although it uses slightly more memory than singly linked lists, the trade-offs are justified in many real-world scenarios.

Java already provides built-in support via the `LinkedList` class, but **implementing your own DLL** helps build core skills in:

- ⚙️ Dynamic memory management  
- 🔗 Pointer (reference) manipulation  
- 🧠 Core data structure design
