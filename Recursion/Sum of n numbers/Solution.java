//GeeksForGeeks||Practise Solution 
class Solution {

    // Recursive function to find the sum of first 'n' natural numbers
    public static int findSum(int n) {
        // Base case: sum of 0 is 0
        if(n == 0){
            return 0;
        }

        // Recursive case: add current number to the sum of previous numbers
        return n + findSum(n - 1);
    }
}
