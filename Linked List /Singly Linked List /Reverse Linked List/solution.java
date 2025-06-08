import java.util.ArrayList;

public class ReverseLinkedList {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Approach 1: Using ArrayList
    public static ListNode reverseUsingArrayList(ListNode head) {
        ArrayList<Integer> values = new ArrayList<>();
        ListNode temp = head;

        // Store values in array list
        while (temp != null) {
            values.add(temp.val);
            temp = temp.next;
        }

        // Overwrite values in reverse order
        temp = head;
        int i = values.size() - 1;
        while (temp != null) {
            temp.val = values.get(i);
            temp = temp.next;
            i--;
        }

        return head;
    }

    // Approach 2: In-place reversal
    public static ListNode reverseInPlace(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;    // Save next node
            curr.next = prev;    // Reverse pointer
            prev = curr;         // Move prev forward
            curr = next;         // Move curr forward
        }

        return prev; // New head
    }

    // Optional: Helper to print the list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Test both approaches
    public static void main(String[] args) {
        // Sample linked list: 1 -> 2 -> 3 -> null
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        System.out.println("Original List:");
        printList(node1);

        // Use in-place reversal
        ListNode reversed = reverseInPlace(node1);
        System.out.println("Reversed List (In-place):");
        printList(reversed);

        // Re-reverse for testing ArrayList method
        ListNode restored = reverseInPlace(reversed);
        System.out.println("Reversed using ArrayList:");
        printList(reverseUsingArrayList(restored));
    }
}

