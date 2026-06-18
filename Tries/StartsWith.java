public class StartsWith {
    static class Node {
        Node[] child = new Node[26];
        boolean isEof = false;

        Node() {
            for (int i = 0; i < child.length; i++) {
                child[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.child[idx] == null) {
                curr.child[idx] = new Node();
            }
            curr = curr.child[idx];
        }
        curr.isEof = true;
    }

    public static boolean startWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.child[idx] == null) {
                return false;
            }
            curr = curr.child[idx];
        }
        return true;
    }

    public static void main(String args[]) {
        String[] words = { "apple", "app", "mango", "man", "woman" };
        String prefix1 = "apple";
        String prefix2 = "mango";

        for (String word : words) {
            insert(word);
        }

        System.out.println(startWith(prefix1)); // true
        System.out.println(startWith(prefix2)); // true
        System.out.println(startWith("wo")); // true
        System.out.println(startWith("cat")); // false
    }
}
