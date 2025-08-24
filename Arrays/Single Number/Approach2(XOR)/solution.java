class Solution {
    public int singleNumber(int[] nums) {
        // Initialize a variable to store XOR result
        int xor = 0;

        // Iterate over all numbers in the array
        for (int i = 0; i < nums.length; i++) {
            // XOR current number with result
            // Duplicate numbers cancel out (a ^ a = 0)
            // Unique number remains
            xor = xor ^ nums[i];
        }

        // The remaining value in 'xor' is the single number
        return xor;
    }
}
