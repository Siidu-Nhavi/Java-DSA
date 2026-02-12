public class RemoveOperation {

    // Create node
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    public void add_first(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
        size++;
    }

    public void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int remove_first() {
        if (size == 0) {
            System.out.println("List is empty");
            return -1; // or throw an exception
        }
        int val = head.data;
        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
        }
        size--;
        return val;
    }
   public int search(int key) {
    Node temp = head;
    int i = 0;
    while (temp != null) {
        if (temp.data == key) {
            return i;
        }
        temp = temp.next;
        i++;
    }
    return -1;
}


    public static void main(String[] args) {
        RemoveOperation rr = new RemoveOperation();
        rr.print();
        rr.add_first(10);
        rr.print();
        rr.add_first(20);
        rr.print();
        rr.add_first(30);
        rr.print();    // 30 -> 20 -> 10 -> null
        System.out.println("Removed: " + rr.remove_first()); // Removed: 30
        rr.print();   // 20 -> 10 -> null
        System.out.print("element found at index :"+rr.search(0));
    }
}
