public class MirrorBST {
    static class Node {
        int data;
        Node left,right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node mirrorBST(Node root){
        //base case
        if(root == null){
            return null;
        }
        //step1:calculate left and right subtree with their respective node's and store them in left and right pointers
        Node left = mirrorBST(root.left);
        Node right = mirrorBST(root.right);
        
        // step2:swap here with calculate nodes
        root.left = right;
        root.right = left;

        return root;
    }
     // Inorder print to verify mirror
    public static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(10);
        root.right.right.right = new Node(11);

        mirrorBST(root);
        System.out.println("The tree after mirror:");
        preorder(root);
    }
    
}
