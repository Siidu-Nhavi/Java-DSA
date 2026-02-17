public class ValidateBST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val); // create new Node
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static Node prev = null;

    public static boolean isValid(Node root) {
        if (root == null) {
            return true;
        }

        // check left subtree
        if (!isValid(root.left)) {
            return false;
        }

        // compare prev vs current Nodes
        if (prev != null && root.data <= prev.data) {
            return false;
        }

        prev = root;

        // check right subtree
        return isValid(root.right);
    }

    public static void main(String args[]) {
        int values[] = { 5, 1, 4,3,2 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        System.out.println(isValid(root));// false

    }

}
