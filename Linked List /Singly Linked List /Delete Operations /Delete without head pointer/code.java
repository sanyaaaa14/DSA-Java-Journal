// Common Node definition
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class Solution {

    // 🧠 Method 1: Using a temporary node
    void deleteNodeUsingTemp(Node node) {
        if (node == null || node.next == null) return;

        Node temp = node.next;
        node.data = temp.data;
        node.next = temp.next;
    }

    // 🧠 Method 2: Making inline changes (no temp variable)
    void deleteNodeInline(Node node) {
        if (node == null || node.next == null) return;

        node.data = node.next.data;
        node.next = node.next.next;
    }

    // Optional: Print function for testing
    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Optional: Main method to test both methods
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test Method 1: deleteNodeUsingTemp
        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(4);
        head1.next.next.next = new Node(30);

        System.out.println("Before Method 1 deletion:");
        sol.printList(head1);
        sol.deleteNodeUsingTemp(head1.next); // Deletes node 20
        System.out.println("After deletion:");
        sol.printList(head1);

        // Test Method 2: deleteNodeInline
        Node head2 = new Node(1);
        head2.next = new Node(5);
        head2.next.next = new Node(9);

        System.out.println("\nBefore Method 2 deletion:");
        sol.printList(head2);
        sol.deleteNodeInline(head2.next); // Deletes node 5
        System.out.println("After deletion:");
        sol.printList(head2);
    }
}
