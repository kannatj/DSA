
package stack;

//Stack implementation using array

public class Stackprogram{
	static final int MAX = 1000;
	static int top;
	int a[] = new int[MAX];
	
	Stackprogram(){
		top =  -1;
	}
	
	public void isEmpty() {
		if (top == -1)
			System.out.println("Stack empty");
		else
			System.out.println("stack is not empty");
	}
	
	
	public void push(int data) {
		if(top >= MAX -1)
			System.out.println("Stack overflow, so can't able to push data");
		else {
			a[++top] = data;
			System.out.println("Data "+data+" pushed into the stack");
	   }
	}
	
	public void pop() {
		if(top < 0)
			System.out.println("Stack empty");
		else
			System.out.println(a[top--]+" is poped out");
	}
	
	public void peek() {
		if(top < 0)
			System.out.println("Stack underflow");
		else {
			System.out.println("Current top element is "+a[top]);
		}
	}
	
	public static void main(String as[]) {
		
		Stackprogram sp = new Stackprogram();
		sp.isEmpty();
		sp.push(1);
		sp.push(2);
		sp.push(3);
		sp.peek();
		sp.pop();
		sp.peek();
	}
}
