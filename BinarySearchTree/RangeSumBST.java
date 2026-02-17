public class RangeSumBST {
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

    public static int rangeSum(Node root,int low,int high){
        if(root == null){
            return 0;
        }

        if(root.data < low){
            return rangeSum(root.right,low,high);
        }
        if(root.data > high){
            return rangeSum(root.left,low,high);
        }
        return root.data+rangeSum(root.left,low,high)+rangeSum(root.right,low,high);
    }

    public static void main(String args[]){
        int value[] = { 8, 5, 10, 3, 6, 11, 1, 4, 14 };
        Node root = null;

        for(int i=0;i<value.length;i++){
            root = insert(root,value[i]);
        }
        System.out.println("the sum of nodes in the range is ="+rangeSum(root,5,14)); // 5 + 8 + 6 + 10 + 11 + 14 = 54

    }
    
}
