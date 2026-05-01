import java.util.*;
public class ContainsDuplicate {
    public static boolean containsDuplicate(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    //optimization using hashset
    
    public static boolean isContainsDuplicate(int arr[]){
        HashSet<Integer> s = new HashSet<>();
        for(int num : arr){
            if(s.contains(num)){
                return true;
            }else{
                s.add(num);
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,1};
         System.out.print(isContainsDuplicate(arr));
    }
}
