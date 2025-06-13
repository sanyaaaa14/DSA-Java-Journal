// 1.GeeksForGeeks Solution 
/*
  Node is defined as
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // ✅ Step 1: Initialize Dummy Node
        Node head = new Node(0); // Dummy node to simplify edge case handling
        Node tail = head;        // Tail pointer to build the merged list

        // 🔁 Step 2: Traverse Both Lists
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                // Attach the smaller node to the tail
                tail.next = head1;
                head1 = head1.next;
                tail = tail.next;

                // Disconnect any old links
                tail.next = null;
            } else {
                tail.next = head2;
                head2 = head2.next;
                tail = tail.next;

                // Disconnect any old links
                tail.next = null;
            }
        }

        // 🔚 Step 3: Attach Remaining Nodes
        if (head1 != null) {
            tail.next = head1;
        } else {
            tail.next = head2;
        }

        // 🎯 Step 4: Return the New Head (skip dummy node)
        head = head.next;
        return head;
    }
}




//2. LEETCODE SOLUTION 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // ✅ Step 1: Create a dummy node to act as the starting point of the merged list
        ListNode head = new ListNode(0);
        ListNode tail = head; // Tail keeps track of the last node in the merged list

        // 🔁 Step 2: Traverse both lists while neither is empty
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                // Attach list1 node if its value is smaller or equal
                tail.next = list1;
                list1 = list1.next; // Move list1 forward
                tail = tail.next;   // Move tail forward
                tail.next = null;   // Clear any existing next pointer
            } else {
                // Attach list2 node otherwise
                tail.next = list2;
                list2 = list2.next; // Move list2 forward
                tail = tail.next;   // Move tail forward
                tail.next = null;   // Clear any existing next pointer
            }
        }

        // 🔚 Step 3: Attach the remaining nodes of either list (if any)
        if (list1 != null) {
            tail.next = list1;
        }
        if (list2 != null) {
            tail.next = list2;
        }

        // 🎯 Step 4: Return the merged list, skipping the dummy node
        head = head.next;
        return head;
    }
}
