public class NestedTryDemo {
    public static void main(String[] args) {

        System.out.println("Program started");

        try {
            // Outer try block
            try {
                // Inner try block
                int a = 10 / 0; // Causes ArithmeticException
                System.out.println(a);
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Divide by zero error → " + e);
            }

            // Another risky code (outside inner try)
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]); // Causes ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Invalid array index → " + e);
        } finally {
            System.out.println("Finally block: Always executes");
        }

        System.out.println("Program continues normally");
    }
}
