import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
    public static List<Integer> majorityElement(int[] nums) {
        int candidate1 = 0, candidate2 = 1;
        int count1 = 0, count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) { // Slot 1 is free, take it
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) { // Slot 2 is free, take it
                candidate2 = num;
                count2 = 1;
            } else { // Both slots occupied, decrement both
                count1--;
                count2--;
            }
        }

        // step2: Verify both candidates actually exceed n/3
        List<Integer> result = new ArrayList<>();
        int freq1 = 0, freq2 = 0;

        for (int num : nums) {
            if (num == candidate1)
                freq1++;
            else if (num == candidate2)
                freq2++; //  Must be else-if to avoid double-counting
        }

        if (freq1 > nums.length / 3)
            result.add(candidate1);
        if (freq2 > nums.length / 3)
            result.add(candidate2);

        return result; //  Always returns List<Integer>

    }

    

    public static void main(String args[]) {

    }

}
