import java.util.*;

public class JavaBasics {
    public static void CalculateSum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter two numers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int sum = a + b;
        System.out.println("sum is :" + sum);

    }

    // function with parameters
    public static int CalculateSum(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int sum = CalculateSum(a, b);
        System.out.println("sum is:" + sum);
        CalculateSum();

    }
}