import java.util.*;

public class Solution {

    class twoStacks {
        int size;
        int[] arr;
        int top1, top2;

        twoStacks() {
            size = 201;
            arr = new int[size];
            top1 = -1;
            top2 = size;
        }

        // Function to push an integer into the stack1.
        void push1(int x) {
            if (top1 + 1 != top2) {
                top1++;
                arr[top1] = x;
            }
        }

        // Function to push an integer into the stack2.
        void push2(int x) {
            if (top2 - 1 != top1) {
                top2--;
                arr[top2] = x;
            }
        }

        // Function to remove an element from top of the stack1.
        int pop1() {
            if (top1 == -1) {
                return -1;
            } else {
                int element = arr[top1];
                top1--;
                return element;
            }
        }

        // Function to remove an element from top of the stack2.
        int pop2() {
            if (top2 == size) {
                return -1;
            } else {
                int element = arr[top2];
                top2++;
                return element;
            }
        }
    }

    // Sample test case
    public static void main(String[] args) {
        Solution sol = new Solution();
        twoStacks stacks = sol.new twoStacks();

        stacks.push1(2);
        stacks.push1(3);
        stacks.push2(4);

        System.out.println("Pop from Stack 1: " + stacks.pop1()); // 3
        System.out.println("Pop from Stack 2: " + stacks.pop2()); // 4
        System.out.println("Pop from Stack 2 again: " + stacks.pop2()); // -1
    }
}

