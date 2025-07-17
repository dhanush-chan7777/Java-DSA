class Node{
 int data;
  Node next;
  Node prev;
    public Node(int data){
       this.data=data;
       this.next=next;
       this.prev=prev;
      }
   }
public class DoubleList{
 public static void main(String[] main){
    Node Head=new Node(0);
    Node a=new Node(1);
    Node b=new Node(2); 
    Node c=new Node(3);
     Node d=new Node(4);
  
  Head.next=a;
  Head.prev=null;
  a.next=b;
  a.prev=Head;
  b.next=c;
  b.prev=a;
  c.prev=b;
  c.next=d;
  d.prev=c;

 Node current=Head;
  for(Node t=current;t!=null;t=t.next){
    System.out.print(t.data+"->");
   }
 System.out.print("null");
 System.out.println();
 while(current.next!=null){
   current=current.next;
  }
 for(Node i=current;i!=null;i=i.prev){
   System.out.print(i.data+"->");
  }
 System.out.print("null");
  }
 
 }
     
