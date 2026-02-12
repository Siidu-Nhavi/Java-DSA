public class Subarray {
    // static void Print_subarray(int num[]) {
    // int subarray = 0;
    // int maxsum=Integer.MIN_VALUE;
    // for (int i = 0; i < num.length; i++) {
    // int s = i;
    // int current_sum=0;
    // for (int j = i; j < num.length; j++) {
    // int e = j;
    // for (int k = s; k <= e; k++) {// i & j
    // System.out.print(num[k] + " ");
    // current_sum+=num[k];
    // maxsum=Math.max(maxsum,current_sum);

    // }
    // System.out.println();
    // subarray++;

    // }
    // System.out.println();
    // }
    // System.out.println("no of subarray are:" + subarray);
    // System.out.println("the sum is:"+maxsum);

    // }
    // static void Max_subarray_sum(int num[]){
    // int maxsum=Integer.MIN_VALUE;
    // for(int i=0;i<num.length;i++){
    // int current_sum = 0;
    // for(int j=i;j<num.length;j++){
    // for(int k=i;k<=j;k++){
    // current_sum+=num[k];
    // maxsum =Math.max(maxsum,current_sum);
    // }

    // }
    // System.out.println("current sum:"+current_sum);
    // }
    // System.out.println(maxsum);
    // }

    public static void kadance(int nums[]) {
        int current_sum = 0;
        int maxsum = Integer.MIN_VALUE;// -infinity
        for (int i = 0; i < nums.length; i++) {
            current_sum += nums[i];
            if (current_sum > maxsum) {
                maxsum = current_sum;
            }
            if (current_sum < 0) {//+ve + -ve = -ve --> 0
                current_sum = 0;
            }
            if(maxsum < 0){//if all elements in array are negative then set it to 0
                maxsum = 0;
            }

            maxsum = Math.max(current_sum, maxsum);
        }
        System.out.print("Max sum is:" + maxsum);
    }

    public static void main(String args[]) {
        // int num[] = { 2, 3, 4, 5, 6, 8 };
        // Print_subarray(num);
        // int odd[]={1,-2,6,-1,3};
        // Max_subarray_sum(odd);

        int nums[] = { -2, -3, 4, -1, -2, -1, -5, 3 };
        kadance(nums);

    }

}
