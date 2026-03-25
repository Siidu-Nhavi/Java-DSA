/*Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.

*/
public class FindMinInRotatedSortedArray {
    private static int findMin(int arr[]) {
        int st = 0, end = arr.length - 1;
        while (st < end) {
            int mid = (st + end) / 2;
            if (arr[mid] == arr[end]) {
                return mid;
            }
            if (arr[mid] > arr[end]) {
                st = mid + 1;
            } else {
                end = mid;
            }
        }
        return arr[st]; // st == mid; then mid is pointing to the start
    }

    public static void main(String atgs[]) {
        int arr[] = { 1,2,4,5,6,7,-9};
        System.out.println("the minimum element in array is :" + findMin(arr)); // 1

    }

}
