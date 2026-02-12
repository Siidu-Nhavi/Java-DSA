import java.util.*;
public class Prime {
    public static  boolean isPrime(int n){

        if(n <= 1)  return false;
        if(n == 2) return true;
        if(n%2 == 0) return false;

        for(int i=3;i<n;i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    public static void main(String args[]){
     System.out.print(isPrime(97));
      
    }
}
