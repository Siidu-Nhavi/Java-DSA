import java.util.*;

public class CountDistinct {

    // Method 1: Brute force approach
    public static int countDistinctBrute(int arr[]) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) { // check if arr[i] is present before it
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                res++;
            }
        }
        return res;
    }

    // Method 2: Using HashSet
    public static int countDistinctHashSet(int arr[]) {
        HashSet<Integer> s = new HashSet<>();
        for (int num : arr) {
            s.add(num);
        }
        return s.size();
    }

    public static void main(String args[]) {
        int arr[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };
        System.out.println("Distinct count (Brute) = " + countDistinctBrute(arr));
        System.out.println("Distinct count (HashSet) = " + countDistinctHashSet(arr));
    }
}
