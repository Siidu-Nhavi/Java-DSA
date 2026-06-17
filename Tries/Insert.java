class Insert {
    static class TrieNode {
        TrieNode[] child = new TrieNode[26];
        boolean isEnd = false;
    }

    static TrieNode root = new TrieNode(); // single root for the whole Trie

    // Insert a single word
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
        current.isEnd = true;
    }

    // Insert multiple words from a String[]
    public static void insertAll(String[] words) {
        for (String word : words) {
            insert(word);
        }
    }

    public static void main(String[] args) {
        String[] words = { "hello", "world", "java", "trie" };
        insertAll(words);

        // Just to show the words we inserted
        for (String w : words) {
            System.out.println("Inserted: " + w);
        }
    }
}
