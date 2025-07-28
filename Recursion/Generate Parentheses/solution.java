import java.util.ArrayList;
import java.util.List;

class Solution {

    // Recursive helper function to build valid parenthesis combinations
    void solution(int n, int left, int right, String temp, ArrayList<String> a) {
        // Base case: if the total number of brackets used equals 2*n, add to result
        if (left + right == 2 * n) {
            a.add(temp);
            return;
        }

        // If the number of '(' used is less than n, we can add another '('
        if (left < n) {
            solution(n, left + 1, right, temp + "(", a);
        }

        // If the number of ')' used is less than the number of '(', we can add ')'
        if (right < left) {
            solution(n, left, right + 1, temp + ")", a);
        }
    }

    // Main function that initializes variables and returns all combinations
    public List<String> generateParenthesis(int n) {
        ArrayList<String> a = new ArrayList<>();
        // Start recursion with 0 '(' and 0 ')', and an empty string
        solution(n, 0, 0, "", a);
        return a;
    }
}
