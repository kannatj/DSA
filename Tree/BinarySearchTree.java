package tree;

class BSTNode {
	BSTNode left,right;
    int data;
    
	public BSTNode(int data2) {
		// TODO Auto-generated constructor stub
		left = null;
		right = null;
		data = data2;
	}
	public BSTNode getLeft() {
		return left;
	}
	public void setLeft(BSTNode left) {
		this.left = left;
	}
	public BSTNode getRight() {
		return right;
	}
	public void setRight(BSTNode right) {
		this.right = right;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}	
}

class BST{
	private BSTNode root;
	
	public BST() {
		root = null;
	}
	
	public boolean isEmpty() {
		if(root == null)
			return true;
		else 
			return false;
	}
	
	public boolean search(int data) {
		return search(root, data);
	}
	
	private boolean search(BSTNode node,int data) {
		boolean found = false;
		while(node!= null && !false) {
		    int retval = node.getData();
		    
		    if(retval < data) {
		    	search(node.getLeft(),data);
		    }
		    else if( retval > data) {
		    	search(node.getRight(),data);
		    }
		    else if( retval == data) {
		    	found = true;
		    	System.out.println("Data found in the tree");
		    }
		    else{
		       found = false;	
		    }
		}
		
		return found;
	}
	
	
	public void insert(int data) {
		root = insert(root,data);
	}
	
	private BSTNode insert (BSTNode node,int data) {
		if(node == null) {
			node = new BSTNode(data);
		}
		else{
			if(data <= node.getData())
				node.left =insert(node.left,data);
			else
				node.right = insert(node.right,data);
		}
		
		return node;
	}
	
	
	public void inorder() {
		inorder(root);
	}
	
	private void inorder(BSTNode node) {
		if(node != null) {
			inorder(node.getLeft());
			System.out.println(node.getData() +" ");
			inorder(node.getRight());
		}
	}
	
	public void preorder() {
		preorder(root);
	}
	
	private void preorder(BSTNode node) {
		if(node != null) {
			System.out.println(node.getData() +" ");
			preorder(node.getLeft());
			preorder(node.getRight());
		}
	}
	
	
	public void postorder() {
		postorder(root);
	}
	
	private void postorder(BSTNode node) {
		if(node != null) {
			System.out.println(node.getData() +" ");
			postorder(node.getLeft());
			postorder(node.getRight());
		}
	}
	
}


public class BinarySearchTree {
  public static void main(String as[]) {
	  
  }
}
