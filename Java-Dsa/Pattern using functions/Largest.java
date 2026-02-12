import java.util.*;
public class Largest {
    public static int get_largest(int num[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(largest < num[i]){
                largest = num[i];
            }
            if(smallest > num[i]){
                smallest = num[i];
            }
           
        }
        System.out.println("the smallest value is:"+smallest);
        return largest;
    }
    public static void main(String args[]){
        int num[] ={1,2,3,4,10};
        int result = get_largest(num);
        System.out.print("largest value is:"+result);
    }
    
}
