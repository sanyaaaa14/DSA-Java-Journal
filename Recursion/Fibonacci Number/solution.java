//LettCode Solution 
class Solution {
    // Recursive function to calculate the nth Fibonacci number
    public int fib(int n) {
        // Base case: 0th Fibonacci number is 0
        if (n == 0) return 0;

        // Base case: 1st Fibonacci number is 1
        if (n == 1) return 1;

        // Recursive case: nth Fibonacci = (n-1)th + (n-2)th
        return fib(n - 1) + fib(n - 2);
    }
}
