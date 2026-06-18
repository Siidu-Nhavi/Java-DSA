public class LongestWordWithPrefixex {
    static class Node {
        Node[] child = new Node[26];
        boolean eow = false;
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';

            if (curr.child[idx] == null) {
                curr.child[idx] = new Node();
            }
            curr = curr.child[idx];
        }
        curr.eow = true;
    }

    public static String ans = "";

    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }

        for (int i = 0; i < 26; i++) {
            if (root.child[i] != null && root.child[i].eow) {

                char ch = (char) (i + 'a');
                temp.append(ch);

                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }

                longestWord(root.child[i], temp);

                temp.deleteCharAt(temp.length() - 1); // backtrack
            }
        }
    }

    public static void main(String args[]) {
        String[] words = { "a", "ap", "app", "appl", "apple", "apply", "banana" };

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        longestWord(root, new StringBuilder(ans));
        System.out.print(ans);
    }
}
