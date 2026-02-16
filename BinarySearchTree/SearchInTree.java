public class SearchInTree {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Node insert(Node root, int val) {
        if (root == null) {
            // create new Node
            root = new Node(val);
            return root;
        }
        // if the val of root is less than val then insert left otherwise insert right
        if (root.data < val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    private static boolean search(Node root, int key) {
        if (root == null)
            return false;
        if (root.data == key)
            return true;
        else if (root.data < key)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    public static void main(String args[]) {
        int[] values = { 5, 1, 3, 4, 2, 7 };
        int key=9;
        Node root = null;
        for(int i=0;i<values.length; i++){
            root=insert(root, values[i]);
        }
        if(search(root,key)){
            System.out.print("Found");
        }else{
            System.out.println("Not Found");
        }

    }
}
