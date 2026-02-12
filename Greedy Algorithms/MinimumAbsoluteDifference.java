import java.util.*;
public class MinimumAbsoluteDifference {
    public static void main(String args[]){
        int A[] ={1,3,7,5};
        int B[] ={2,5,9,7};
        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff=0;
        for(int i=0;i<A.length;i++){
           minDiff += Math.abs(A[i]^2-B[i]^2);
        }
        System.out.println("the minimum absolute difference is:"+ minDiff);
    }
    
}
