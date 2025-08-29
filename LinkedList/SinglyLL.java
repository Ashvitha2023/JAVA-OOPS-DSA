//Internal Implementation od Singly Linked List
class Node{
    int data;
    Node next;
    Node(int val){
        this.data=val;
        this.next=null;
    }
}
class LinkedList{
      Node head;
      Node tail;
      int size;
      LinkedList(){
        this.size=0;
      }
      public void addFirst(int val){
        Node n=new Node(val);
        if(head==null){
            head=tail=n;
            size++;
            return;
        }
        Node th=head;
        head=n;
        n.next=th;
        size++;
      } 
      public void addLast(int val){
        Node n=new Node(val);
        if(head==null){
            head=tail=n;
            size++;
            return;
        }
        Node th=tail;
        tail=n;
        th.next=n;
        size++;

      }
      public void display(){
        Node th=head;
        while(th!=null){
            System.out.print(th.data + "->");
            th=th.next;
        }
        System.out.print("End");
      }
}
public class SinglyLL {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.addFirst(10);
        l.addFirst(20);
        l.addLast(40);
        l.display();
        System.out.println(l.size);

    }
}
