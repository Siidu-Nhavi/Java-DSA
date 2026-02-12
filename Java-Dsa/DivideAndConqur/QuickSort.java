public class QuickSort {
    public void print(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void quickSort(int arr[],int si,int ei){
        if(si >= ei){
            return;
        }
        int pIdex =partition(arr,si,ei);
        quickSort(arr, si, pIdex-1);//left
        quickSort(arr, pIdex+1, ei);//right
    }
    public int partition(int arr[], int si, int ei) {
    int pivot = arr[ei];
    int i = si - 1;

    for (int j = si; j < ei; j++) { // ✅ FIXED: j < ei instead of j <= ei
        if (arr[j] <= pivot) {
            i++;
            // Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    // Place pivot at its correct position
    i++;
    int temp = arr[i];
    arr[i] = arr[ei];
    arr[ei] = temp;

    return i; // Return pivot index
}

    public static void main(String args[]){
        int arr[] ={0,12,9,3,4,2,8,1,4};
        QuickSort q1 = new QuickSort();
        q1.print(arr);
        q1.quickSort(arr, 0, arr.length-1);
        q1.print(arr);


    }
    
}
