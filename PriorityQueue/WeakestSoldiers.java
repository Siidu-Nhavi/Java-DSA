import java.util.*;

public class WeakestSoliders {

    static class Row implements Comparable<Row> {
        int soldiersCount, idx;

        Row(int soldiersCount, int idx) {
            this.soldiersCount = soldiersCount;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row r2) {
            if (this.soldiersCount == r2.soldiersCount) {
                return this.idx - r2.idx;
            } else {
                return this.soldiersCount - r2.soldiersCount;
            }
        }
    }

    private static int binarySearch(int arr[]) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == 1) {
                left = mid + 1; // move right to find more 1's
            } else {
                right = mid - 1; // move left to find the more 1's
            }
        }
        return left; // left will be the count of 1's in the row
    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 0, 0, 0 }, { 1, 1, 1, 1 }, { 1, 0, 0, 0 }, { 1, 0, 0, 0 } };
        int k = 2;

        PriorityQueue<Row> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            int count = binarySearch(arr[i]);
            pq.add(new Row(count, i));
        }

        for (int i = 0; i < k; i++) {
            System.out.println("R" + pq.remove().idx); // poll and remove are same in priority queue oprations
        }

    }

}
