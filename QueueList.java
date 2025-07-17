import java.util.Scanner;
class Node{
  int data;
  Node next;
    public Node(int data){
     this.data=data;
     this.next=null;
  }
 }
public class QueueList{
  Node rear=null;
  Node front=null;
 public void enque(int data){
   Node newnode=new Node(data);
   if(rear==null){
     front=rear=newnode;
    }
   else{
    rear.next=newnode;
    rear=newnode;
   }
 }
public void deque(){
 if(rear==null){
     System.out.print("its empty");
   }
  else{
    Node current=front;
    front=front.next;
    current=null;
   }
}
public void display(){
  Node current=front;
  while(current!=null){
    System.out.println(current.data);
    current=current.next;
    }
  }
 public static void main(String[] args){
   Scanner S=new Scanner(System.in);
   Queue list=new Queue();
   System.out.print("Enter the  size");
   int len=S.nextInt();
   for(int i=1;i<=len;i++){
     int val=S.nextInt();
      list.enque(val);
     }
    list.display();
    list.deque();
    list.display();
   }
 }

      

 
    
