import java.util.*;

public class FirstNonRepeating {
    public static void firstNonRepeating(String str) {
        // 1.creating an frequency array of size 26
        int freq[] = new int[26];// to store 'a'-> 'z'
        // 2. create an character queue
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // find character
            q.add(ch); // put i.e char into queue
            freq[ch - 'a']++; // then increase count of char by 1
        

            // here only two cases are possible 1.my queue is empty 2.freq of char > 1
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }
            if (q.isEmpty()) { // true
                System.out.print(-1 + " ");
            } else {
                System.out.print(q.peek() + " ");
            }
            System.out.println();
        }
        
    }

    public static void main(String args[]) {
        String str = "ababcbaax";//c
        firstNonRepeating(str);

    }

}
