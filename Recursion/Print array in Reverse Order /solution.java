class Solution {

    // Recursive function to print array elements in reverse order
    public static void printReverse(int[] arr, int index) {
        // Base case: when index reaches end of array
        if (index == arr.length) {
            return;
        }

        // Recursive call before printing
        printReverse(arr, index + 1);

        // Print after recursive call — this reverses the order
        System.out.print(arr[index] + " ");
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Array in Reverse Order:");
        printReverse(arr, 0);  // Start from index 0
    }
}
