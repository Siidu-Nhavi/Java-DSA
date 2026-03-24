import java.util.*;

public class KthLargestStream {
    PriorityQueue<Integer> minHeap;
    int k;

    public KthLargestStream(int k, int[] nums) {
        minHeap = new PriorityQueue<>();
        this.k = k;

        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        minHeap.add(val); // add new value

        if (minHeap.size() > k) {   // k=3 if size > 3, remove smallest i.e. the top of the min-heap
            minHeap.remove(); // remove smallest
        }
        return minHeap.peek(); // kth largest
    }

    public static void main(String[] args) {
        int stream[] = { 4, 5, 8, 2 };
        int k = 3;
        KthLargestStream kl = new KthLargestStream(k, stream); // creating object of KthLargestStream class

        System.out.println(kl.add(3)); // returns 4
        System.out.println(kl.add(5)); // returns 5
        System.out.println(kl.add(10)); // returns 5
        System.out.println(kl.add(9)); // returns 8
        System.out.println(kl.add(4)); // returns 8
    }
}