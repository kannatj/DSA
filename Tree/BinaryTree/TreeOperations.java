package Tree;

import java.util.LinkedList;
import java.util.Queue;
import static java.lang.System.out;

public class TreeOperations {
    
	Node root;
	
	TreeOperations(){
		root = null;
	}
	
	void insert(int value) {
		
		Queue<Node> q = new LinkedList<Node>();
		Node new_node = new Node(value);
		
		if(root == null) {
			root = new_node;
			return;
		}
		else {
			Node temp = root;
			q.add(temp);
			
			while(!q.isEmpty()) {
      
				temp = q.remove();
						
				if(temp.left ==  null) {
					temp.left = new_node;
					break;
				}	
				else if(temp.right == null) {
					temp.right = new_node;
					break;
				}
				else {

					q.add(temp.left);
					q.add(temp.right);
				}
			
			}
		}
		
	}
---------------------------------------------------------------------------------------------------------------------------------------	
	void delete(int val) {
		Queue<Node> q = new LinkedList<Node>();
		
		if(root == null) return;
		
		q.add(root);
		
		while(!q.isEmpty()){
		  Node temp = q.remove();
		  Node result[];
		  Node deepest;
		  Node previous;
		  
		  if(temp.value == val) {
			  result = findDeepest();
			  previous = result[0];
			  deepest = result[1];
			  System.out.println("Deepest : "+ deepest.value);
			  System.out.println("Previous : "+ previous.value);
			  temp.value = deepest.value;
			  deleteDeepestNode(deepest,previous);
			  return;
		  }
		  
		  if(temp.left != null) {
			  q.add(temp.left);
		  }
		  
		  if(temp.right!=null) {
			  q.add(temp.right);
		  }
		
		}
	}
	
	
	
	private void deleteDeepestNode(Node deepest,Node previous) {
		if(previous.left == deepest) {
			previous.left = null;
		}
		else {
			previous.right = null;
		}
	}
	
	private Node[] findDeepest() {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		Node temp = null;
		Node previous = null;
		Node arr[] = new Node[2];
		
		while(!q.isEmpty())
		{
		    temp = q.remove();
		    
		    if(temp.left != null || temp.right != null)
		        previous = temp;
		    
			if(temp.left != null) 
				q.add(temp.left);
			
			if(temp.right != null) 
				q.add(temp.right);
			
		}
		
		arr[0] = previous;
		arr[1] = temp;
		
		return arr;
	}
  
  
  void delete() {
		if(root == null) {
		   out.print("Already tree is empty");
		}
		else {
			root = null;
		}
	}
  
---------------------------------------------------------------------------------------------------------------------------------------

	void inorder(Node root) {
		
		if(root == null) {
			return;
		}
		
		inorder(root.left);
		System.out.print(root.value+" ");
		inorder(root.right);
	}
		
	
	void preorder(Node root) {
			
			if(root == null) {
				return;
			}
		
			System.out.print(root.value+" ");
			preorder(root.left);
			preorder(root.right);
		}
	

	void postorder(Node root) {
		
		if(root == null) {
			return;
		}
		
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.value+" ");
	}
	
	
	void levelOrder() {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty()) {
			Node temp = q.remove();
			System.out.print(temp.value+" ");
			
			if(temp.left != null) {
				q.add(temp.left);
			}
			
			if(temp.right!=null) {
				  q.add(temp.right);
			}	
		}
	}
	
---------------------------------------------------------------------------------------------------------------------------------------
	
	public static void main(String as[]) {
		
		System.out.println("Started");
		TreeOperations t = new TreeOperations();
		
		t.insert(10);
		t.insert(20);
		t.insert(30);
		t.insert(40);
		t.insert(50);
		
		System.out.println(t.root.value);
		System.out.println(t.root.left.value);
		System.out.println(t.root.right.value);
		
		
		t.inorder(t.root);
		out.println();
		t.preorder(t.root);
		out.println();
		t.postorder(t.root);
		out.println();
		t.levelOrder();
		
		
		t.delete(10);
    t.preorder(t.root);
    t.delete(20);
    t.levelOrder();
		
	}	
}
