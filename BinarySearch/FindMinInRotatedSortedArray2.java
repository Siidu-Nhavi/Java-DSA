
/*
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,4,4,5,6,7] might become:

[4,5,6,7,0,1,4] if it was rotated 4 times.
[0,1,4,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums that may contain duplicates, return the minimum element of this array.

You must decrease the overall operation steps as much as possible.
*/
public class FindMinInRotatedSortedArray2 {
    private static int findMin(int arr[]) {
        int st = 0, end = arr.length - 1;

        while (st < end) {
            int mid = (st + end) / 2;
            if (arr[mid] > arr[end]) { // search in right part
                st = mid + 1;
            } else if (arr[mid] < arr[end]) { // search in left part
                end = mid;
            } else {
                end--; // nums[mid] == nums[end] ; cant able to decide which is min so decrease the
                       // search space
                       // handles buplicates
            }
        }
        return arr[st]; // arr[st] == arr[end]
    }

    public static void main(String args[]) {
        int nums [] = {0,0,0,0,-1,-1,-1,-1,-1,-2,-2,-2,-3,-3,-3,-3,-3};
        System.out.println("the minimum element is="+findMin(nums));
    }

}

// note: an array may contain duplicate elements
