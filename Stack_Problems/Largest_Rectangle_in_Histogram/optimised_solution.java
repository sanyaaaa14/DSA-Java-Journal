import java.util.*;

public class Optimized_Solution {

    // Optimized Approach using Stack for Largest Rectangle in Histogram
    public static int largestRectangleArea(int[] heights) {
        int ans = 0;
        int index;
        int n = heights.length;
        Stack<Integer> st = new Stack<>();

        // Traverse the histogram
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] > heights[i]) {
                index = st.peek();
                st.pop();
                if (!st.isEmpty())
                    ans = Math.max(ans, heights[index] * (i - st.peek() - 1));
                else
                    ans = Math.max(ans, heights[index] * i);
            }
            st.push(i);
        }

        // Process remaining elements in the stack
        while (!st.isEmpty()) {
            index = st.peek();
            st.pop();
            if (!st.isEmpty())
                ans = Math.max(ans, heights[index] * (n - st.peek() - 1));
            else
                ans = Math.max(ans, heights[index] * n);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] heights = {6, 2, 5, 4, 5, 1, 6};
        int result = largestRectangleArea(heights);

        // Print the result
        System.out.println("Largest Rectangle Area in Histogram: " + result);
    }
}

/*
Explanation:

Brute Force Approach:
- For every bar, expand in both directions until a smaller height is found.
- Time complexity becomes O(n^2), inefficient for large inputs.

Optimized Approach with Stack:
- We use a monotonic increasing stack to keep track of indices.
- When a smaller bar is encountered, we pop and calculate area using the popped bar's height.
- Each index is pushed and popped at most once => O(n) time.
- Space complexity is O(n) for the stack.
*/

