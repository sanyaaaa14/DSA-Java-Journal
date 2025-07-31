import java.util.* ;
import java.io.*; 

public class Solution {

    // Function to find the second largest element in the array
    public static int findSecondLargest(int n, int[] arr) {

        // If the array has less than 2 elements, second largest doesn't exist
        if(n < 2){
            return -1;
        }

        int firstlargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            // If current element is greater than firstLargest, update both
            if(arr[i] > firstlargest){
                secondLargest = firstlargest;
                firstlargest = arr[i];
            }
            // If current element is distinct and greater than secondLargest
            else if(arr[i] > secondLargest && arr[i] != firstlargest){
                secondLargest = arr[i];
            }
        }

        // If secondLargest was not updated, return -1
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }
}
