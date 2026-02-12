import java.util.*;
public class SumofDigits {
    public static int digitSum(int n){
        int sum = 0;
        while(n > 0){
            int lastdigit = n % 10;
            sum = sum + lastdigit;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int n  = sc.nextInt();
        sc.close();
        System.out.println("sum of digits is:"+ digitSum(n));

    }
}
