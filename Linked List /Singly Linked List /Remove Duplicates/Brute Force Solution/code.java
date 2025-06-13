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
        ArrayList<Integer> arr=new ArrayList<>();
        Node curr=head;
        arr.add(curr.data);
        curr=curr.next;
        while(curr!=null){
            if(arr.get(arr.size()-1)!=curr.data){
                arr.add(curr.data);
                
            }
            curr=curr.next;
        }
        curr=head;
        for(int i=0;i<arr.size();i++){
            curr.data=arr.get(i);
             if (i == arr.size() - 1) {
                curr.next = null;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

}
