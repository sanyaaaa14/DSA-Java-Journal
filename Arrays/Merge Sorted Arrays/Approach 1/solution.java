class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Create a copy of the first m elements of nums1
        int[] nums1copy = Arrays.copyOf(nums1, m); 

        // Initialize three pointers
        int p1 = 0; // pointer for nums1copy
        int p2 = 0; // pointer for nums2
        int i = 0;  // pointer for nums1 (final merged array)

        // Compare elements from nums1copy and nums2
        while (p1 < m && p2 < n) {
            if (nums1copy[p1] < nums2[p2]) {
                nums1[i++] = nums1copy[p1++]; // take element from nums1copy
            } else {
                nums1[i++] = nums2[p2++]; // take element from nums2
            }
        }

        // If there are remaining elements in nums1copy, add them
        while (p1 < m) {
            nums1[i++] = nums1copy[p1++];
        }

        // If there are remaining elements in nums2, add them
        while (p2 < n) {
            nums1[i++] = nums2[p2++];
        }
    }
}
