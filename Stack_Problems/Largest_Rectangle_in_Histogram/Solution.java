import java.util.*;

public class Solution {

    // Optimized Approach to find Largest Rectangle in Histogram using Stack
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;

        ArrayList<Integer> right = new ArrayList<>(Collections.nCopies(n, n));
        ArrayList<Integer> left = new ArrayList<>(Collections.nCopies(n, -1));
        Stack<Integer> stack = new Stack<>();

        // Finding the Next Smaller to Right (NSR) for each bar
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                right.set(stack.peek(), i);
                stack.pop();
            }
            stack.push(i);
        }

        // Clear the stack to reuse for finding NSL
        stack.clear();

        // Finding the Next Smaller to Left (NSL) for each bar
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                left.set(stack.peek(), i);
                stack.pop();
            }
            stack.push(i);
        }

        // Calculating the maximum area
        for (int i = 0; i < n; i++) {
            int width = right.get(i) - left.get(i) - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {6, 2, 5, 4, 5, 1, 6};
        int result = largestRectangleArea(heights);

        // Print the result
        System.out.println("Largest Rectangle Area in Histogram: " + result);
    }
}

