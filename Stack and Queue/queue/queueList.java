package queue;
//queue implementation using linked list
public class queueList{
node front, rear;

queueList(){
	front = rear = null;
}

class node{
	int data;
	node next;
}

public void enqueue(int data) {
	node newNode = new node();
	newNode.data = data;
	
	System.out.println(data+" entered the queue");
	
	if(rear ==  null) {
		front = rear = newNode;
		return;
	}
	
	rear.next = newNode;
	rear = newNode;
}

public void dequeue() {
	if(rear == null) {
		System.out.println("queue is empty");
	}
	else {
		System.out.println("Dequed element is"+front.data);
		front = front.next;
	}
	
	if(front == null)
		rear = null;
}


public static void main(String as[]) {
	queueList q = new queueList();
	q.enqueue(10);
	q.enqueue(20);
	q.enqueue(30);
	q.dequeue();
	q.dequeue();
	
}
}
