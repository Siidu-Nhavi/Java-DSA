// Stack interface
interface Stack {
    int size = 5; // fixed size stack

    void push(String item);
    String pop();
    void display();
    boolean overflow();
    boolean underflow();
}

// IntegerStack implementation
class IntegerStack implements Stack {
    private int[] arr = new int[size];
    private int top = -1;

    public void push(String item) {
        if (overflow()) {
            System.out.println("IntegerStack Overflow!");
            return;
        }
        arr[++top] = Integer.parseInt(item);
    }

    public String pop() {
        if (underflow()) {
            System.out.println("IntegerStack Underflow!");
            return null;
        }
        return String.valueOf(arr[top--]);
    }

    public void display() {
        if (underflow()) {
            System.out.println("IntegerStack is Empty");
            return;
        }
        System.out.print("IntegerStack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public boolean overflow() {
        return top == size - 1;
    }

    public boolean underflow() {
        return top == -1;
    }
}

// StringStack implementation
class StringStack implements Stack {
    private String[] arr = new String[size];
    private int top = -1;

    public void push(String item) {
        if (overflow()) {
            System.out.println("StringStack Overflow!");
            return;
        }
        arr[++top] = item;
    }

    public String pop() {
        if (underflow()) {
            System.out.println("StringStack Underflow!");
            return null;
        }
        return arr[top--];
    }

    public void display() {
        if (underflow()) {
            System.out.println("StringStack is Empty");
            return;
        }
        System.out.print("StringStack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public boolean overflow() {
        return top == size - 1;
    }

    public boolean underflow() {
        return top == -1;
    }
}

// DoubleStack implementation
class DoubleStack implements Stack {
    private double[] arr = new double[size];
    private int top = -1;

    public void push(String item) {
        if (overflow()) {
            System.out.println("DoubleStack Overflow!");
            return;
        }
        arr[++top] = Double.parseDouble(item);
    }

    public String pop() {
        if (underflow()) {
            System.out.println("DoubleStack Underflow!");
            return null;
        }
        return String.valueOf(arr[top--]);
    }

    public void display() {
        if (underflow()) {
            System.out.println("DoubleStack is Empty");
            return;
        }
        System.out.print("DoubleStack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public boolean overflow() {
        return top == size - 1;
    }

    public boolean underflow() {
        return top == -1;
    }
}

// Test class
public class StackTest {
    public static void main(String[] args) {
        Stack intStack = new IntegerStack();
        intStack.push("10");
        intStack.push("20");
        intStack.push("30");
        intStack.display();
        System.out.println("Popped: " + intStack.pop());
        intStack.display();

        System.out.println("----------------------------");

        Stack strStack = new StringStack();
        strStack.push("Hello");
        strStack.push("World");
        strStack.display();
        System.out.println("Popped: " + strStack.pop());
        strStack.display();

        System.out.println("----------------------------");

        Stack doubleStack = new DoubleStack();
        doubleStack.push("1.1");
        doubleStack.push("2.2");
        doubleStack.push("3.3");
        doubleStack.display();
        System.out.println("Popped: " + doubleStack.pop());
        doubleStack.display();
    }
} 
