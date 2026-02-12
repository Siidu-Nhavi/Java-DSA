public class ZigZagLL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void add_last(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }

        tail.next = newnode;
        tail = newnode;
    }

    // print
    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public void zigZag() {
        // find mid
        Node slow = head;
        Node fast = head;
        while (fast!= null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        // reverse 2nd half

        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Alternate merge
        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            left = nextL;
            right = nextR;
        }

    }

    public static void main(String args[]) {
        ZigZagLL ll = new ZigZagLL();
        ll.add_last(1);
        ll.add_last(2);
        ll.add_last(12);
        ll.add_last(5);
        ll.add_last(8);
        ll.print();
         
        System.out.print("the zig-zag of input is:");
        ll.zigZag();
        ll.print();
    }

}
