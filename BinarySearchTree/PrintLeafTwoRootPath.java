import java.util.*;

public class PrintLeafTwoRootPath {
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
            return new Node(val);
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root+" ");
        inorder(root.right);
    }

    // the function which will return the path from root2leaf

    public static void rootTwoLeafPath(Node root,ArrayList<Integer>path){

        if(root == null) return;

        // add current path 
        path.add(root.data);

        //check condition for leaf Node
        if(root.left == null && root.right == null){
            printPath(path); // print all paths
        }

        rootTwoLeafPath(root.left, path); // check inside leftSubtree
        rootTwoLeafPath(root.right, path); // check inside rightSubtree
        path.remove(path.size()-1); // remove path's from the ArrayList and backtrack

    }

    public static void printPath(ArrayList<Integer>path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+" -> ");
        }
        System.out.println("Null");
    }

    public static void main(String args[]) {
        int value[] = { 8, 5, 10, 3, 6, 11, 1, 4, 14 };
        Node root = null;

        for(int i=0;i<value.length;i++){
            root = insert(root,value[i]);
        }

        inorder(root);
        System.out.println();

        rootTwoLeafPath(root, new ArrayList<>());

    }

}
