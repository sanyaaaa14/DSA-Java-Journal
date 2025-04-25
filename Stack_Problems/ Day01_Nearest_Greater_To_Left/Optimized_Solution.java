import java.util.*;

public class Optimized_Solution {

    // Optimized Approach with Stack
    public static ArrayList<Integer> prevSmallerElement(int [] arr) { 
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stk = new Stack<>();

        // Initialize the result with -1 (no greater element to the left)
        for (int i = 0; i < n; i++) {
            result.add(-1);
        }

        // Traverse the array
        for (int i = 0; i < n; i++) {
            // Pop elements from the stack if they are smaller or equal to the current element
            while (!stk.isEmpty() && stk.peek() >= arr[i]) {
                stk.pop();
            }

            // If stack is not empty, the top element is the nearest greater element to the left
            if (!stk.isEmpty()) {
                result.set(i, stk.peek());
            }

            // Push the current element to the stack
            stk.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 4, 5, 1, 6};
        ArrayList<Integer> result = prevSmallerElement(arr);

        // Print the result
        System.out.println("Nearest Greater to Left for each element:");
        for (int x : result) {
            System.out.print("Result: " + x + " ");
        }
    }
}

/*
Explanation:

Brute Force Approach:
- We check each element and compare it to all the previous elements.
- For every element, we iterate through all previous elements to find the nearest greater element.
- This results in a time complexity of O(n²) because for each element, we are checking all previous elements.

Optimized Approach with Stack:
- We use a stack to store elements in such a way that for each new element, we can efficiently find the nearest greater element to its left.
- For every element, we compare it with the top element of the stack.
- If the stack contains elements smaller than the current element, we pop them out.
- The stack helps in finding the nearest greater element in O(1) time once it's processed.
- This ensures that each element is pushed and popped from the stack at most once, leading to a time complexity of O(n).
*/
