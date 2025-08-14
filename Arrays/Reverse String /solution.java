class Solution {
    public void reverseString(char[] s) {
        // Initialize two pointers: one starting from the left, one from the right
        int left = 0;
        int right = s.length - 1;

        // Continue swapping until the pointers meet or cross
        while (left < right) {
            // Swap characters at left and right
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Move both pointers towards the center
            left++;
            right--;
        }
    }
}
