//GeeksForGeeks||Practise Solution
class Solution {

    // Function to calculate GCD of two numbers using Euclidean Algorithm
    public static int gcd(int a, int b) {

        // Base case: if b becomes 0, then GCD is a
        if(b == 0) return a;

        // Recursive call: GCD of b and the remainder of a divided by b
        return gcd(b, a % b);
    }
}
