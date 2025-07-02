// GeeksForGeeks||Practise Solution
class Solution {

    // Swap two elements in the array
    void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // Perform selection sort on the array
    void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int index = i; // Assume the ith element is the minimum

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[index]) {
                    index = j; // Find the actual minimum in the rest of the array
                }
            }

            // Swap the found minimum with the first unsorted element
            swap(arr, i, index);
        }
    }
}
