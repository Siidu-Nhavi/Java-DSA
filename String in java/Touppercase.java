public class Touppercase {
    public static String touppercase(String str) {
        StringBuilder sb = new StringBuilder("");
        // this is for converting an single letter to upper case
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        // now converting remaining letters to upper case
        for (int i = 1; i < str.length(); i++) {
            // If space is found and it's not the last character
            if (str.charAt(i) == ' ' && i < str.length() - 1) {

                sb.append(' '); // Append the space

                i++; // Move to next character

                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {

                sb.append(str.charAt(i)); // print as it is
            }
        }

        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "siddu nhavi";
        
        System.out.println(touppercase(str)); // Siddu Nhavi

    }

}
