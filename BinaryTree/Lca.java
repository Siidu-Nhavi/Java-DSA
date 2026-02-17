class Lca {
    // Node class for the binary tree
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    /**
     * Finds the Lowest Common Ancestor (LCA) of two nodes in a Binary Tree.
     * This version uses the corrected, clearer logic.
     */
    public static Node lca(Node root, int n1, int n2) {
        // Base Case 1: If the tree is empty or we've gone past a leaf
        if (root == null) {
            return null;
        }

        // Base Case 2: If the current node's data matches one of the targets
        if (root.data == n1 || root.data == n2) {
            return root;
        }

        // Recursively search in the left and right subtrees
        Node leftLca = lca(root.left, n1, n2);
        Node rightLca = lca(root.right, n1, n2);

        // If both searches return a non-null node, then the current 'root'
        // is the LCA because the targets are in different subtrees.
        if (leftLca != null && rightLca != null) {
            return root;
        }

        // Otherwise, the LCA is in whichever subtree returned a non-null value.
        // This returns the found node up the recursion chain.
        return (leftLca != null) ? leftLca : rightLca;
    }

    public static void main(String[] args) {
        /*
         * 1
         * /  \
         * 2    3
         * / \  / \
         * 4   5 6  7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 5;
        Node result = lca(root, n1, n2);
        if (result != null) {
            System.out.println("Lca is :" + result.data);
        } else {
            System.out.println("LCA of " + n1 + " and " + n2 + " not found.");
        }
        

        
    }
}