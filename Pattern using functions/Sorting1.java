public class Sorting1 {
    //bubble sort logic.
    public static void bubble_sort(int nums[]) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // swaping
                if (nums[j] > nums[j + 1]) {//increasing order me sort karna hai
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }

            }

        }
    }

  //selection sort logic
    public static void selection_sort(int nums[]){
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            int min_value = i;//current position ko minimum value consider karna

            for(int j = i+1; j<n;j++){
                if(nums[min_value] > nums[j]){
                    min_value = j;
                }
            }
            //swaping

            int temp = nums[min_value];
            nums[min_value] =nums[i];
            nums[i] = temp;
        }
    }
    // printing an sorted array
    public static void print(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
  

    public static void main(String args[]) {
        int nums[] = { 1, 4, 2, 5, 6 };
        // bubble_sort(nums);
        selection_sort(nums);
        print(nums);
    }

}
