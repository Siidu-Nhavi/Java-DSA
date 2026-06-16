public class Search {
    static class TrieNode{
        TrieNode [] child = new TrieNode[26];
        boolean isEof = false;
    }

    static TrieNode root = new TrieNode();

      public static void insert(String word) {
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int idx = ch - 'a'; // assumes lowercase letters
            if (current.child[idx] == null) {
                current.child[idx] = new TrieNode();
            }
            current = current.child[idx];
        }
        current.isEof = true;
    }

     public static void insertAll(String[] words) {
        for (String word : words) {
            insert(word);
        }
    }

    public static boolean search(String words){
        TrieNode curr = root;
        for(char ch : words.toCharArray()){
            int i = ch-'a';
            if(curr.child[i] == null){
                return false;
            }
            curr = curr.child[i];
        }
        return curr.isEof == true;
    }
    

    public static void main(String args[]){
        
        String[] words = { "hello", "world", "java", "trie" };
        insertAll(words);

        System.out.println(search("thee"));
        System.out.print(search("tri"));
    }
}