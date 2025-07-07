//GeeksForGeeks||Practise Solution
class Solution {

    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        // Base case: if the subarray has 1 or no elements, it's already sorted
        if (low >= high) return;

        // Partition the array and get the pivot index
        int pivot = partition(arr, low, high);

        // Recursively apply quicksort to the left of pivot
        quickSort(arr, low, pivot - 1);

        // Recursively apply quicksort to the right of pivot
        quickSort(arr, pivot + 1, high);
    }

    // Function to partition the array and return the index of pivot
    static int partition(int arr[], int low, int high) {
        int pos = low;  // Position pointer for placing elements ≤ pivot

        // Traverse from low to high
        for (int i = low; i <= high; i++) {
            // If current element is ≤ pivot (chosen as arr[high]), swap it to the correct position
            if (arr[i] <= arr[high]) {
                int temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;
                pos++;
            }
        }

        // Return the index where pivot (arr[high]) is finally placed
        return pos - 1;
    }
}
