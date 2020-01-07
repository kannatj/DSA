package circularLinkedList;

public class CircularLinky {
	
	Node head;
	class Node {
		int data;
		Node next;
		
		Node(int d){
			data = d;
		}
	}
	
	public void insert(int data) {
		Node new_node = new Node(data);
		Node tmp = head;
		
		new_node.data = data;
		//new_node.next = head;
		
		if(head != null) {
			while(tmp.next != head) {
				tmp = tmp.next;
			}
			
			tmp.next = new_node;
			new_node.next = head;
		}
		else {
			new_node.next = new_node;
            head = new_node;		
		}
		
		//head = new_node;
		return;
	}
	
	public void print() {
		Node itr = head;

		
		if(head!=null)
		do {
		  System.out.println(itr.data);
		  itr = itr.next;
		}while(itr!= head);
		
		return;
	}
	
	public void delete(int data) {
		Node itr = head;
		Node prev;
		
		if(head != null) {
			if(itr.data == data) {
				head = head.next;
			}
		}
			
	}
	
	public void count() {
		Node itr = head;
		int count = 0;
		if(head!= null) {
			do{
				count++;
				itr = itr.next;
			}while(itr != head);
			System.out.println("No of nodes in the circular linked list is "+count);
		}
		else {
			System.out.println("Empty Linkedlist");
		}
	}
	
	public void linked_to_circular() {
		Node itr = head;
		while(itr.next!=null) {
			itr = itr.next;
		}
		
		itr.next = head;
	}
	public static void main(String as[]) {
		CircularLinky cl = new CircularLinky(); 
		cl.count();
		for(int i =1;i<=5;i++)
			cl.insert(i);
		
//		cl.insert(10);
//		cl.insert(20);
//		cl.insert(30);
//		cl.insert(40);
//		cl.insert(50);
//		cl.insert(60);
		cl.print();
//cl.insert(70);
		cl.delete(1);
		cl.count();
		cl.print();
		System.out.println("Head :"+cl.head.data);
	}
	

}
