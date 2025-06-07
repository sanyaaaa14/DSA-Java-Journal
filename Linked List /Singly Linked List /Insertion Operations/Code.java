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
        }
    }
    public static void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node tail=head;
            while(tail.next!=null){
                tail=tail.next;
            }
            tail.next=newNode;
            newNode.next=null;
        }
    }
    public static void insertAtMid(int data,int x){
        Node newnode=new Node(data);
        if(head==null){
            System.out.println("Node is empty");
        }
        else{
            Node temp=head;
            int index=1;
            while(index!=x){
                temp=temp.next;
                index++;
            }
            newnode.next=temp.next;
            temp.next=newnode;
        }
    }
    public static Node insertAtBegRecursively(int[] arr,int index,int size,Node prev){
        if(index==size){
            return prev;
        }
        Node temp=new Node(arr[index]);
        temp.next=prev;
        return insertAtBegRecursively(arr, index+1, size, temp);
    }
    public static Node insertAtEndRecursively(int[] arr,int index,int size){
        if(index==size){
            return null;
        }
        Node temp;
        temp=new Node(arr[index]);
        temp.next=insertAtEndRecursively(arr, index+1, size);

        return temp;

    }

public static void main(String[] args){
    int[] arr={2,3,4,5,6,7};
    for(int i=0;i<arr.length;i++){
        insertAtEnd(arr[i]);
    }
    insertAtMid(10, 3);
    print(head);
}
}
