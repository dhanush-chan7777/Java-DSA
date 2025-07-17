import java.util.*;

class Node{
 int data;
  Node next;

  public Node(int data){
    this.data=data;
    this.next=null;
  }
}

public class SingleListInsert{
  Node Head;
 
 public void add(int data){
   Node newnode=new Node(data);
   if(Head==null){
     Head=newnode;
   }else{
    Node current=Head;
   while(current.next!=null){
     current=current.next;
    }
  current.next=newnode;
   } 
  }
 
public void display(){
  Node current = Head;
  System.out.print("Linked list::");
  while(current!=null){
   System.out.print(current.data+"->");
   current=current.next;
   }
  System.out.print("null");
 }


public void insertatfirst(int data){
   
  Node newnode=new Node(data);
   if(Head==null){
     Head=newnode;
    }else{
      Node current=Head;
      Head=newnode;
      Head.next=current;
   }
 }


public void insertatmiddle(int data,int pos){
 
  if(pos<=0){
     insertatfirst(data);
     return;
   }
  Node newnode=new Node(data);
  Node current=Head;
  for(int i=1;i<pos-1 && current!= null;i++){
    current=current.next;
  }
  newnode.next=current.next;
  current.next=newnode;

}



public void deleteatfirst(){
 Head =Head.next;
 }
public void deleteatlast(){
 Node current=Head;
 while(current.next.next!=null){
   current=current.next;
   }
  current.next=null;
 }
public void deleteatmiddle(int pos){
  if(pos<=0){
    Head=Head.next;
    
   }
 Node current=Head;
 for(int i=1;i<pos-1 && current!=null;i++){
     current=current.next;
 }
 current.next=current.next.next;
 }
 
 

  

  
  
public static void main(String[] args){
 Scanner S=new Scanner(System.in);
  System.out.print("Enter the no. of linked list::");
  int n=S.nextInt();
  Simple list=new Simple();
  for(int i=1;i<=n;i++){
  list.add(i*10);
 }
 list.display();
 System.out.println();
list.deleteatmiddle(3);
list.display();

 }
}

 
