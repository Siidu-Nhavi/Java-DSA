import java.util.ArrayList;
public class MostFrequentNum {
    public static int mostFrequentNum(ArrayList<Integer> nums,int key){
        int [] result = new int[1000];
        for(int i=0;i<nums.size();i++){
            if(nums.get(i) == key){
                result[nums.get(i+1)-1]++;
            }
        }
        int maximum = Integer.MIN_VALUE;
        int ans = 0;
        int n = 1000;
        for(int i=0;i<n;i++){
            if(result[i] > maximum){
                maximum = result[i];
                ans = i+1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(100);
        System.out.print(mostFrequentNum(nums, 1));
    }
    
}
