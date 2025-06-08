import java.util.*;
public class linkedList{
    static class Node{
        int data;
        Node next;
        Node( int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;
    public static void insertAtBeg(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }
    public static void print(Node head){
        if(head==null){
            System.out.println("LinkedList is Empty");
        }
        else{
            Node temp =head;
            System.out.print("The linked List is : ");
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
  public static void deleteAtBeg(){
        if(head==null){
            System.out.println("LinkedList is Empty");
        }
        else{
            Node temp=head;
            head=head.next;
            System.out.println("Deleted Node is "+temp.data);  
        }
    }
    public static void deleteAtEnd(){
        if(head==null){
            System.out.println("Linked List is empty");
        }
        else if (head.next==null) {
            Node temp=head;
            head=null;
            System.out.println("Deleted node is "+temp.data);
        }
        else{
            Node temp=head;
            while (temp.next.next!=null) {
                temp=temp.next;   
            }
            System.out.println("Deleted Node is: "+temp.next.data);
            temp.next=null;
        }
    }
    public static void deleteAtMid(int x){
        if(head==null){
            System.out.println("Linked List is Empty");
        }
        else if(x==1){
            Node temp=head;
            head=head.next;
            System.out.println("Deeleted Node is: "+temp.data);
        }
        else{
            Node curr=head;
            Node prev=null;
            x--;
            while(x!=0 && curr!=null){
                prev=curr;
                curr=curr.next;
                x--;
            }
             if (curr == null) {
            System.out.println("Invalid position to delete.");
            return;
        }

            System.out.println("Deleted node is: "+prev.next.data);
            prev.next=curr.next;
            
        }
    }
   

public static void main(String[] args){
    int[] arr={2,3,4,5,6,7};
    for(int i=0;i<arr.length;i++){
        insertAtEnd(arr[i]);
    }
    print(head);
    deleteAtMid(0);
    print(head);
}
}
