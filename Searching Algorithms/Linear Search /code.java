class Solution {

    // Function to search target element x in array
    public int search(int arr[], int x) {

        // Traverse each element of array
        for (int i = 0; i < arr.length; i++) {

            // If target found, return index
            if (arr[i] == x) {
                return i;
            }
        }

        // If target not found, return -1
        return -1;
    }
}
