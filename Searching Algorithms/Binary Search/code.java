class Solution {

    // Function to search target in sorted array using Binary Search
    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        // Continue until search space is valid
        while (start <= end) {

            // Find middle index
            int mid = (start + end) / 2;

            // If target found, return index
            if (nums[mid] == target) {
                return mid;
            }

            // If target is greater, search right half
            if (nums[mid] < target) {
                start = mid + 1;
            }

            // If target is smaller, search left half
            else {
                end = mid - 1;
            }
        }

        // Target not found
        return -1;
    }
}
