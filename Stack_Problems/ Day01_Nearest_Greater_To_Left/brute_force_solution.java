// Brute Force Solution for Nearest Greater to Left (NGTL)

// Approach:
// The brute force approach involves traversing the array for each element 
// and checking every element to its left to find the nearest greater element.
// If no greater element is found, we assign -1 as the nearest greater element.

// Time Complexity: O(n^2) because for each element, we are comparing it with all elements to its left.

public class BruteForceNGTL {
    public static int[] nearestGreaterToLeft(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        
        // Iterate through the array
        for (int i = 0; i < n; i++) {
            result[i] = -1; // Default value for no greater element
            
            // Check elements to the left of arr[i]
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[i]) {
                    result[i] = arr[j]; // Nearest greater element found
                    break;
                }
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        int[] result = nearestGreaterToLeft(arr);
        
        // Print the result
        System.out.println("Nearest Greater to Left for each element:");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
