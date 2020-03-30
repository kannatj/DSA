package queue;

import java.util.Queue;
import java.util.LinkedList;

public class queueInterface {
	
	Queue<Integer> a = new LinkedList<>();
	
	void enqueue(int arr[]) {
		for(int i=0;i<arr.length;i++)
		    	a.add(arr[i]);
	}
	
	
	void Front() {
		System.out.println(a.peek());
	}
	
	
	void dequeue() {
		System.out.println(a.remove());
	}
	
	
	void display() {
		System.out.println(a);
	}

	
	public static void main(String as[]) {
		queueInterface q = new queueInterface();
		int input[] = {1,2,3,4,5};
		q.enqueue(input);
		q.display();
		q.dequeue();
		q.Front();
		q.display();
	}
	

}
