import java.util.Scanner;
public class Assignment1 {
    public static boolean check(int nums[]) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count >= 2) {
                return true;
            }
        }
        return false;
    }
    
    //assignment question 2
    //by linear search
    public static int Findindex(int nums[],int target){
        int ans = -1;
        int n= nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] == target){
                ans = i;
                break;
            }
        }
        return ans;
    }
    //by binary search
    public static int FindIndex(int num[],int target){
        int n = num.length;
        int st=0;
        int e = n-1;
        while(st <= e){
            int mid = st+(e-st)/2;
            if(num[mid] == target){
                return mid;
            }
            else if(num[mid] <= target){
                st = mid-1;
            }
            else if(num[mid] >= target){
                e = mid+1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       int nums[] = {4,  5, 6, 7, 0, 1, 2};
       //System.out.println("the array is:"+check(nums));
       System.out.print("enter target to search:");
       int target = sc.nextInt();
       sc.close();

       //System.out.println("the target found at index is:"+Findindex(nums, target));
       System.out.println("the target founded by binary search:"+FindIndex(nums, target));

    }

}
