public class Palindrome {
    public static boolean isPalindrome(String s1) {
        int n = s1.length();
        for (int i = 0; i < s1.length()/2; i++) { // traversing on string
            
            if (s1.charAt(i) != s1.charAt(n - i - 1)) { // this condition for non palindrome
                //not palindrome
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
        // if(isPalindrome(str)){
        //     System.out.println("the string is palindrome");
        // }else{
        //     System.out.println("string is not palindrome");
        // }
       

    }

}
