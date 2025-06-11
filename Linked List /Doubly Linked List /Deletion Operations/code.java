public class doublyLinkedList {
    
    // Node class representing each element in the doubly linked list
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Head of the list
    static Node head = null;

    // Utility method to print the list
    public static void print(Node head) {
        if (head == null) {
            System.out.println("LinkedList is Empty");
        } else {
            Node temp = head;
            System.out.print("The linked List is : ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Insert a new node at the end of the list
    public static void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // Set new node as head if list is empty
        } else {
            Node temp = head;
            // Traverse to the last node
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode; // Link last node's next to new node
            newNode.prev = temp; // Link new node's prev to last node
        }
    }

    // Delete the first node of the list
    public static void deleteAtBeg() {
        if (head == null) {
            System.out.println("Linked List is empty");
        } else if (head.next == null) {
            System.out.println("Deleted Node is: " + head.data);
            head = null; // Only one node, set head to null
        } else {
            System.out.println("Deleted Node is: " + head.data);
            head = head.next; // Move head to next node
            head.prev = null; // Remove backward link
        }
    }

    // Delete the last node of the list
    public static void deleteAtEnd() {
        if (head == null) {
            System.out.println("Linked List is empty");
        } else if (head.next == null) {
            System.out.println("Deleted Node is: " + head.data);
            head = null; // Only one node
        } else {
            Node temp = head;
            // Traverse to the last node
            while (temp.next != null) {
                temp = temp.next;
            }
            System.out.println("Deleted Node is: " + temp.data);
            temp.prev.next = null; // Disconnect last node from previous
            temp.prev = null; // Optional: Clear reference to previous node
        }
    }

    // Delete a node at a specific position (1-based index)
    public static void deleteAtPosition(int pos) {
        if (pos == 1) {
            if (head.next == null) {
                System.out.println("Deleted Node is: " + head.data);
                head = null; // Only one node
            } else {
                System.out.println("Deleted Node is: " + head.data);
                head = head.next; // Move head
                head.prev = null; // Disconnect old head
            }
        } else {
            Node temp = head;
            // Traverse to the target position
            while (pos > 0) {
                temp = temp.next;
                pos--;
            }
            if (temp.next == null) {
                // Last node case
                System.out.println("Deleted Node is: " + temp.data);
                temp.prev.next = null;
                temp.prev = null;
            } else {
                // Middle node case
                System.out.println("Deleted Node is: " + temp.data);
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7 };

        // Insert values into the list
        for (int i = 0; i < arr.length; i++) {
            insertAtEnd(arr[i]);
        }

        print(head); // Print initial list
        deleteAtPosition(3); // Delete node at position 3
        print(head); // Print updated list
    }
}
