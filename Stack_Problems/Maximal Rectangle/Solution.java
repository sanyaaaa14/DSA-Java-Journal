import java.util.*;

public class Solution {

    // Java solution to Maximal Rectangle using Histogram + Stack
    public int maximalRectangle(char[][] matrix) {
        int ans = 0;
        int row = matrix.length;
        int column = matrix[0].length;
        int[] heights = new int[column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == '0') {
                    heights[j] = 0;
                } else {
                    heights[j]++;
                }
            }
            ans = Math.max(ans, largestAreaHistogram(heights));
        }
        return ans;
    }

    public int largestAreaHistogram(int[] heights) {
        int ans = 0;
        int index;
        int n = heights.length;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] > heights[i]) {
                index = st.peek();
                st.pop();
                if (!st.isEmpty()) {
                    ans = Math.max(ans, heights[index] * (i - st.peek() - 1));
                } else {
                    ans = Math.max(ans, heights[index] * i);
                }
            }
            st.push(i);
        }

        while (!st.isEmpty()) {
            index = st.peek();
            st.pop();
            if (!st.isEmpty()) {
                ans = Math.max(ans, heights[index] * (n - st.peek() - 1));
            } else {
                ans = Math.max(ans, heights[index] * n);
            }
        }
        return ans;
    }

    // Sample test case
    public static void main(String[] args) {
        Solution obj = new Solution();
        char[][] matrix = {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'}
        };
        int result = obj.maximalRectangle(matrix);
        System.out.println("Maximal Rectangle Area: " + result);
    }
}

