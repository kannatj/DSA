package queue;

public class QueueArray {

	private static int arr[];
	private static int front,rear,capacity;
	
	QueueArray(int size){
		arr = new int [size];
		front = -1;
		rear = -1;
		capacity = size;
	}
	
	void enqueue(int data) {
		if(rear == capacity - 1) {
			System.out.println("Queue is full");
			return;
		}
		else {
			if(rear == -1) front = 0;
			arr[++rear]= data;
			
		}		
		return;
	}
	
	
	void dequeue() {
		if(rear == -1) {
			System.out.println("Queue is empty");
			return;
		}
		else {
			for(int i=front;i<=rear-1;i++)
				arr[i]= arr[i+1];
			
			arr[rear--] = Integer.MIN_VALUE;
			
			if(rear==-1) front =-1;
			
			
		}
		return;
	}
	
	void display() {
		if(rear == -1) {
			System.out.println("Queue is empty");
		    return;
		}
		else {
			for(int i=front;i<=rear;i++) {
				System.out.print(arr[i]);
				
				if(i!=rear)
				System.out.print("<--");
			}
			System.out.println();
		}
		return;
	}
	
	
	void queueFront() {
		if(rear == -1) {
		   System.out.println("Queue is empty");
		   return;
		}
		else {
			System.out.println("Front element is "+arr[front]);
		}
		return;
	}
	
	
	public static void main(String as[]) {
		QueueArray q = new QueueArray(5);
		q.enqueue(10);
		System.out.println(front+" "+rear);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.display();
		q.dequeue();
		q.display();
		q.dequeue();
		q.display();
		q.queueFront();
		q.dequeue();
		q.display();
		q.dequeue();
		q.display();
		q.dequeue();
		q.display();
		q.queueFront();
		System.out.println(front+" "+rear);

	}
	
	
}
