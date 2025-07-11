class Solution {

    // Recursive function to calculate x raised to the power n (x^n)
    static int power(int x, int n) {
        // Base case: any number raised to the power 0 is 1
        if (n == 0) {
            return 1;
        }

        // Recursive case: multiply x with result of power(x, n - 1)
        return x * power(x, n - 1);
    }
}
