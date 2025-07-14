class Solution {

    // Recursive function to find the minimum element in the array
    public static int findMin(int[] arr, int index) {
        // Base case: if last element, return it
        if (index == arr.length - 1) {
            return arr[index];
        }

        // Recursive case: find min in the rest of the array
        int minRest = findMin(arr, index + 1);

        // Return the minimum between current and the rest
        return Math.min(arr[index], minRest);
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 4, 1, 5};

        int result = findMin(arr, 0);  // Start from index 0
        System.out.println("Minimum element: " + result);
    }
}
