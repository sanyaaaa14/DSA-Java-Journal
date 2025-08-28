class Solution {
    public boolean isPowerOfTwo(int n) {
        // Base case: if n is exactly 1, it's a power of two (2^0 = 1)
        if (n == 1) return true;

        // If n is less than 1 or not divisible by 2, 
        // it cannot be a power of two
        else if (n < 1 || n % 2 != 0) return false;

        // Recursive call: keep dividing n by 2
        // until it either reaches 1 (true) or fails the above condition
        return isPowerOfTwo(n / 2);
    }
}
