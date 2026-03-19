import java.util.*;
public class HeapOperation {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void Add(int data) {
            //add the node at last position in an arraylist
            arr.add(data);

            //find child and parent
            int x = arr.size() - 1;
            int parent = (x-1)/2;

            // now swap the child and parent untill child < parent
            
            while(arr.get(x) < arr.get(parent)){
                int temp = arr.get(x);
                arr.set(x,arr.get(parent));
                arr.set(parent,temp);
                
                //update the pointer
                x = parent;
                parent = (x-1)/2;
            }
        }

        public int peek(){
            return arr.get(0); // this is the root of tree as well as 0th index element in the ArrayList
        }
        public void heapify(int i){

            int left = 2*i+1;
            int right = 2*i+2;
            int minIndex = i;

            if(left < arr.size() && arr.get(minIndex)> arr.get(left)){
                minIndex = left;
            }
            if(right < arr.size() && arr.get(minIndex) > arr.get(right)){
                minIndex = right;
            }

            // if minIndex is not equal to i then swap the element at minIndex and i and then heapify the subtree
            if(minIndex != i){
                int temp = arr.get(i);
                arr.set(i, arr.get(minIndex));
                arr.set(minIndex, temp);

                heapify(minIndex);// recursive call to heapify the subtree
            }

            
        }



        // remove the root node and put the last node in the root and then heapify
        public int remove(){    
            int data = arr.get(0);
            // step 1: swap the root node with the last node
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            // step 2: remove the last node
            arr.remove(arr.size()-1);

            // step 3: heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }

    public static void main(String args[]) {
       Heap pq = new Heap();
        pq.Add(2);
        pq.Add(3);
        pq.Add(4);
        pq.Add(5);
        pq.Add(10);

        int data = 1;
        pq.Add(data);
        while(!pq.isEmpty()){
            System.out.print(pq.peek()+" ");
            pq.remove();
        }
    }
}