public class CountUniqueSubString {
    static class Node {
        Node [] child = new Node[26];
        boolean isEof = false;

        Node(){
            for(int i=0; i<child.length;i++){
                child[i] = null;
            }
        }
    }
    public static Node root = new Node();

    public static void insert(String words){
        Node curr = root;

        for(int i = 0; i < words.length(); i++){
            int idx = words.charAt(i)-'a';

            if(curr.child[idx] == null){
                curr.child[idx] = new Node();
            }
            curr = curr.child[idx];
        }
        curr.isEof = true;
    }

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i=0;i<26;i++){
            if(root.child[i] != null){
                count += countNodes(root.child[i]);
            }
        }
        return count+1;
    }
    public static void main(String args[]){
        String str = "ababa"; //10
        
        //find substring and form the trie
        for(int i = 0; i<str.length();i++){
            insert(str.substring(i));
        }

        System.out.print("Total number of unique substring ="+countNodes(root));
    }
}
