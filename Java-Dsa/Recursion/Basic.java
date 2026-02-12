//import java.util.*;
public class Basic{

    public static void print_Decreasing(int n){
        if(n == 1){ // base case
            System.out.print(n);
            return ;
        }
        System.out.print(n+" ");
        print_Decreasing (n-1);// function calls itself again and agin until it hits an base case
    }
    public static void print_increasing(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        print_increasing(n-1);
        System.out.print(n+" ");
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int nm1 = factorial(n-1);
        int fn = n * nm1;
        return fn;
    }
    //sum of first n natural numbers
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int nm1 = sum(n-1);
        int sum = n+nm1;
        return sum;
    }
    public static int fib(int n){
        if(n==0 || n==1){
            return 1;
        }
        int nm1 = fib(n-1);
        int nm2 = fib(n-2);
        int fibnum = nm1 + nm2;
        return fibnum;
    }
    public static void main(String args[]){
       // Scanner sc = new Scanner(System.in);
        //System.out.print("enter number:");
        //int n = sc.nextInt();
        //sc.close();
        //print_Decreasing(n);
        //print_increasing(n);
        // System.out.println("the factorial of given number is:"+factorial(6));//120
        // System.out.println("the sum of first n natural numer is:"+sum(5));//15
        System.out.println("the fibonacci term is:"+fib(5));//5

       


    }
}