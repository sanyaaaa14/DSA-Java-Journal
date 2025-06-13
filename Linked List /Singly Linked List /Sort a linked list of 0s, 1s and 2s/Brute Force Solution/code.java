//GeeksForGeeks Solution 
/* 
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/

class Solution {
    static Node segregate(Node head) {
        Node curr = head;

        // 🔢 Step 1: Count occurrences of 0s, 1s, and 2s
        int count0 = 0, count1 = 0, count2 = 0;
        while (curr != null) {
            if (curr.data == 0) count0++;
            else if (curr.data == 1) count1++;
            else count2++;
            curr = curr.next;
        }

        // 🔁 Step 2: Overwrite node data with 0s
        curr = head;
        while (count0 > 0) {
            curr.data = 0;
            curr = curr.next;
            count0--;
        }

        // 🔁 Step 3: Overwrite node data with 1s
        while (count1 > 0) {
            curr.data = 1;
            curr = curr.next;
            count1--;
        }

        // 🔁 Step 4: Overwrite node data with 2s
        while (count2 > 0) {
            curr.data = 2;
            curr = curr.next;
            count2--;
        }

        // ✅ Step 5: Return updated head
        return head;
    }
}
