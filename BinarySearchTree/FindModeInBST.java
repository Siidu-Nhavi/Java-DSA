import java.util.*;

public class FindModeInBST {
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

    public static void inorder(Node root, HashMap<Integer,Integer> map){
        if(root == null) return;
        inorder(root.left, map);
        map.put(root.data,map.getOrDefault(root.data, 0)+1);
        inorder(root.right,map);
    }

    // function to find modes
    private static int [] findMode(Node root){
        HashMap<Integer,Integer> map = new HashMap<>();

        inorder(root,map); // inorder on map

        int maxFreq = 0;
        for(int freq : map.values()){ // calculate maximum frequency
            maxFreq = Math.max(maxFreq,freq);
        }

        // add key's to the list
        List <Integer> list = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key) == maxFreq){
                list.add(key);
            }   
        }

        // convert list to array
        int result [] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i] = list.get(i);
        }

        return result;

    }
    public static void main (String args[]){
        int value[] = { 7,4,8,4,8,10 };
        Node root = null;
        // insert into root
        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);

        }
        
        System.out.println("The mode of given tree is :"+Arrays.toString(findMode(root)));
        
    }
    
}
