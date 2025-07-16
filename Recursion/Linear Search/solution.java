class Solution {

    // Recursive function to perform linear search
    static int linearSearch(int arr[], int x, int i) {
        // Base case: if index reaches end of array, element not found
        if (i == arr.length) return -1;

        // If element found at current index, return index
        if (x == arr[i]) return i;

        // Recursive call to search in the rest of the array
        return linearSearch(arr, x, i + 1);
    }

    // Wrapper function to start recursion from index 0
    static int search(int arr[], int x) {
        return linearSearch(arr, x, 0);
    }
}
