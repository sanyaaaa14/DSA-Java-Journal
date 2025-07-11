//GeeksForGeeks||Practise Solution 

class Solution {

    // Recursive function to calculate the factorial of a number
    static int factorial(int n) {
        // Base case: factorial of 1 & 0 is 1
        if(n == 1 || n==0){
            return 1;
        }

        // Recursive case: multiply n with factorial of (n - 1)
        return n * factorial(n - 1);
    }
}
