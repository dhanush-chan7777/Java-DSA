class Node{
  int data;
  Node next;
   public Node(int data){
      this.data=data;
      this.next=null;
    }
  }

public class SingleListDelete{
  public static void main(String[] args){
     Node Head=new Node(0);
     Node a=new Node(1);
     Node b=new Node(2); 
     Node c=new Node(3);
     Node d=new Node(4);
  
  Head.next=a;
  a.next=b;
  b.next=c;
  c.next=d;

 for(Node t=Head;t!=null;t=t.next){
  System.out.print(t.data+"->");
 }
 System.out.print("null");
  System.out.println();
  int val=2;
  Node current=Head;
 while(current.next.data!=val && current.next!=null){
   current=current.next;
  }
    current.next=current.next.next;
 
  for(Node i=Head;i!=null;i=i.next){
    System.out.print(i.data+"->");
    }
  System.out.print("null");
  
  Node current=Head;
  while(current.next!=null){
    current=current.next;
  }
 

 }
}
 
