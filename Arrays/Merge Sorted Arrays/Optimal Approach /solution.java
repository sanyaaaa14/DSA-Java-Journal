class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // p1 -> pointer to the last valid element in nums1
        int p1 = m - 1;
        // p2 -> pointer to the last element in nums2
        int p2 = n - 1;
        // i -> pointer to the last index of nums1 (where merged result will go)
        int i = nums1.length - 1;

        // Traverse both arrays from the back and place the larger element at the end
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[i--] = nums1[p1--]; // place nums1 element
            } else {
                nums1[i--] = nums2[p2--]; // place nums2 element
            }
        }

        // If any elements are left in nums2, copy them
        // (No need to check nums1 because it's already in place)
        while (p2 >= 0) {
            nums1[i--] = nums2[p2--];
        }
    }
}
