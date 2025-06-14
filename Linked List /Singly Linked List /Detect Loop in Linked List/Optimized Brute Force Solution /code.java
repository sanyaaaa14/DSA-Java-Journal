//GeeksForGeeks|| Practise Solution 
/* 
Node is defined as:

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

import java.util.HashSet;

class Solution {
    // Function to check if the linked list contains a loop using HashSet.
    public static boolean detectLoop(Node head) {
        // Create a set to store visited nodes
        HashSet<Node> visited = new HashSet<>();

        // Start from the head of the list
        Node curr = head;

        // Traverse the list
        while (curr != null) {
            // If current node is already visited, loop exists
            if (visited.contains(curr)) {
                return true;
            } else {
                // Add current node to the set
                visited.add(curr);
                // Move to the next node
                curr = curr.next;
            }
        }

        // If traversal finishes without repetition, no loop
        return false;
    }
}
