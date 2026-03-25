public class BinSearch {

    private static int binarySearch(int arr[], int target) {
        int st = 0;
        int end = arr.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1; // move left
            } else {
                st = mid + 1; // move right
            }
        }
        return -1; // not found
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 5, 6, 8 };
        int target = 8;

        System.out.println("the target is at index:" + binarySearch(arr, target));

    }
}
