import java.util.HashMap;

public class TwoSumExample {
    public static int[] twosum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            
            if (map.containsKey(target-nums[i])) {
                return new int[] { map.get(target-nums[i]), i };
            }
            map.put(nums[i], i);
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] nums = {1,7,-1,5,3,3};
        int target = 6;

        int[] result = twosum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
