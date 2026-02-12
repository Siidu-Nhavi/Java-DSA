public class DiameterOfBt {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left = null;
            this.right = null;
        }

    }

    static class Info{
        int diam;
        int ht;
        
        public Info(int diam,int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    // there exist an method to solve this question but by that approach time complexity is:O(n^2)
    // this is the best approach to solve this question and the timeComplexity is:O(n)
     public Info diamOfTree(Node root) {
        if (root == null) return new Info(0, 0);

        Info linfo = diamOfTree(root.left);
        Info rinfo = diamOfTree(root.right);

        int finalDiam = Math.max(Math.max(linfo.diam, rinfo.diam), linfo.ht + rinfo.ht + 1);
        int finalHt = Math.max(linfo.ht, rinfo.ht) + 1;

        return new Info(finalDiam, finalHt);
    }


    public static boolean isSubtree(Node root, Node subroot){
        if(root == null){
            return false;
        }

        if(root.data == subroot.data){
            if(isIdentical(root,subroot)){
                return true;
            }
        }
        boolean left = isSubtree(root.left, subroot);
        boolean right = isSubtree(root.right, subroot);

        return left || right;
    }


    public static boolean isIdentical(Node node,Node subroot){
        if((node == null)  && (subroot == null)){
            return true;
        }else if((node == null) || (subroot == null) || (node.data != subroot.data)) {
            
                return false;
        }
        if(!isIdentical(node.left, subroot.left)) return false;
        if(!isIdentical(node.right, subroot.right)) return false;

        return true;

    }


    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);
        subroot.left.left = new Node(6);

        

        DiameterOfBt tree = new DiameterOfBt();
        // Info result = tree.diamOfTree(root);
        System.out.print("The given tree is Subtree :"+tree.isSubtree(root,subroot));



        // System.out.print("The diam of tree is:"+result.diam+"\n"+"The height of binary tree is:"+result.ht+" ");
    }
    
}
