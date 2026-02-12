public class Pairs {
    public static void print_pairs(int arr[]){
        //outer loop from 0 to n
        for(int i=0;i<arr.length;i++){
            int curr_number=0;
            for(int j=i+1;j<arr.length;j++){
                System.out.print("(" + curr_number + "," + arr[j] + ")");


            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[]={2,3,4,5,6};
        print_pairs(arr);
    }
    
}
