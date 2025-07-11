# 🔁 Introduction to Recursion

## 📘 What is Recursion?

Recursion is a programming technique where a function calls **itself** to solve smaller instances of the same problem.

In simple terms:  
> A recursive function solves a problem by solving **a smaller subproblem** of the same type, and combining the results.

Each recursive function must have:
- **Base Case** → A condition where the recursion ends.
- **Recursive Case** → The part where the function calls itself with a modified parameter.

---

## 🔍 Why Use Recursion?

- Simplifies complex problems like tree traversal, backtracking, permutations, etc.
- Elegant for problems that can be broken down into smaller subproblems.
- Naturally mirrors mathematical definitions (e.g., factorial, Fibonacci).
- Enables easier implementation of problems involving divide & conquer and branching decisions.

---

## 🧠 Mathematical Intuition – Recursion Tree

Recursion can be visualized as a **recursion tree**, where each function call leads to further recursive calls.

Each node in the tree represents a function call, and its children are the calls made by that function.

This also builds up the **function call stack**, where each function waits until its inner calls return.

### Example: Print numbers from `1 to 3`

```
print(1)
 |
print(2)
  |
 print(3)
```

This stack unwinds from the deepest call (`print(3)`), moving back up to `print(1)`.

---

## 🧪 Simple Example — Print Numbers from 1 to N

```java
void print1ToN(int n) {
    if (n == 0) return; // base case
    print1ToN(n - 1);   // recursive call
    System.out.print(n + " ");
}
```

### Output for `print1ToN(5)`:
```
1 2 3 4 5
```

**Explanation**:  
The function goes deep to `print1ToN(0)`, then prints while returning back — demonstrating recursion's **backtracking** nature.

---

## 🧬 Different Ways to Use Recursion

### 1. **Head Recursion (Function call before work)**

```java
void headRec(int n) {
    if (n == 0) return;
    headRec(n - 1);        // recursive call first
    System.out.print(n);   // then process
}
```

**Output**: `1 2 3 4 5`

---

### 2. **Tail Recursion (Work before function call)**

```java
void tailRec(int n) {
    if (n == 0) return;
    System.out.print(n);   // process first
    tailRec(n - 1);        // recursive call after
}
```

**Output**: `5 4 3 2 1`

---

### 3. **Tree Recursion (Multiple recursive calls)**

```java
void binaryRec(int n) {
    if (n == 0) return;
    binaryRec(n - 1);
    binaryRec(n - 1);  // multiple recursive calls
}
```

In this case, each call spawns two more calls → forming a **binary recursion tree**.

Useful in:
- Generating subsets
- Solving permutations
- Fibonacci series (naive version)

---

## 📊 Time and Space Complexity of Recursion

| Factor          | Value                                                  |
|-----------------|--------------------------------------------------------|
| Time Complexity | Depends on recursion tree (e.g., O(2^n), O(n log n))   |
| Space Complexity| Stack space → O(depth) of recursive calls              |

**Note**: Improper base cases or large input without optimization (like memoization) may lead to **StackOverflowError**.

---

## ✅ Summary

- Recursion is a powerful tool for solving problems with repeated substructure.
- Always define a clear base case to avoid infinite calls.
- Can be expressed in different styles — head, tail, and multiple (tree) recursion.
- Visualizing recursion as a **tree** or **stack** helps understand its flow.

---

🗂️ Proceed to the next files in this folder to explore:
- Factorial
- Fibonacci
- Backtracking problems
- Tree traversals  
and more real-world recursive examples!
