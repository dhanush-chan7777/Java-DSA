import java.util.Scanner;
class Node{
 int data;
 Node next;
 Node prev;
  public Node(int data){
     this.data=data;
     this.next=null;
     this.prev=null;
    }
  }
public class Doublyinsert{
   Node Head;
  public void insertatend(int data){
    Node newnode=new Node(data);
    Node current=Head;
    if(Head==null){
      Head=newnode;
     }
    else{
      while(current.next!=null){
        current=current.next;
        }
      current.next=newnode;
      newnode.prev=current;
     }
   }
public void insertmiddle(int pos,int data){
  Node newnode=new Node(data);
  Node current=Head;
  if(Head==null){
   Head=newnode;
   }
  else if(pos==1 ||pos<=0){
    current=Head;
    newnode.next=current;
    current.prev=newnode;
    current=newnode;
    }
     
  else{
   for(int i=1;i<pos-1;i++){
      current=current.next;
      
    }
     newnode.next=current.next;
     current.next.prev=newnode;
     current.next=newnode;
     newnode.prev=current;
    }
  }
     
   
 public void display(){
   Node current=Head;
   while(current!=null){
     System.out.print(current.data+"->");
     current=current.next;
    }
    System.out.print("null");
 }




 public static void main(String[] args){
   Scanner S=new Scanner(System.in);
   Doublyinsert list=new Doublyinsert();

   System.out.print("Enter the no. of list::");
   int len=S.nextInt();

   System.out.print("Enter the value::");
   for(int i=0;i<len;i++){
     int val=S.nextInt();
     list.insertatend(val);
    }

   list.display();  System.out.println();
  System.out.println("Enter the position");
   int pos=S.nextInt();
  System.out.print("Enter the value of new node::");
    int val=S.nextInt();
   list.insertmiddle(pos,val);
   list.display();
  }
 }
    
   
   
   
      
   
     
       
     
