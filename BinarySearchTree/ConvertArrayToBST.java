public class ConvertArrayToBST {
    public static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node createBST(int [] nums, int st , int end){
        if(st > end){
            return null;
        }

        int mid = (st + end) / 2;
        Node root = new Node(nums[mid]);

        root.left = createBST(nums,st,mid-1);
        root.right = createBST(nums, mid+1, end);

        return root;
    }
    public static void preorder(Node root){
        if(root == null) return;

        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);

    }
    public static void main(String args[]){
        int [] nums = {3,5,6,8,10,11,12};
        Node root = createBST(nums, 0,nums.length-1);
        preorder(root);
    }
}
