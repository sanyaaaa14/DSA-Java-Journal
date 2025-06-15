//GeeksForGeeks||practise Solution 
/* Node of a linked list */
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

/* Linked List class */
class LinkedList {
    Node head;  // head of list
}

class Intersect {
    // Function to find intersection point in Y shaped Linked Lists.
    static Node intersectPoint(Node head1, Node head2) {
        Node curr1 = head1;
        Node curr2 = head2;
        int count1 = 0, count2 = 0;

        // Count the length of first list
        while (curr1 != null) {
            curr1 = curr1.next;
            count1++;
        }

        // Count the length of second list
        while (curr2 != null) {
            curr2 = curr2.next;
            count2++;
        }

        // Reset pointers to the heads of both lists
        curr1 = head1;
        curr2 = head2;

        // Advance the pointer of the longer list by the difference in lengths
        while (count1 > count2) {
            curr1 = curr1.next;
            count1--;
        }

        while (count2 > count1) {
            curr2 = curr2.next;
            count2--;
        }

        // Move both pointers one node at a time until they meet
        while (curr1 != curr2) {
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        // Either intersection node or null if no intersection
        return curr1;
    }
}
