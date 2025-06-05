🧱 Min Stack — Track Minimum in Constant Time Using Dual Stacks

🧠 Intuition  
The goal is to design a stack that, along with standard operations like `push`, `pop`, and `peek`, can also return the minimum element in constant time.  
A brute-force solution would scan the entire stack for the minimum (O(n)), but that’s inefficient.  
To achieve O(1) `getMin()` time, we use an auxiliary stack that mirrors the main stack’s minimums at every level.

⚙️ Approach  

- Use two stacks:
  - `st1` for storing all elements (main stack).
  - `st2` for storing the minimum element at each stage.
- On `push(x)`:
  - Push `x` to `st1`.
  - Push `min(x, st2.peek())` to `st2`. This ensures the top of `st2` is always the current minimum.
- On `pop()`:
  - Pop the top element from both `st1` and `st2` to keep them synchronized.
- On `peek()`:
  - Return the top of `st1`, or `-1` if the stack is empty.
- On `getMin()`:
  - Return the top of `st2`, or `-1` if the stack is empty.

⏱️ Complexity

Time Complexity:  
- `push`: O(1)  
- `pop`: O(1)  
- `peek`: O(1)  
- `getMin`: O(1)

Space Complexity: O(n)  
- We store all elements in `st1` and maintain a parallel `st2` stack for minimum tracking.

🧩 Key Concepts Used

- Dual stacks for synchronization  
- Constant-time minimum tracking  
- Stack-based state mirroring

📌 Use Case

This structure is ideal for:
- Online data monitoring (e.g., stock prices)
- Real-time minimum tracking
- Undo operations in editors
- Any stack use-case needing fast min queries

