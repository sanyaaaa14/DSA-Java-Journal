🧱 Celebrity Problem — Stack-Based Candidate Elimination + Final Validation

🧠 Intuition  
The goal is to find the "celebrity" among `n` people — someone who **doesn't know anyone** but **is known by everyone else**.  
Instead of checking each person with every other (which is O(n²)), we use a **stack to eliminate non-celebrities in pairs**.

The final candidate is then **validated** by checking if they satisfy both celebrity conditions using simple row and column sums.

⚙️ Approach  

1. **Push all people (0 to n-1) into a stack**.
2. While the stack has more than one person:
   - Pop two people and compare:
     - If person A knows person B, A can’t be a celebrity — push B.
     - If person B knows person A, B can’t be a celebrity — push A.
     - If both know each other or neither knows the other, discard both.
3. After the loop, only one person may remain — the **celebrity candidate**.
4. **Validate the candidate**:
   - For a valid celebrity at index `num`:
     - `mat[num][i] == 0` for all `i != num` (doesn’t know anyone)
     - `mat[i][num] == 1` for all `i != num` (everyone knows them)

✅ This is done by summing the row and column values, skipping `mat[num][num]`.

⏱️ Complexity  

- **Time Complexity:** O(n)  
  - Each person is pushed and popped at most once, and validation takes O(n).
- **Space Complexity:** O(n)  
  - Stack holds up to n elements.

🧩 Key Concepts Used  

- Stack-based elimination
- Matrix row and column inspection
- Greedy reduction to a single candidate

📌 Use Case  
This approach is particularly useful in scenarios involving asymmetric relationships, such as:

- Social network influence analysis
- Authority identification in directed graphs
- Interview puzzle-type problems

