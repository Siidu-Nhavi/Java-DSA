public class Test {
    public static void main(String args[]) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        c3.display(); 
    }
}

class Counter {
    public static int count = 0;

    public Counter() {
        count++;
        System.out.print("Once object is created\n");
    }

    void display() {
        System.out.println("The total number of objects created are: " + count);
    }
}