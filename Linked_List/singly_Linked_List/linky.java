package linkedList;

import java.util.Scanner;

public class Linky {

	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	
	/*
	 * 
	 * 
	 * This method will insert data into the linked list in 3 different ways.
	 * Insert in 1st pos, in middle of the list, append to the list.
	 * @param position and data want to insert.
	 * pos - 1 to insert as first element, 
	 * pos - 0 to append element to the end of the list,
	 * pos - 1 - n to insert in the middle of the list.
	 * 
	 * 
	 */
	public void insert(int pos,int data) {
		Node newNode = new Node(data);
		    
		    // To insert in the first position of the linked list
			if(pos==1) {
				newNode.next = head;
				head = newNode;
		    }
			
			//To insert in the middle of the linked list
			else if (pos > 1) {
				Node itr = head;
				int count = 1;
				
				if(itr == null) {
					System.out.println("Head is not empty, Inserting current data as head");
					insert(1,data);
					print();
					return;
				}
				
				//count will help to iterate to the previous position the actual position
				while(count < pos-1) {
					
					//If the position greater than the actual list then appending data to end of the list.
					if(itr.next == null) {
						System.out.println("List exist only upto "+count+" ,so inserting data in the end of the current list");
						insert(0,data);
						print();
						return;
					}
					
					//Else iterate the to position we need to insert and place the data
					else {
					  itr = itr.next;
					  count++;
					}
				}
				
				newNode.next = itr.next;
				itr.next = newNode;
				print();
				return;
			}
			
			//To append data in the linked list
			else if(pos == 0) {
				Node itr = head;
				while(itr.next != null) {
					itr = itr.next;
				}
				itr.next = newNode;
			}
			
			return;
	}
	
	
	
	/*
	 * 
	 * 
	 * Function to delete element in the linked list
	 * @param pass position which we want to delete from the linked list
	 * pos A - To delete entire linked list
	 * pos F - To delete first element in the linked list
	 * pos L - To delete last element in the linked list
	 * 
	 * 
	 */
	
   public void delete(char pos){
		Node itr = head;
		
		//If list empty
		if(itr == null) {
			System.out.println("List empty");
			return;
		}
		
		//Delete the entire list
		else if(pos == 'A') {
			head = null;
			System.out.println("Entire list is deleted");
			return;
		}
		
		//Delete first element of the list
		else if(pos == 'F') {
			head = itr.next;
			System.out.println("Deleted first element in the list");
			print();
			return;
		}
		
		else if(pos == 'L') {
			Node prev = null;
			while(itr != null) {
				prev = itr;
				itr = itr.next;
			}
			
			prev.next = null;	
		}
		
   }

   
   
   /*
    * 
    * 
    * Function to delete element based on the positon and data
    * 
    * 
    */
   
   public void delete(int pos, int data) {
	   
	   Node itr = head;
	   if(itr.next != null) {
		   if(pos>1) {
				Node prev = null;
				
				while(itr != null && itr.data != data) {
					prev = itr;
					itr = itr.next;
				}
				
				prev.next = itr.next;
				
			}
		   System.out.println("Element "+data+" in position "+pos+" is deleted");
	   }
	  else 
		  System.out.println("List empty");
			
	}
   
   
   /*
    * 
    * 
    * Function to print the linked list
    * 
    * 
    */
	
	public void print() {
		Node itr = head;
		if(itr == null) {
			System.out.println("No element in the list");
		}
		else {
		System.out.println("PRINTING CURRENT LINKED LIST :");	
		while(itr != null) {
			System.out.print(itr.data);
			itr = itr.next;
			if(itr !=null)
				System.out.print("->");
		  }
		}
	}
	
	
	
	
	/*
	 * 
	 * 
	 * Function to return the position of the element in the linked list
	 * @param element which we want to know the position
	 * 
	 * 
	 */
	public void position(int data) {
		Node itr = head;
		int count = 0;
		
			while(itr != null) {
				count++;
				
				if(itr.data == data) {
					System.out.println("Data "+data+" is in position "+count);	
			    }
				
				itr = itr.next;
		   
			}
			
			if(count==0)
				System.out.println("Data "+data+" not present in the list");
			
		}
	
	
	
	/*
	 *
	 *
	 * Function to reverse the linked list
	 * prev  -  points previous element
	 * next - points next element
	 * current - points current element
	 * 
	 * 
	 */
	public void reverse() {
		Node prev = null;
		Node next = null;
		Node current = head;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			
			prev = current;
			current = next;
		}
		
		head = prev;
		System.out.println("Reverse operation finished");
		print();
		return;
	}
		

	
	public static void main(String as[]) {
		Linky link = new Linky();
		Scanner sc = new Scanner(System.in);
		int option;
		boolean dowhile = false;
		
		link.insert(1,1);    //1
		link.insert(1,2);    //2->1 
		link.insert(0,4);    //2->1->4
		link.insert(0,6);    //2->1->4->6
		link.insert(3,3);    //2->1->3->4->6
		link.insert(5,5);    //2->1->3->4->5->6\
		link.insert(0, 6);
		link.position(2);    //2
		link.delete('F');    //1->3->4->5->6
		link.insert(2,2);
		link.print();
		link.position(5);    
		link.delete(5,5);
		link.print();
		link.reverse();
		link.position(6);

		
		
		
//		do {
//		System.out.println("Enter the operation you need to perform");
//		System.out.println("1. Insert\n2. Print");
//		int operation = sc.nextInt();
//		
//		switch(operation) {
//		   case 1:
//			    System.out.println("****************************************************************");
//				System.out.println("To insert in the start of the list enter pos as 1 and then data");
//				System.out.println("To insert in the middle of the list enter pos greater than 1");
//				System.out.println("To insert in the last of the list enter pos as 0 and then data");
//				System.out.println("****************************************************************");
//				System.out.println("Enter pos");
//				int pos = sc.nextInt();
//				System.out.println("Enter data");
//				int data = sc.nextInt();
//				link.insert(pos, data);
//			break;
//			
//		   case 2:
//			   link.print();
//			   break;
//			   
//		   default:
//			   System.out.println("Operation does not exit");
//			
//		}
//		 
//		 System.out.println("If you want to continue give option as 1 else 0");
//		 option = sc.nextInt();
//		 if(option == 1)
//			 dowhile = true;
//		 else if(option == 0)
//			 dowhile = false;
//			
//		}while(dowhile);
		
	}
	
}
