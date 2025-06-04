import java.util.*;

public class Solution {

    // Java solution to find the Celebrity using Stack + Final Validation
    public int celebrity(int[][] mat) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < mat.length; i++) {
            st.push(i);
        }
        while (st.size() > 1) {
            int first = st.pop();
            int second = st.pop();
            if ((mat[first][second] == 1) && (mat[second][first] == 0)) {
                st.push(second);
            } else if ((mat[second][first] == 1) && (mat[first][second] == 0)) {
                st.push(first);
            }
        }
        if (st.isEmpty()) {
            return -1;
        }
        int num = st.pop();
        int row = 0;
        int column = 0;
        for (int i = 0; i < mat.length; i++) {
            if (i != num) {
                row += mat[num][i];
                column += mat[i][num];
            }
        }
        if (row == 0 && column == mat.length - 1) {
            return num;
        }
        return -1;
    }

    // Sample test case
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[][] mat = {
            {1, 1, 0},
            {0, 1, 0},
            {0, 1, 1}
        };
        int result = obj.celebrity(mat);
        System.out.println("Celebrity Index: " + result);
    }
}

