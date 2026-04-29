import java.util.*;
public class CountDistinct {
    public static int countDistinct(int arr[]){
        int res = 0;
        for(int i=0;i<arr.length;i++){
            boolean isDuplicate = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                res++;
            }
        }
        return res;
    }
    // by hashset
    public static int countDistict(int arr[]){
        HashSet<Integer> s = new HashSet<>();
        for(int num: arr){
            s.add(num);
        }
        return s.size();
    }
    public static void main(String args[]){
        int arr[] = {4,3,2,5,6,7,3,4,2,1};
        // System.out.println("The no of distict elements are="+countDistinct(arr));
        System.out.println("The no of distict elements are="+countDistict(arr));
    }
}
