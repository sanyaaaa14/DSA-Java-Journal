public class doublyLinkedList {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    static Node head= null;
    public static void insertAtBeg(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
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
    public static void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.prev=temp;
        }
    }
    public static Node insertAtEndRecursively(int[] arr,int index,int size,Node back){
        if(index==size){
            return null;
        }
        Node newNode=new Node(arr[index]);
        newNode.prev=back;
        newNode.next=insertAtEndRecursively(arr, index+1, size, newNode);
        return newNode;
    }
    public static Node insertAtBegRecursively(int[] arr,int index,int size,Node front){
        if(index>=size){
            return front;
        }
        Node newNode=new Node(arr[index]);
        newNode.next=front;
         if (front != null) {
            front.prev = newNode;
        }

        return insertAtBegRecursively(arr, index+1, size, newNode);
    }
    public static void insertAtMid(int data,int pos){
        Node newNode=new Node(data);
        if(pos==0){
            if(head==null){
                head=newNode;
            }
            else{
                newNode.next=head;
                head.prev=newNode;
                head=newNode;
            }
            return;
        }
        
            Node curr=head;
            int count=0;
            while(curr!=null && count<pos-1){
                curr=curr.next;
                count++;
            }
            if (curr == null) {
            System.out.println("Position out of bounds");
            return;
            }
            // Insert after curr
            newNode.next = curr.next;
            newNode.prev = curr;
            if (curr.next != null) {
            curr.next.prev = newNode;
            }
            curr.next = newNode;
        }
        
    

    public static void main(String[] args){
        int[] arr={2,3,4,5,6,7};
    for(int i=0;i<arr.length;i++){
        insertAtEnd(arr[i]);
    }
    print(head);
    insertAtMid(10, 78);
    print(head);
    }
}
