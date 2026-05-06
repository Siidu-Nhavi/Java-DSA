import java.util.*;
public class SubArraySumEqualsToK {
    public static void main(String args[]){
        int arr[] ={10,2,-2,-20,10};
        int k = -10;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1); // each time put to handle similar cases

        int sum = 0, ans = 0;

        for(int j = 0; j < arr.length; j++){
            sum += arr[j]; // sum(j)

            if(map.containsKey(sum-k)){
               ans +=  map.get(sum - k);
            }
            map.put(sum,map.getOrDefault(map,0)+1);
        }
        System.err.println("\n\nno of pairs that equal to subarray sum equal to k="+ans +"\n\n");
    }
    
}
