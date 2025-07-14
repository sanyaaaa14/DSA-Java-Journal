class Solution {
    
    // Recursive function to print array elements from index i to end
    public static void printArray(int[] arr, int i) {
        // Base case: if index reaches the length of array, stop recursion
        if(i == arr.length) {
            return;
        }

        // Print the current element
        System.out.print(arr[i] + " ");

        // Recursive call to print the next element
        printArray(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        // Start printing from index 0
        printArray(arr, 0);
    }
}
