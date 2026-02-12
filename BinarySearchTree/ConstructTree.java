public class ConstructTree{
    static class Node{
        int data;
        Node left,right;
        Node (int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static Node insert(Node root,int val){
        if(root == null) {
            //create new Node
            root = new Node(val);
            return root;
        }
        //if the val of root is less than val then insert left otherwise insert right
        if(root.data > val){
            root.left = insert(root.left,val);
        }else{
            root.right = insert(root.right,val);
        }
        return root;
    }

    //to check the nodes are inserted or not we will apply inorder traversal on it.
    public static void inorder(Node root){
        if(root == null) return ;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String args[]){
        int [] values ={5,1,3,4,2,7};
        Node root = null;

        //inserting into Bst
        for(int i=0;i<values.length;i++){
            root = insert(root,values[i]);
        }
        inorder(root); // call the function
    }
}