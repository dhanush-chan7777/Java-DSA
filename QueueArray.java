import java.util.Scanner;
public class QueueArray{
  int front;
  int rear;
  int size;
  int[] queue;
     public ArrayQueue(int size){
       this.size=size;
       front=0;
       rear=-1; 
       queue=new int[size];
     }
 
 public void enque(int data){
  if(rear==size-1){
    System.out.print("its full");
   }
  else{
    queue[rear+1]=data;  
    rear++;
   }
 }
public void deque(){
  if(rear<front){
    System.out.print("its empty");
  }
  else{
    int current=front;
    while(current<=rear-1){
      queue[current]=queue[current+1];
       current++;    
    }
  rear--;
  }
 }
public void display(){
   for(int i=front;i<=rear;i++){
      System.out.println(queue[i]);
       }
 }
 public static void main(String[] args){
    Scanner S=new Scanner(System.in);
    System.out.print("Enter the size of the array");
    int len=S.nextInt();
    ArrayQueue list=new ArrayQueue(len);

    for(int i=0;i<len;i++){
      int val=S.nextInt();
      list.enque(val);
    }
   list.display();
   list.deque();
   list.display();
   list.enque(6);
   list.display();
  }
}
    
     
      
   
  
   
    
       
