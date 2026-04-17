
public class Majority {
    public static int majorityElement(int arr[]) {
        int candidate = 0;
        int count = 0;

        // Phase 1: Find the candidate using Boyer-Moore Voting
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {           //  Only update candidate when count hits 0
                candidate = arr[i];
            }
            if (arr[i] == candidate) {  //  Now this comparison is meaningful
                count++;
            } else {
                count--;
            }
        }

        //  Verify the candidate is actually a majority element
        int freq = 0;
        for (int num : arr) {
            if (num == candidate) freq++;
        }

        if (freq > arr.length / 2) {
            return candidate;
        } else {
            throw new RuntimeException("No majority element found");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 1, 2, 1, 3, 1, 1 };
        System.out.println("The majority element is = " + majorityElement(arr));
    }
}