public class B {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        //constructor of queue
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        //Add function
        //input in array is taken with help of rear
        public static void add(int data){
            if(rear == size-1){
                System.out.print("Queue is full");
                return ;
            }
           rear = rear+1;
           arr[rear] = data;
        }
        // remove operation
        public static int remove(){
            if(isEmpty()){
                System.out.print("Queue is empty");
            }
            int front = arr[0];//front is at index 0
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear=rear-1;//rear ko piche lana
            return front; // yaha se delete karna
        }
        //peek operation
        public static int peek(){
            if(isEmpty()){
                System.out.print("Queue is empty");
                return-1;
            }
            return arr[0]; // top of the queue is at index 0

        }

    }
    public static void main(String args[]){
    Queue q = new Queue(5);
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    
   
    //for printing the queue
    while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
    }
   

    }
    
}
