class Solution {
    public int missingNumber(int[] nums) {
        // Length of the array
        int n = nums.length;

        // The expected total sum of numbers from 0 to n
        int totalsum = (n * (n + 1)) / 2;

        // Calculate the actual sum of the given array
        int partialsum = 0;
        for (int i = 0; i < n; i++) {
            partialsum += nums[i];
        }

        // The missing number will be the difference
        return totalsum - partialsum;
    }
}
