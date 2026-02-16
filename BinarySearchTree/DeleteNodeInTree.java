public class DeleteNodeInTree {
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
            return root = new Node(val);
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    private static Node deleteNode(Node root, int val) {
        if (root == null)
            return null;
        // search and delete
        if (root.data < val) {
            root.right = deleteNode(root.right, val);
        } else if (root.data > val) {
            root.left = deleteNode(root.left, val);
        } else {

            // root.data == val //voila case

            // case 1: leaf Node's
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2: for single child
            else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {

                // case 3:both two childern are null

                // 1.find and replace with inorder successsor
                // 2.delete the node for inorder successor

                Node IS = findInOrderSuccessor(root.right);
                root.data = IS.data;

                root.right = deleteNode(root.right, IS.data);

            }

        }
        return root;

    }

    // function which will calculat Inorder Successor of right root
    public static Node findInOrderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String args[]) {
        int value[] = { 8, 5, 10, 3, 6, 11, 1, 4, 14 };
        Node root = null;
        // insert into root
        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);

        }

         root = deleteNode(root, 14);
         inorder(root);

    }

}
