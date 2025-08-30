//Internal Implementation of Singly Linked List
/*We use a temporary pointer instead of directly moving head in order to preserve the original linked list. 
      If we modify head inside display(), we would lose access to the entire list since head would end up as null after traversal. */
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
      public void addFirst(int val){    //O(1)
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
      public void addLast(int val){    //O(1)
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
      public void addPos(int a,int pos){
        Node n=new Node(a);
        int s=0;
        Node th=head;
        if(head==null){
          head=n;
          size++;
          return;
        }
        if(size<=pos){
          addLast(a);
          return;
        }
        while(s<=pos-1){
             s++;
             th=th.next;
        }
        Node d=th.next;
        th.next=n;
        n.next=d;
        size++;
      }
      public void display(){     //O(n)
        Node th=head;
        if(head==null){
          System.out.println("Empty string");
          return;
        }
        while(th!=null){
            System.out.print(th.data + "->");
            th=th.next;
        }
        System.out.print("End");
      }
      
}
public class SinglyLLAdd {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.addPos(50,2);
        l.display();
        System.out.println(l.size);

    }
}
