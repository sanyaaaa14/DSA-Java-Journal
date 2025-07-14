class Solution {

    // Recursive function to calculate sum of array elements
    public static int sumArray(int[] arr, int index) {
        // Base case: if index reaches the end of array
        if (index == arr.length) {
            return 0;
        }

        // Recursive case: current element + sum of rest of array
        return arr[index] + sumArray(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};

        int result = sumArray(arr, 0);  // Start from index 0
        System.out.println("Sum of array elements: " + result);
    }
}
