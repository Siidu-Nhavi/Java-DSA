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

    public static void main(String args[]) {
        int arr[][] = { { 1, 0, 0, 0 }, { 1, 1, 1, 1 }, { 1, 0, 0, 0 }, { 1, 0, 0, 0 } };
        int k = 2;

        PriorityQueue<Row> pq = new PriorityQueue<>();

        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr[0].length;j++){
                count +=  arr[i][j]==1?1:0;
            }
            pq.add(new Row(count, i));
        }

        for(int i=0;i<k;i++){
            System.out.println("R"+pq.remove().idx); // poll and remove are same in priority queue oprations
        }

    }

}
