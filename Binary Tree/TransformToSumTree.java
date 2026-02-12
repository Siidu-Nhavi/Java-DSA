class TransformToSumTree{
	static class Node{
		int data;
		Node left,right;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public static void preorder(Node root){
		if(root == null) return;
		
		System.out.print(root.data +" ");
		preorder(root.left);
		preorder(root.right);	
	}
	
	
	public static int sumTree(Node root) {
    //  Base Case: If the node is null, the sum of its subtree is 0.
    if (root == null) {
        return 0;
    }

    // Store the original value of the current node before it is changed.
    int originalValue = root.data;

    //  get the sum of the left and right subtrees.
    int leftSubtreeSum = sumTree(root.left);
    int rightSubtreeSum = sumTree(root.right);

    //  Update the current node's data. Its new value is the sum of its subtrees.
    // For a leaf node, both sums will be 0, so its data becomes 0.
    root.data = leftSubtreeSum + rightSubtreeSum;

    // 5. Return the sum of the *original* subtree to the parent caller.
    return originalValue + leftSubtreeSum + rightSubtreeSum;
}
	public static void main(String args[]){
	    /* 
         *    1                       27
         *  /   \                    /  \
         * 2    3     ====>         9   13
         * / \  / \                / \  / \
         * 4  5 6  7              0   0 0  0
         */
	
	Node root = new Node(1);
	root.left = new Node(2);
	root.right = new Node(3);
	root.left.left = new Node(4);
	root.left.right = new Node(5);
	root.right.left = new Node(6);
	root.right.right = new Node(7);
	
	sumTree(root);
	preorder(root);
	
	
	}
}