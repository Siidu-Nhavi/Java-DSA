import java.util.*;

public class MajorityElement {
    public static int majorityElement(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //count frequency
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                 map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
           
        }
        int n= arr.length;
        for(int key:map.keySet()){
            if(map.get(key) > n/2){
                return key;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println("maxCount is ="+majorityElement(arr));
    }
}
