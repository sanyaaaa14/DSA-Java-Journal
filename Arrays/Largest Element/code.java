class Solution {

    // Function to find largest element in array
    public static int largest(int[] arr) {

        // Initialize with smallest integer value(-Infinity)
        int lar = Integer.MIN_VALUE;

        // Traverse all elements
        for (int i = 0; i < arr.length; i++) {

            // Update largest if current element is greater
            if (arr[i] > lar) {
                lar = arr[i];
            }
        }

        // Return largest element
        return lar;
    }
}
