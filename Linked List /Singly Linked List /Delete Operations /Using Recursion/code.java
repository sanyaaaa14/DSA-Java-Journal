// Definition for singly linked list node
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class Solution {
    // Recursive method to delete the xth node (1-based index) from the list
    Node deleteNode(Node curr, int x) {
        if (x == 1) {
            // Base case: delete current node by returning the next node
            return curr.next;
        }

        // Recursive case: move to next node with x-1
        curr.next = deleteNode(curr.next, x - 1);
        return curr;
    }

    // Helper function to print the linked list (for testing)
    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method to test the recursive deletion
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Creating linked list: 1 -> 5 -> 2 -> 9
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(2);
        head.next.next.next = new Node(9);

        System.out.println("Original Linked List:");
        sol.printList(head);

        int x = 2; // Delete the 2nd node
        head = sol.deleteNode(head, x);

        System.out.println("Linked List after deleting " + x + "th node:");
        sol.printList(head);
    }
}
