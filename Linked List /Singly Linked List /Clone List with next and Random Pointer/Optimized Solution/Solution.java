//GeeksForGeeks||Practise Solution
/*linked list node
class Node {
    int data;
    Node next;
    Node random;

    Node(int x) {
        data = x;
        next = null;
        random = null;
    }
}
*/

import java.util.HashMap;

class Solution {

    public Node cloneLinkedList(Node head) {
        Node temp = head;

        // Step 1: Create a dummy node to start building the copied list
        Node headcopy = new Node(0); 
        Node tailcopy = headcopy;

        // Step 2: Copy the data and next pointers
        while (temp != null) {
            tailcopy.next = new Node(temp.data);
            tailcopy = tailcopy.next;
            temp = temp.next;
        }

        // Move headcopy to the actual start of the new list
        headcopy = headcopy.next;

        // Step 3: Create a mapping from original nodes to their copies
        temp = head;
        tailcopy = headcopy;
        HashMap<Node, Node> m = new HashMap<>();

        while (temp != null) {
            m.put(temp, tailcopy);
            temp = temp.next;
            tailcopy = tailcopy.next;
        }

        // Step 4: Assign random pointers using the map
        temp = head;
        tailcopy = headcopy;

        while (temp != null) {
            tailcopy.random = m.get(temp.random);
            temp = temp.next;
            tailcopy = tailcopy.next;
        }

        // Step 5: Return the head of the cloned list
        return headcopy;
    }
}
