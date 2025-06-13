import java.util.ArrayList;
import java.util.Collections;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class BruteForceMerge {

    // 🧪 Brute Force 1: Using ArrayList and Sorting
    public static Node mergeUsingArrayList(Node head1, Node head2) {
        ArrayList<Integer> list = new ArrayList<>();

        // Collect all elements from head1
        Node curr = head1;
        while (curr != null) {
            list.add(curr.data);
            curr = curr.next;
        }

        // Collect all elements from head2
        curr = head2;
        while (curr != null) {
            list.add(curr.data);
            curr = curr.next;
        }

        // Sort the list
        Collections.sort(list);

        // Create a new linked list from the sorted values
        Node dummy = new Node(0);
        Node tail = dummy;
        for (int val : list) {
            tail.next = new Node(val);
            tail = tail.next;
        }

        return dummy.next;
    }

    // 🧪 Brute Force 2: Build New Sorted Linked List Without Array
    public static Node mergeUsingSortedInsertion(Node head1, Node head2) {
        Node result = null;

        // Insert nodes from head1
        Node curr = head1;
        while (curr != null) {
            result = insertInSortedOrder(result, curr.data);
            curr = curr.next;
        }

        // Insert nodes from head2
        curr = head2;
        while (curr != null) {
            result = insertInSortedOrder(result, curr.data);
            curr = curr.next;
        }

        return result;
    }

    // Helper method to insert a value into a sorted linked list
    public static Node insertInSortedOrder(Node head, int data) {
        Node newNode = new Node(data);

        // Insert at beginning or into empty list
        if (head == null || data < head.data) {
            newNode.next = head;
            return newNode;
        }

        // Traverse to find correct insertion point
        Node curr = head;
        while (curr.next != null && curr.next.data < data) {
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }

    // 🔧 Optional: Utility method to print a linked list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // 🧪 Example test run
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);

        System.out.println("🔹 Merge Using ArrayList:");
        Node merged1 = mergeUsingArrayList(head1, head2);
        printList(merged1);

        System.out.println("🔹 Merge Using Sorted Insertion:");
        Node merged2 = mergeUsingSortedInsertion(head1, head2);
        printList(merged2);
    }
}
