class Solution {
    
    // Function to check whether a number is prime
    static boolean isPrime(int n) {
        
        // Numbers less than or equal to 1 are not prime
        if (n <= 1) 
            return false;

        // Check divisibility from 2 to sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++) {
            
            // If divisible by i, then n is not prime
            if (n % i == 0) {
                return false;
            }
        }

        // If no divisor found, n is prime
        return true;
    }
}
