import java.util.PriorityQueue;;
public class ConnectNRopes {
    public static void main(String args[]){
        int arr[] = {2,3,3,4,6};
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // add elements to the queue
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }

        int cost = 0;
        while(pq.size() > 1){
            //calculate two minimum from queue and add them . then push it back to the queue 
            int min = pq.remove();
            int min1 = pq.remove();
            cost+=  min+min1;
            pq.add(min+min1);
        }
        System.out.print("the cost to connect n-ropes is ="+cost);
    }
    
}
