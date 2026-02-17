public class HeightOfTree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

        public static int height(Node root) {
            if (root == null) {
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }

            //calculating sum of nodes in the tree
        public static int sumNode(Node root){
            if(root == null){
                return 0;
            }
            int leftSum = sumNode(root.left); //left sum calculation
            int rightSum = sumNode(root.right);//right sum calculation
            return leftSum+rightSum+root.data; // finally we the data present at root of the node
             
        }

    



    public static void main(String args[]) {

        /*
         *   1
         *  /  \
         * 2    3
         * / \ / \
         * 4 5 6 7
         * 
         * 
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("height of Tree is:" + height(root));
        System.out.print("The sum of all nodes in the tree is:"+sumNode(root));

    }

}
