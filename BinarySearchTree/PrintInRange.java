class PrintInRange {
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
        if (root == null)
            return new Node(val);

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    private static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    private static void printInRange(Node root, int k1, int k2) {

        if (root == null)
            return;

        // case 1: value between range
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }

        // case 2: value smaller than range
        else if (root.data < k1) {
            printInRange(root.right, k1, k2);
        }

        // case 3: value greater than range
        else {
            printInRange(root.left, k1, k2);
        }
    }

    public static void main(String args[]) {
        int value[] = { 8, 5, 10, 3, 6, 11, 1, 4, 14 };
        Node root = null;

        // insert values
        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }

        inorder(root);
        System.out.println();
        int k1 = 5, k2 = 12;
        printInRange(root, k1, k2);

    }

}