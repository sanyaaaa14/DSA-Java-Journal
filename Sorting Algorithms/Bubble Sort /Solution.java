//GeeksForGeeks||Practise Solution
class Solution {
    // Flag to check if a swap happened during a pass
    public static boolean swapped = false;

    // Utility function to swap elements at indices 'first' and 'second'
    public static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // Function to sort the array using bubble sort algorithm
    public static void bubbleSort(int arr[]) {
        int n = arr.length;

        // Outer loop for passes, reducing the range each time
        for (int i = n - 2; i >= 0; i--) {
            swapped = false;  // Reset swap flag for this pass

            // Inner loop to compare adjacent elements up to index i
            for (int j = 0; j <= i; j++) {
                // Swap if the left element is greater than the right
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true; // Mark that a swap occurred
                }
            }

            // If no swaps occurred, array is already sorted
            if (swapped == false) {
                break;
            }
        }
    }
}
