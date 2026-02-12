import java.util.*;

public class NextGreater {
    public static void main(String args[]) {
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();

        int[] nextGreat = new int[arr.length];

        for (int i = arr.length - 1; i > 0; i--) {
            // 1.while loop 
            //pop smaller elements
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // 2.if else
            if (s.isEmpty()) { // if not found then set it to -1
                nextGreat[i] = -1;
            } else { // if an element found then store top of the stack
                nextGreat[i] = s.peek();
            }

            // 3. push index into nextgreat
            s.push(i);
        }

        // print the result
        System.out.println("Next Greater Elements (the ans is stored in the form of index ):");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " -> " + nextGreat[i]);

        }

    }
}
