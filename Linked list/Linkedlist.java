public class Linkedlist {

    public class Node {
        int data;
        Node next;

        // constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static Node temp;

    public static int size = 0;

    // add operations on ll

    public void add_first(int data) {
        Node newnode = new Node(data); // new node is created

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

    // add at position
    public void add_position(int idex, int data) {
        Node newnode = new Node(data);
        if (idex == 0) {
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < idex - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    // optional print list logic for reverse
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next; // save next node
            curr.next = prev; // reverse the link
            prev = curr; // move prev forward
            curr = next; // move curr forward
        }

        // After loop, prev is the new head
        head = prev;

        System.out.print("The reversed list is: ");
        printList();
    }

    public void delete_nth(int n) {
        // Step 1: Count size of the list
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        // Step 2: Edge case handling
        if (n > size || n <= 0) {
            System.out.println("Invalid value of n");
            return;
        }

        // Step 3: Delete head if n == size
        if (n == size) {
            head = head.next;
            if (head == null)
                tail = null; // if list becomes empty
            return;
        }

        // Step 4: Traverse to node before the one to delete
        int i = 1;
        int indexToFind = size - n;
        Node prev = head;
        while (i < indexToFind) {
            prev = prev.next;
            i++;
        }

        // Step 5: Remove the nth node from end
        prev.next = prev.next.next;

        // Update tail if needed
        if (prev.next == null) {
            tail = prev;
        }
        System.out.println("the new updated list is :");
    }

    // check if linked list is pallindrome or not

    // #1 helper function
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;// this is updated mid node
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step1 --> find mid
        Node midnode = findMid(head);
        // step2 ---> reverse 2nd half
        Node prev = null;
        Node curr = midnode;
        Node next;

        // almost reverse wala hi logic use hua hai
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;// right hslf head
        Node left = head;

        // step 3--> check left and right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    // checking the cycle or loop is present in ll
    public boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }

        }
        return false;
    }

    public static void main(String args[]) {
        Linkedlist l = new Linkedlist();
        l.print();
        l.add_first(2);
        l.print();
        l.add_first(1);
        l.print();
        l.add_last(3);
        l.print();
        l.add_last(4);
        l.print();
        l.add_position(2,0);
        l.print();
        l.reverse();
        l.delete_nth(4);
        l.print();

        l.add_first(1);
        l.add_first(2);
        l.add_first(2);
        l.add_first(1);
        System.out.println("after checking list final answer is:" + l.checkPalindrome());
        System.out.println("the cycle or loop is present in linked list:" + l.isCycle());

    }

}
