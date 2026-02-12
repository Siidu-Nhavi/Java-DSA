import java.util.*;

// Interface
interface StackInterface {
    void push(String data);
    String pop();
    void display();
    boolean underFlow();
    boolean overFlow();
}

// Integer Stack
class InStack implements StackInterface {
    Stack<Integer> s = new Stack<>();

    public void push(String item) {
        s.push(Integer.parseInt(item));
    }

    public String pop() {
        if (underFlow()) {
            return "Underflow!";
        }
        return String.valueOf(s.pop());
    }

    public void display() {
        System.out.println("IntegerStack: " + s);
    }

    public boolean underFlow() {
        return s.isEmpty();   // true if empty
    }

    public boolean overFlow() {
        return false;         // dynamic stack, no overflow
    }
}

// String Stack
class StrStack implements StackInterface {
    Stack<String> s = new Stack<>();

    public void push(String data) {
        s.push(data);
    }

    public String pop() {
        if (underFlow()) {
            return "Underflow!";
        }
        return s.pop();
    }

    public void display() {
        System.out.println("StringStack: " + s);
    }

    public boolean underFlow() {
        return s.isEmpty();
    }

    public boolean overFlow() {
        return false;
    }
}

// Double Stack
class DoubleStack implements StackInterface {
    Stack<Double> s = new Stack<>();

    public void push(String item) {
        s.push(Double.parseDouble(item));
    }

    public String pop() {
        if (underFlow()) {
            return "Underflow!";
        }
        return String.valueOf(s.pop());
    }

    public void display() {
        System.out.println("DoubleStack: " + s);
    }

    public boolean underFlow() {
        return s.isEmpty();
    }

    public boolean overFlow() {
        return false;
    }
}

// Test class
public class TestStack {
    public static void main(String[] args) {
        // Integer stack
        InStack i = new InStack();
        i.push("3");
        i.push("4");
        i.push("5");
        i.display();
        System.out.println("Popped: " + i.pop());
        i.display();

        // String stack
        StrStack s = new StrStack();
        s.push("Hello");
        s.push("World");
        s.display();
        System.out.println("Popped: " + s.pop());
        s.display();

        // Double stack
        DoubleStack d = new DoubleStack();
        d.push("3.14");
        d.push("2.71");
        d.display();
        System.out.println("Popped: " + d.pop());
        d.display();
    }
}