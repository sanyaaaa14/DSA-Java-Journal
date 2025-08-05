class Solution {
    public int removeDuplicates(int[] nums) {
        // 'x' will keep track of the position of the last unique element
        int x = 0;

        // Loop through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is greater than the last unique element
            // (since the array is sorted), it's a new unique value
            if (nums[i] > nums[x]) {
                x = x + 1;         // Move to the next position
                nums[x] = nums[i]; // Update the value at position 'x'
            }
        }

        // The number of unique elements is 'x + 1'
        return (x + 1);
    }
}
