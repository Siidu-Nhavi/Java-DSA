import java.util.*;

public class BinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        // constructor
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTreeB {
        static int index = -1;

        public static Node buildTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);

            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // preorder traversal technique
        public static void preorder(Node root) {
            // base condition
            if (root == null) {
                return;
            }

            // rule 1.root
            System.out.print(root.data + " ");
            // rule 2.left
            preorder(root.left);

            // rule 3.right
            preorder(root.right);
        }

        // inorder traversal technique
        public static void inorder(Node root) {
            // base case
            if (root == null) {
                return;
            }
            // rule 1.left
            inorder(root.left);
            // rule2.root
            System.out.print(root.data + " ");
            // rule3.right
            inorder(root.right);
        }

        // postorder traversal technique
        public static void postorder(Node root) {
            // base case
            if (root == null) {
                return;
            }
            // rule 1:left subtree
            postorder(root.left);
            // rule 2:right subtree
            postorder(root.right);
            // rule 3:root
            System.out.print(root.data + " ");
        }

        public static void levelOrderTraversal(Node root) {
            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<Node>();
            // queue is not null then add 1,null to the queue
            q.add(root);
            q.add(null);

            // now first add all elements to the queue and then remove them one by one

            while (!q.isEmpty()) {
                Node currNode = q.remove(); // remove and store into currNode

                // check if cuurNode is empty
                if (currNode == null) {
                    System.out.println();

                    if (q.isEmpty()) { //if queue is empty then break
                        break;
                    } else { // nahi to add karo null
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " "); // nahi to currNode ka data print karo

                    if (currNode.left != null) { // check currnode of left is null or not is  if not then add to queue
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right); //check currnode of left is null or not is  if not then add to queue
                    }
                }
            }
        }
    }

    public static void main(String ar[]) {

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTreeB tree = new BinaryTreeB();
        Node root = tree.buildTree(nodes);
        System.out.println("Root Node is:" + root.data);

        // System.out.print("Preorder Traversal:");
        // tree.preorder(root);

        // System.out.println("Inorder Traversal:");
        // tree.inorder(root);

        // System.out.print("Postorder Traversal:");
        // tree.postorder(root);

        System.out.print("Level Traversal is:");
        tree.levelOrderTraversal(root);

    }

}