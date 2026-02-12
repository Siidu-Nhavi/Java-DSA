class UnivaluedBinaryTree{

	static class Node{
		int data;
		Node left,right;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public static boolean isUnivalued(Node root){
		if(root == null){
			return true;
		}
		if((root.left != null ) && root.data!= root.left.data ) return false;
		
		if((root.right != null) && root.data!= root.right.data) return false;

	return isUnivalued(root.left) && isUnivalued(root.right);
		
	}
	public static void main(String args[]){
	
	// case 1
	System.out.println("Case Number 1");
	Node root = new Node(2);
	root.left = new Node(2);
	root.right = new Node(2);
	root.left.left = new Node(5);
	root.left.right = new Node(2);
	
	if(isUnivalued(root)){
		
		System.out.println("YES");
	}else{
		System.out.println("NO");
	}
	
	System.out.println("Case Number 2");
	Node rt = new Node(2);
	rt.left = new Node(2);
	rt.right = new Node(2);
	rt.left.left = new Node(2);
	rt.left.right = new Node(2);
	
	if(isUnivalued(rt)){
		
		System.out.print("YES");
	}else{
		System.out.println("NO");
	}
	
	}

}