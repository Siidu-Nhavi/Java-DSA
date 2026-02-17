import java.util.*;
public class Basic{
    public static void OddEven(int num){
        int BitMask = 1;
        if((num & BitMask)== 0){
            System.out.println("the number is even");
        }else{
            System.out.println("the number is odd");
        } 
    }
    public static void main(String args[]){
        System.out.println("the ones complement of number:"+~5);
        System.out.println( 6 << 3);
        System.out.println(6>>2);

        //check if no is odd or even using bit manipulation

        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int num = sc.nextInt();
        sc.close();
        OddEven(num);
              

    }
}