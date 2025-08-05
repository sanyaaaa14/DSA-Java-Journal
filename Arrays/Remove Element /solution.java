class Solution {
    public int removeElement(int[] nums, int val) {
        // 'x' keeps track of the index to place the next valid element (not equal to 'val')
        int x = 0;

        // Iterate through the entire array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is NOT equal to the value to remove
            if (nums[i] != val) {
                nums[x] = nums[i]; // Move the current element to the index 'x'
                x = x + 1;         // Increment 'x' for the next valid element
            }
        }

        // Return the count of elements that are not equal to 'val'
        return x;
    }
}
