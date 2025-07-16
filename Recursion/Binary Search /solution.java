class Solution {
    
    // Recursive binary search function
    public int Search(int arr[], int x, int start, int end) {
        // Base case: if start index exceeds end, element not found
        if (start > end) return -1;

        // Calculate the middle index
        int mid = start + (end - start) / 2;

        // If the element is found at mid
        if (arr[mid] == x) return mid;

        // If the target is smaller than mid, search in the left half
        else if (arr[mid] > x) return Search(arr, x, start, mid - 1);

        // If the target is larger than mid, search in the right half
        else return Search(arr, x, mid + 1, end);
    }

    // Wrapper function for binary search
    public int binarysearch(int[] arr, int k) {
        return Search(arr, k, 0, arr.length - 1);
    }
}
