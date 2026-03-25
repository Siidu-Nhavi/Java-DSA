public class MergeSort {

    public void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Recursive merge sort
    public void mergeSort(int arr[], int si, int ei) {
        // Base case
        if (si >= ei) return;

        int mid = si + (ei - si) / 2;

        // Recursive calls
        mergeSort(arr, si, mid);       // left part
        mergeSort(arr, mid + 1, ei);   // right part
        merge(arr, si, mid, ei);       // merge the two halves
    }

    // Merging logic
    public void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;      // left part iterator
        int j = mid + 1; // right part iterator
        int k = 0;       // temp array iterator

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy back to original array
        for (k=0, i = si; i < temp.length;k++,i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]) {
        int arr[] = {9, 0, 2, 8, 1, 3, 9};
        MergeSort m1 = new MergeSort();
        m1.mergeSort(arr, 0, arr.length - 1);
        m1.print(arr);
    }
}
