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
public class Doublycreation{
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

 for(Node i=Head;i!=null;i=i.next){
   System.out.print(i.data+"->");
  }
 System.out.print("null");
  }
 
 }
     
