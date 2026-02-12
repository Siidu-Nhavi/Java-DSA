public class DoublyLL {
    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

        public static Node head;
        public static Node tail;
        public static int size;

        public void add_first(int data){
            Node newnode = new Node(data);
            if(head == null){
                head = tail = newnode;
                return ;
            }
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
        //printing ll

        public void print(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+"<--->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public void add_last(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail.prev = newNode;
            tail = newNode;
        }
    
    public static void main(String args[]){
        DoublyLL l1 = new DoublyLL();
        l1.add_first(1);
        l1.add_first(3);
        l1.add_last(3);

        l1.print();
        System.out.print("the size of list is:"+size);
        

    }
    
}
