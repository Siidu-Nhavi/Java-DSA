import java.util.*;
public class CheckPalindrome {
    public static boolean isPalindrome(int n){
        int original = n;
        int rev = 0;
        while(n > 0){
            int lastdigit = n % 10;
            rev = rev *10+lastdigit;
            n = n/10;
          
        }
        return (original == rev);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int n = sc.nextInt();
        sc.close();
        if(isPalindrome(n)){
            System.out.println("number is palindrome");

        }else{
            System.out.println("number is not palindrome");
        }
            
        }
    }
    

