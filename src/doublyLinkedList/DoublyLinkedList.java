package doublyLinkedList;

public class DoublyLinkedList {
    static Node head;
    static Node tail;
    public DoublyLinkedList(){
        this.head=null;
        this.tail=null;
    }
    static  void insertFirst(int data){
        Node newNode=new Node(data);
        if(head==null)
        {
            tail=newNode;
        }else {
            head.prev=newNode;
        }
        newNode.next=head;
        head=newNode;
    }
    static void insertLast(int data){
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }else {
            newNode.prev=tail;
            tail.next=newNode;

        }
        tail=newNode;
    }
   static   int deleteFirst(){
        Node temp=head;
        if(head.next==null){
            tail=null;
        }else{
            head.next.prev=null;
        }
        head=head.next;
        return temp.data;
    }
    static   int deleteLast(){
        Node temp=tail;
        if(head.next==null){
            head=null;
        }else{
            tail.prev.next=null;
        }
        tail=tail.prev;
        return temp.data;
    }
    static Node delete(int searchKey){
        Node current=head;
        while (current.data != searchKey){
            current=current.next;
            if(current==null)
                return null;
        }
        if(current==head) // delete first
            head=current.next;
        else              // delete in the middle
            current.prev.next=current.next;
        if (current==tail) // delete last
            tail=current.prev;
        else               // delete in the middle
            current.next.prev=current.prev;
        return current;
    }
    static boolean insertAfter(int searchKey,int data){
        Node current=head;
        while (current.data != searchKey){
            current=current.next;
            if(current==null)
                return false;
        }
        Node newNode=new Node();
        newNode.data=data;
        if(current==tail)  // insert last
            tail=newNode;
        else {   // insert in the middle
            current.next.prev=newNode;
            newNode.next=current.next;
        }
        current.next=newNode;
        newNode.prev=current;
        return true;
    }
    static   void displayForward(){
        Node current=head;
        while (current != null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    static   void displayBackward(){
        Node current=tail;
        while (current != null){
            System.out.println(current.data);
            current=current.prev;
        }

    }
    public static void main(String[] args){
        DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
        doublyLinkedList.insertFirst(10);
        doublyLinkedList.insertFirst(30);
        doublyLinkedList.insertFirst(50);
        doublyLinkedList.insertAfter(10,90);
        doublyLinkedList.insertAfter(30,100);
        doublyLinkedList.displayForward();
        System.out.println("---------------");
        doublyLinkedList.displayBackward();
    }
}
