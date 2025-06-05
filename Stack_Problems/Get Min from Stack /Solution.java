import java.util.*;

public class Solution {

    public Solution() {}
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    // Add an element to the top of Stack
    public void push(int x) {
        // code here
        if (st1.isEmpty()) {
            st1.push(x);
            st2.push(x);
        } else {
            st1.push(x);
            st2.push(Math.min(x, st2.peek()));
        }
    }

    // Remove the top element from the Stack
    public void pop() {
        if (st1.isEmpty()) {
            return;
        } else {
            st1.pop();
            st2.pop();
        }
        // code here
    }

    // Returns top element of the Stack
    public int peek() {
        // code here
        if (st1.isEmpty()) {
            return -1;
        } else {
            int top = st1.peek();
            return top;
        }
    }

    // Finds minimum element of Stack
    public int getMin() {
        // code here
        if (st2.isEmpty()) {
            return -1;
        } else {
            int minElement = st2.peek();
            return minElement;
        }
    }

    // Sample test case
    public static void main(String[] args) {
        Solution obj = new Solution();
        obj.push(5);
        obj.push(2);
        obj.push(10);
        obj.push(1);

        System.out.println("Top Element: " + obj.peek());
        System.out.println("Minimum Element: " + obj.getMin());
        obj.pop();
        System.out.println("After one pop, Top: " + obj.peek());
        System.out.println("After one pop, Min: " + obj.getMin());
    }
}

