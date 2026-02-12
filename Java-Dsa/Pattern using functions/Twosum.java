import java.util.*;
public class Twosum {
    public static int[] calculate(int nums[],int target){
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
    public static void main(String args[]){
        int nums[]={1,2,3,4,9};
        int target = 10;
        System.out.println(calculate(nums, target));
    }
    
}
