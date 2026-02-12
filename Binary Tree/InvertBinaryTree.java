class InvertBinaryTree{
	static class Node{
		int data;
		Node left,right;
		
		public Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public static Node invertBinTree(Node root){
		if(root == null) return null;
		
		Node left = invertBinTree(root.left); // find the all nodes from the left subtree
		Node right = invertBinTree(root.right); // find the all nodes from the right subtree
		
		// swapping the nodes 
		root.left = right;
		root.right = left;
		
		return root;
	}
	// for printiing the result on the console i will do inorder traversal
	
	public static void inorderTraversal(Node root){
		if(root == null) return ;
		
		
		inorderTraversal(root.left);
		System.out.print(root.data+" ");
		inorderTraversal(root.right);
	}
	
	public static void main(String args[]){
	
	Node root = new Node(2);
	root.left = new Node(2);
	root.right = new Node(2);
	root.left.left = new Node(5);
	root.left.right = new Node(2);
	root.right.left = new Node(2);
	root.right.right = new Node(2);
	
	System.out.print("Original tree (in-order): ");
    inorderTraversal(root); // Output: 5 2 2 2 2 2 2
    System.out.println();
	
	
	System.out.print("The inverted binary tree is:");
	Node invert = invertBinTree(root);
	inorderTraversal(invert);
	System.out.println(); 
	
	
	}


}
