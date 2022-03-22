package linkedList;

public class circularLinky {

	Node head;
	public class Node{
		Node next;
		int data;
	}
	
	public void insert(int data) {
		Node itr = head;
		Node new_node = new Node();
		new_node.data = data;
		
		
		if(head == null) {
			head = new_node;
			new_node.next = new_node;
		}
		else {
			
		   while(itr.next != head){
				itr = itr.next;
		   }
			
			itr.next = new_node;
			new_node.next = head;
		}
		
	}
	
	public void delete(int data) {
		Node itr = head,prev = null;
		
		
		//Iterating and identifying the previous and next position of the data
		while(itr.data != data) {
			if(itr.next == head) {
				System.out.println("No elements found");
			    break;
		    }
			prev = itr;                // Previous node
			itr = itr.next;            // Next node
		}
		
		
		//If data is the only node
		if(itr.next == head && prev == null) {
			head = null;
			return;
		}
		
		//If data is in head and have some nodes in addition
		if(itr == head) {
			prev = head;
			
			while(prev.next != head) {
				prev = prev.next;
			}
			
			head = head.next;
			prev.next = head;
		}
		
		
		//If data is in the last node 
		else if (itr.next == head && prev != null) {
		    prev.next = head;	
		}
		
		
		//Elsewhere in the middle
		else {
			prev.next = itr.next;
		}
		
		
	}
	
	
	public void print() {
		Node itr = head;
		if(head != null) {
			System.out.println("Printing list: \n");
			do {
				System.out.print(itr.data+" ");
				itr = itr.next;
			}while(itr != head);
	 }
	}
	
	
	public void count() {
		Node itr = head;
		int count = 0 ;
		
		if(head == null)
			System.out.println("Count "+ count);
		else {
			 do{
				count++;
				itr = itr.next;
			}while(itr!= head); 
			System.out.println("Count "+ count);
		}
	}
	
	void SlToCl() {
		Node itr = head;
		
		while(itr.next != null) {
			itr = itr.next;
		}
		itr.next = head;
	}
	
	public static void main(String as[]) {
		Circular cl = new Circular();
		for(int i =1;i<6;i++) {
		   cl.insert(i);
		}
		
		cl.print();
		cl.count();
		cl.delete(5);
		cl.print();
		cl.delete(1);
		cl.print();
	}
}
