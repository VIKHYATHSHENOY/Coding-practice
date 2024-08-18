public class LinkedList2{
    public class Node{
        int data;
        Node next;
        public Node(int data){
          this.data=data;
          this.next=null;
        }
        public static Node head;
        public static Node tail;
        public void addFirst(int data){
          Node newNode=new newNode(data);
          if(head==null){
            head=tail=newNode;
            return;
          }
          newNode.next=head;
          head=newNode;
        }
        public static addLast(int data){
          Node newNode=new newNode(data);
          if(haed==null){
            head=tail=newNode;
          }
          tail.next=newNode;
          tail=newNode;
        }
    }
    public static void main(String args[]){
      LinkedList2 l1=new LinkedList2();
      l1.addFirst(1);
      l1.addFirst(2);
      l1.addLast(4);
      l1.addLast(8);
    }
  }
   
   
  