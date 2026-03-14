import java.util.PriorityQueue;
public class Creation {
    public static void main(String[] args) {
        //create object class and use it
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10); // O(logn)
        pq.add(3);
        pq.add(2);
        pq.add(0);
        pq.add(1);

        while(!pq.isEmpty()){
            System.out.println(pq.peek()); // O(1);
            pq.remove(); // O(logn)
        }
    }
}