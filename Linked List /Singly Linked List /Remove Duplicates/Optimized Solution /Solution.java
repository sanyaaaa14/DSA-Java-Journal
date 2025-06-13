//GeeksForGeeks Solution 
/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    // Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head) {
        if(head==null || head.next==null){
            return head;
        }
        Node curr=head.next;
        Node prev=head;
        while(curr!=null){
            if(curr.data == prev.data){
                prev.next=curr.next;
                curr=prev.next;
            }
            else{
                prev=prev.next;
                curr=curr.next;
            }
        }
        return head;
        
    }
}
