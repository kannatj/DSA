package stack;

//stack implementation using Linked list
public class stackList {
	
  node root;
  
  class node{
	int data;
	node next;
 }
  
  public void push(int data) {
	  
	  node newNode = new node();
	  newNode.data = data;
	  
	  if(root == null)
		  root = newNode;
	  else {
		  node temp  = root;
		  root = newNode;
		  newNode.next = temp;
	  }
	  
	  System.out.println("Data "+data+" pushed into stack");
  }
  
  public void pop() {
	  if(root == null)
		  System.out.println("Stack empty");
	  else {
		  System.out.println(root.data+" is poped out" );
		  root = root.next;
	  }		  
  }
  
  public void peek() {
	  if(root == null) {
		  System.out.println("Stack is empty");
	  }
	  else {
		  System.out.println("Current top element is "+root.data);
	  }
  }
  
  public void isEmpty() {
	  if(root == null) {
		  System.out.println("Stack is empty");
	  }
	  else {
		  System.out.println("Stack is not empty");
	  }
  }
  
  public static void main(String as[]) {
	  
	  stackList sl = new stackList();
	  sl.push(1);
	  sl.push(2);
	  sl.push(3);
	  sl.isEmpty();
	  sl.peek();
	  sl.pop();
	  sl.peek();
	  
  }
}
