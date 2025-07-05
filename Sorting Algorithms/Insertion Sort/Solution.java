//GeeksForGeeks||Practise Solution
class Solution {

    // Utility function to swap two elements in the array
    public void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // Function to sort the array using insertion sort algorithm
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        int n = arr.length;

        // Loop through each element starting from index 1
        for (int i = 1; i < n; i++) {
            // Move the current element to its correct position in the sorted part of the array
            for (int j = i; j > 0; j--) {
                // If the current element is smaller than the previous one, swap them
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    // Break if the current element is already in the correct position
                    break;
                }
            }
        }
    }
}
