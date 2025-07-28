//LeetCode|Solution

import java.util.*;

class Solution {

    // Recursive helper method to generate all subsets
    void solution(int[] arr, int i, List<Integer> curr, List<List<Integer>> a) {
        // Base case: if index reaches end of array, add the current subset to result
        if (i == arr.length) {
            a.add(new ArrayList<>(curr)); // make a deep copy to avoid mutation
            return;
        }

        // Recursive call 1: exclude current element
        solution(arr, i + 1, curr, a);

        // Recursive call 2: include current element
        curr.add(arr[i]); // choose
        solution(arr, i + 1, curr, a);
        curr.remove(curr.size() - 1); // backtrack
    }

    // Main method to be called to generate subsets
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> a = new ArrayList<>(); // stores all subsets
        List<Integer> curr = new ArrayList<>();    // current subset being built
        solution(nums, 0, curr, a);                // start recursion from index 0
        return a;
    }
}
