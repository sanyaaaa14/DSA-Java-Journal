import java.util.*;

public class Solution {

    public Solution() {}
    Stack<Integer> st = new Stack<>();

    // Add an element to the top of Stack
    public void push(int x) {
        // code here
        if (st.isEmpty()) {
            st.push(x * 101 + x);
        } else {
            st.push(x * 101 + Math.min(x, st.peek() % 101));
        }
    }

    // Remove the top element from the Stack
    public void pop() {
        if (st.isEmpty()) {
            return;
        } else {
            st.pop();
        }
        // code here
    }

    // Returns top element of the Stack
    public int peek() {
        // code here
        if (st.isEmpty()) {
            return -1;
        } else {
            int top = st.peek() / 101;
            return top;
        }
    }

    // Finds minimum element of Stack
    public int getMin() {
        // code here
        if (st.isEmpty()) {
            return -1;
        } else {
            return (st.peek() % 101);
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
