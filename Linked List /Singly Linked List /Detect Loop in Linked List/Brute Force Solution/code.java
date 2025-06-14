//GeeksForGeeks||Practise Solution 
/* Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}
*/

class Solution {
    // ✅ Helper function to check if current node is already visited
    public static boolean check(ArrayList<Node> visited, Node curr) {
        for (int i = 0; i < visited.size(); i++) {
            if (visited.get(i) == curr) {
                return true; // Found duplicate reference → loop exists
            }
        }
        return false;
    }

    // 🔁 Function to detect a loop in the linked list
    public static boolean detectLoop(Node head) {
        Node curr = head;
        ArrayList<Node> visited = new ArrayList<>(); // To store visited node references

        while (curr != null) {
            // If node was already visited → cycle exists
            if (check(visited, curr) == true) return true;

            // Otherwise, mark node as visited and move ahead
            visited.add(curr);
            curr = curr.next;
        }

        // Reached end → no loop
        return false;
    }
}
