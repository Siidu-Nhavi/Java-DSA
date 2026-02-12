import java.util.*;
public class Prime1 {
    public static boolean isPrime(int n){
        for(int i=2;i<=n;i++){
            if(n%i == 0){
                return true;
            }
        }
        return false;
    }

    public static void printPrime(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(isPrime(num)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int n = sc.nextInt();
        sc.close();
        printPrime(n);

     
    }
  
    
}
