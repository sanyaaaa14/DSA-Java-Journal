//GeeksForGeeks||Practise Solution
class Solution {

    // Function to merge two sorted halves of the array
    void merge(int arr[], int start, int mid, int end) {
        // Temporary array to store merged elements
        int temp[] = new int[end - start + 1];
        int left = start;     // Pointer for left subarray
        int right = mid + 1;  // Pointer for right subarray
        int index = 0;        // Index for temp array

        // Merge elements from both subarrays in sorted order
        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right]) {
                temp[index] = arr[left];
                left++;
            } else {
                temp[index] = arr[right];
                right++;
            }
            index++;
        }

        // Copy remaining elements from left subarray, if any
        while (left <= mid) {
            temp[index] = arr[left];
            left++;
            index++;
        }

        // Copy remaining elements from right subarray, if any
        while (right <= end) {
            temp[index] = arr[right];
            right++;
            index++;
        }

        // Copy the merged elements back into the original array
        index = 0;
        while (start <= end) {
            arr[start] = temp[index];
            start++;
            index++;
        }
    }

    // Recursive function to perform merge sort
    void mergeSort(int arr[], int l, int r) {
        // Base case: if the subarray has one element, it is already sorted
        if (l == r) return;

        // Find the middle index
        int mid = l + (r - l) / 2;

        // Recursively sort the left half
        mergeSort(arr, l, mid);

        // Recursively sort the right half
        mergeSort(arr, mid + 1, r);

        // Merge the two sorted halves
        merge(arr, l, mid, r);
    }
}
