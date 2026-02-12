

public class Statistics {
    public double mean(double[] nums) {
        double sum = 0;
        for (double n : nums) sum += n;
        return sum / nums.length;
    }

    public double median(double[] nums) {
        java.util.Arrays.sort(nums);
        int n = nums.length;
        if (n % 2 == 0)
            return (nums[n/2 - 1] + nums[n/2]) / 2.0;
        else
            return nums[n/2];
    }

    public double stdDev(double[] nums) {
        double m = mean(nums);
        double sum = 0;
        for (double n : nums) sum += Math.pow(n - m, 2);
        return Math.sqrt(sum / nums.length);
    }

    public double average(double[] nums) {
        return mean(nums);
    }
}
