import java.util.*;
public class UnionIntersection {
    public static  int union(int arr1[], int arr2[]){
        HashSet<Integer>s = new HashSet<>();
        
        for(int i=0;i<arr1.length;i++){ // add elemetns into set
            s.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            s.add(arr2[i]);
        }
        
        System.out.println("the union  elements are");
        for(int num:s){
            System.out.println(num);
        }

        return s.size(); // return size that indicates the union elements count
    }
    public static int intersection(int arr1[],int arr2[]){
        HashSet<Integer> s = new HashSet<>();
        int count =0;
        //step 1:add into set
        for(int i=0;i<arr1.length;i++){
            s.add(arr1[i]);
        }
        //check if set contains arr2 elements if yes count ko increase karo aur remove us element ko set se
        for(int i=0;i<arr2.length;i++){
            if(s.contains(arr2[i])){
                count++;
                s.remove(arr2[i]);
            }
        }
        return count;
    }
    public static void main(String args[]){
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
       System.out.println("The count of union's are="+ union(arr1, arr2));
        System.out.println("The intersection of 2 arrays="+intersection(arr1, arr2));
    }
    
}
