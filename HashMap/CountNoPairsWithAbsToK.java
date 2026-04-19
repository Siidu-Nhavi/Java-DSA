public class CountNoPairsWithAbsToK {
    public static int countPairsWithDiffK(int arr[], int k){
        int x = 0;
        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < i; j++){

                if(Math.abs( arr[i] - arr[j] ) == k){
                    x++;
                }
            }
        }
        return x;
    }
    public static void main(String args[]){
        int arr[] = {1,2,2,3,2,1,-1};
        System.out.println("The number of pairs with absolute difference K are ="+countPairsWithDiffK(arr, 1));

    }
}
