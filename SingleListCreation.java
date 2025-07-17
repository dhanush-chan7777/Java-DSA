import java.util.Scanner;
class Node{
  int data;
  Node next;
     public Node(int data){
         this.data=data;
         this.next=null;
         }
     }

public class SingleListCreation{
   Node head=null;

 public static void main(String[] args){
   List list=new List();
   list.display();
  list.createlist();
  list.display();
   
 
  }
    
  void createlist(){
     Node newnode=null;
     Node temp=null;
     Scanner S=new Scanner(System.in);
     System.out.print("Enter the no. of nodes");
     int n=S.nextInt();
   
   for(int i=0;i<n;i++){
    Node newnode=new Node((i+1)*10);
    
  if(head==null){
    head=newnode;
    
    }else{
    Node temp=head;
  
 while(temp.next!=null){
   temp=temp.next;
  }
  temp.next=newnode;
   }
  }
 }
void display(){
  Node temp=head;
  while(temp!=null){
     System.out.print(temp.data+"->");
     temp=temp.next;
   }
System.out.print("null");
}
}    

   
  
   
     
     
  
    
      
