class Solution {

    // Recursive function to count the number of distinct ways to climb to the top
    public int climbStairs(int n) {

        // Base case: if n is 0 or 1, there's only 1 way to reach the top
        if (n <= 1) return 1;

        // Recursive case: sum of ways to reach (n-1) and (n-2) steps
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
