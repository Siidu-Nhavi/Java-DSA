public class SortingPractice {
    public static void Bub_decreasing(int nums[]) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            System.out.print("The array after " + (i + 1) + " pass: ");
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[j] + " ");
            }
            System.out.println();
        }
    }

    public static void print(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int nums[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

        System.out.print("The original array is: ");
        print(nums);

        Bub_decreasing(nums);

        System.out.print("Final sorted array in decreasing order: ");
        print(nums);
    }
}
