import java.util.ArrayList;

public class ReverseLinkedList {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Approach 1: Using ArrayList
    public static ListNode reverseUsingArrayList(ListNode head) {
        ArrayList<Integer> values = new ArrayList<>();
        ListNode temp = head;

        // Store values
        while (temp != null) {
            values.add(temp.val);
            temp = temp.next;
        }

        // Overwrite in reverse
        temp = head;
        int i = values.size() - 1;
        while (temp != null) {
            temp.val = values.get(i);
            temp = temp.next;
            i--;
        }

        return head;
    }

    // Approach 2: In-place Iterative
    public static ListNode reverseInPlace(ListNode head) {
        ListNode prev = null, curr = head, next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // Approach 3: Recursive
    public static ListNode reverseRecursive(ListNode curr, ListNode prev) {
        if (curr == null) return prev;
        ListNode next = curr.next;
        curr.next = prev;
        return reverseRecursive(next, curr);
    }

    // Helper for recursion (only passing head)
    public static ListNode reverseRecursive(ListNode head) {
        return reverseRecursive(head, null);
    }

    // Print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create list: 1 -> 2 -> 3 -> null
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        System.out.println("Original List:");
        printList(node1);

        // In-place reversal
        ListNode inPlace = reverseInPlace(node1);
        System.out.println("In-place Reversed:");
        printList(inPlace);

        // Restore for testing ArrayList
        ListNode restored = reverseInPlace(inPlace);
        System.out.println("ArrayList Reversed:");
        printList(reverseUsingArrayList(restored));

        // Restore again for recursive
        restored = reverseInPlace(restored);
        System.out.println("Recursive Reversed:");
        printList(reverseRecursive(restored));
    }
}
