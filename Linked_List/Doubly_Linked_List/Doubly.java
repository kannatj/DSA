package linkedList;

public class Doubly {
	
	Node head;
	
	class Node{
		Node next,prev;
		int data;
	}
	
	public void push(int data) {
		Node new_node = new Node();
		new_node.data = data;
		
		   new_node.next = head;
		   new_node.prev = null;
		   
		   if(head != null) {
			   head.prev = new_node;
		   }
		   
		   head = new_node;
	}
	
	public void insertAfter(Node prevNode, int data) {
	
		
		if(prevNode!= null) {
			Node new_node = new Node();
			new_node.data = data;
			
			new_node.next = prevNode.next;
			prevNode.next = new_node;
			new_node.prev = prevNode;
			
			if(new_node.next != null) {
				new_node.next.prev = new_node;
			}
			
		}
		else {
			System.out.println("prev node does not exist");
		}
		
	}
	
	public void insertAtEnd(int data) {
		Node new_node = new Node();
		new_node.data = data;
		Node itr = head;
		
		while(itr.next != null) {
			itr = itr.next;
		}
		
		itr.next = new_node;
		new_node.next = null;
		new_node.prev = itr;
			
	}
	
	public void delete(int data) {
		Node itr = head;
		
		if(data == head.data) {
			head = head.next;
			return;
		}
		
		while(itr.data != data) {
			itr = itr.next;
		}
		
		if(itr.next != null) {
			 itr.prev.next = itr.next;
			 itr.next.prev = itr.prev;
		}
		else {
			itr.prev.next = null;
		}
		
	}
	
	public void print() {
		Node itr = head;
		
		while(itr != null) {
			System.out.println(itr.data);
			itr = itr.next;
		}
	}
	
	public static void main(String as[]) {
		Doubly dl = new Doubly();
		dl.push(1);
		dl.insertAtEnd(2);
		dl.insertAtEnd(3);
		dl.insertAtEnd(4);
		
		dl.print();
		dl.delete(1);
		dl.print();
		dl.delete(4);
		dl.print();
		
	}

}
