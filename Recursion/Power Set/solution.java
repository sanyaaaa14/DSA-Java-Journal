//GFG|Practice Solution
// File: AllPossibleSubsequences.java

import java.util.*;

class Solution {

    // Recursive helper function to generate all subsequences
    void solution(String s, int i, String curr, List<String> res) {
        // Base Case: if index reaches the end of the string
        if (i == s.length()) {
            res.add(curr); // add current subsequence (can be empty)
            return;
        }

        // Recursive Case 1: exclude the current character
        solution(s, i + 1, curr, res);

        // Recursive Case 2: include the current character
        String updatedcurr = curr + s.charAt(i);
        solution(s, i + 1, updatedcurr, res);
    }

    // Main function to be called for generating all possible subsequences
    public List<String> AllPossibleStrings(String s) {
        List<String> a = new ArrayList<>();

        // Start recursion from index 0 with empty string
        solution(s, 0, "", a);

        // Remove the empty string (if non-empty subsequences are required)
        a.remove(""); // Optional: comment this out if empty subsequence is allowed

        // Sort the result in lexicographical order
        Collections.sort(a);

        return a;
    }
}
