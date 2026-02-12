public class SwapNo {

    public static int palindrome(int arr[]) {

        int n = arr.length;
        int left = 0, right = n - 1;
        int count = 0;

        while (left < right) {

            if (arr[left] == arr[right]) {
                left++;
                right--;
            }
            else if (arr[left] < arr[right]) {
                arr[left + 1] += arr[left];
                left++;
                count++;
            }
            else {
                arr[right - 1] += arr[right];
                right--;
                count++;
            }
        }

        return count;   
    }

    public static void main(String args[]) {
        int arr[] = {1, 5, 4, 1};
        System.out.println("The no of operations needed is : " + palindrome(arr));
    }
}
