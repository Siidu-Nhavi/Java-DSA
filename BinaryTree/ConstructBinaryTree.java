import java.util.*;

class ConstructBinaryTree {
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

    public static Node BuildTree(int[][] nodes) {
        // create a map to store the nodes by their data value
        // it prevents the duplicates of nodes
        Map<Integer, Node> map = new HashMap<>();

        Set<Integer> children = new HashSet<>(); // create a set to keep track of all child nodes, this will help us to
                                                 // find the root node later

        for (int[] d : nodes) { // iterate through the input array to build the tree
            int parent = d[0]; // get the parent value from the input array
            int child = d[1]; // get the child value from the input array
            // get the isLeft value from the input array to determine if the child is a left
            // or right child
            int isLeft = d[2];

            // create the node if it doesn't exist in the map
            map.putIfAbsent(parent, new Node(parent));
            map.putIfAbsent(child, new Node(child));

            Node parentNode = map.get(parent);
            Node childNode = map.get(child);

            if (isLeft == 1) {
                parentNode.left = childNode;
            } else {
                parentNode.right = childNode;
            }

            children.add(child);
        }
        // find the root node (the one that is not a child of any other node)
        for (int[] d : nodes) {
            int parent = d[0]; // get the parent value from the input array

            if (!children.contains(parent)) { // if the parent is not in the children set, it is the root
                return map.get(parent);// return the root node
            }
        }
        return null; // return null if no root is found

    }

    public static void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " "); // visit the root
        preOrder(node.left); // traverse the left subtree
        preOrder(node.right); // traverse the right subtree
    }

    public static void main(String[] args) {
        int[][] nodes = {
                { 20, 15, 1 },
                { 20, 17, 0 },
                { 50, 20, 1 },
                { 50, 80, 0 },
                { 80, 19, 1 }
        };

        Node root = BuildTree(nodes);
        // print the tree in pre-order traversal to verify the structure
        preOrder(root);// expected output:50 20 15 17 80 19
    }
}