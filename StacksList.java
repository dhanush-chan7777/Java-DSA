import java.util.Scanner;
class Node{
  int data;  
  Node next;  
  public Node(int data){
   this.data=data;
   this.next=null;
   }
 }
public class StacksList{
   Node top; 
  public void push(int data){ 
    Node newnode=new Node(data);
    newnode.next=top;
    top=newnode;
  }
  public void pop(){
    if(top==null){
      System.out.print("its empty");
    }
    else{
    top=top.next;
    }
  }
 public void display(){
  Node current=top;
  if(current==null){
    System.out.print("its empty");
   }else{
     while(current!=null){
     System.out.println(current.data);
     current=current.next;
    }
     
   }
  }
 public static void main(String[] args){
  Scanner S=new Scanner(System.in);
  stacks stack=new stacks();
  System.out.print("Enter the length of stack");
  int len=S.nextInt();
   System.out.print("enter the values");
  for(int i=1;i<=len;i++){
    int val=S.nextInt();
    stack.push(val);
    }
  stack.display();
  stack.pop();
  System.out.println("After deletion");
  stack.display();
  }
}
  
   
    
     
   

