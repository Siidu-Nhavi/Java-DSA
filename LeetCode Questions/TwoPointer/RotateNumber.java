public class RotateNumber {
    public static void reverse(int arr[], int left, int right) {
    while (left < right) { 
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;  
        right--; 
    }
}
    public static void rotate(int arr[],int k){
        int n=arr.length;

        //reverse entire array
        reverse(arr,0,n-1);
        //reverse array from 0,k-1;
        reverse(arr,0,k-1);
        //reverse remaining array
        reverse(arr,k,n-1);
        
    }
    public static void main(String args[]){
        int arr [] = {1,2,3,4,5,6};
        int k=3;
        rotate(arr,k);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
*/

/*Try to come up with as many solutions as you can. 
There are at least three different ways to solve this problem.
Could you do it in-place with O(1) extra space? */