public class MiddleOfLinkedList {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Approach 1: Count and Traverse
    public static ListNode middleByCounting(ListNode head) {
        int count = 0;
        ListNode temp = head;

        // Count nodes
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Traverse again to middle
        count /= 2;
        temp = head;
        while (count > 0) {
            temp = temp.next;
            count--;
        }

        return temp;
    }

    // Approach 2: Fast and Slow Pointers
    public static ListNode middleByTwoPointers(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Print linked list (utility)
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Test both approaches
    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        System.out.println("Original List:");
        printList(node1);

        System.out.println("Middle (Count & Traverse): " + middleByCounting(node1).val);
        System.out.println("Middle (Two Pointers): " + middleByTwoPointers(node1).val);
    }
}
