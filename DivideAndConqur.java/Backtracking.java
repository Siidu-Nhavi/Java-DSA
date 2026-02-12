public class Backtracking {
    //pushing an values in the empty array
    public static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void changeArray(int arr[],int i, int val){
        //base case
        if(arr[i] == arr.length){
            printArray(arr);
            return;
        }
        //recursion
        arr[i] = val;
        changeArray(arr, i+1, val+1);//calling CA fun
        arr[i] = arr[i] - 2; //Backtracking step
    }
    public static void main(String args[]){
        int arr[] = new int[5]; // array of size 5 is given
        changeArray(arr,0,1);
        printArray(arr);
    }

    
}
