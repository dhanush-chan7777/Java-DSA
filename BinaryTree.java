class Node{
 int data;
 Node left,right;
  public Node(int data){
    this.data=data; 
    this.left=this.right=null;
  }
}
public class BinaryTree{
  Node root;
 public BinaryTree(){
   root=null;
  }
 void inorder(Node root){
  if(root!=null){
   inorder(root.left);
   System.out.print(root.data+" ");
   inorder(root.right);
  }
 }
void preorder(Node root){
 if(root!=null){
  System.out.print(root.data+" ");
  preorder(root.left);
  preorder(root.right);
  }
 }
void postorder(Node root){
  if(root!=null){
   postorder(root.left);
   postorder(root.right);
   System.out.print(root.data+" ");
  }
 }
public static void main(String []args){
  BinaryTree obj=new BinaryTree();
  obj.root=new Node(1);
  obj.root.left=new Node(2);
  obj.root.right=new Node(3);
  obj.root.left.left=new Node(4);
  obj.root.left.right=new Node(5);
  obj.root.right.left=new Node(6);
  obj.root.right.right=new Node(7);
 
 System.out.print("INORDER:");
 obj.inorder(obj.root);
  
 System.out.print("PREORDER:");
 obj.preorder(obj.root);
 
 System.out.print("POSTORDER:");
 obj.postorder(obj.root);
 
 }
}

 
