class Solution {

    // Recursive function to calculate sum of squares of first n natural numbers
    static int sumOfSquares(int n) {
        // Base case: if n is 0, the sum is 0
        if (n == 0) {
            return 0;
        }

        // Recursive case: n^2 + sum of squares of numbers before it
        return (n * n) + sumOfSquares(n - 1);
    }
}
