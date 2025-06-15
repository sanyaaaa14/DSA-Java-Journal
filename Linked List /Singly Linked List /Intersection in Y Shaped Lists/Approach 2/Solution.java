//GeeksForGeeks||Practise Solution 
/* 
Node of a linked list
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
Linked List class
class LinkedList {
    Node head;  // head of list
}
*/

class Intersect {
    // Function to find intersection point in Y shaped Linked Lists.
    static Node intersectPoint(Node head1, Node head2) {
        // Step 1: Traverse the first list to reach its tail.
        Node curr = head1;
        while (curr.next != null) {
            curr = curr.next;
        }

        // Step 2: Create a temporary cycle by connecting the tail of list1 to its head.
        curr.next = head1;

        // Step 3: Use Floyd’s cycle detection algorithm to detect a loop in list2.
        Node slow = head2;
        Node fast = head2;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        // Step 4: If no loop is found, lists do not intersect. Restore and return null.
        if (fast == null || fast.next == null) {
            curr.next = null; // Restore the original list
            return null;
        }

        // Step 5: Loop detected. Find the entry point of the loop = intersection point.
        slow = head2;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Step 6: Restore original structure by breaking the temporary cycle.
        curr.next = null;

        // Return the intersection node.
        return slow;
    }
}
