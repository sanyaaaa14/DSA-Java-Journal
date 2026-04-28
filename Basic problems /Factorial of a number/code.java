class Solution {

    // Function to calculate factorial of a number
    int factorial(int n) {
        
        // Base cases: factorial of 0 and 1 is 1
        if (n == 0 || n == 1) 
            return 1;

        int f = 1; // Variable to store factorial result

        // Multiply numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }

        // Return final factorial
        return f;
    }
}
