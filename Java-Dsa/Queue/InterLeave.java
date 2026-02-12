//interleaving of 2 halves of single queue

import java.util.*;
public class InterLeave {
    public static void interLeave(Queue<Integer> q){
        Queue<Integer>firstHalf = new LinkedList<>();
        int n = q.size(); // calculate size 
        for(int i=0;i<n/2;i++){
            firstHalf.add(q.remove()); // main queue se half karke use store karna hai in new queue
        }
        while(!firstHalf.isEmpty()){
            q.add(firstHalf.remove());
            q.add(q.remove()); // us queue ko pop karke usi queue me add karna hai
        }

    }
    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interLeave(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
        System.out.println();
    }

}
