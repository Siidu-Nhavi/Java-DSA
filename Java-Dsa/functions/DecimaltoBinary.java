import java.util.*;

public class DecimaltoBinary {
    public static void convert(int n) {
        int bin = 0;//initially 0
        int pow = 0;//pow starts from 0 to n2
        int remainder;
        while (n > 0) {
            remainder = n % 2;
            bin = bin + (remainder * (int) Maths.pow(10, pow));
            n = n / 2;
            pow++;
        }
        System.out.println("the binary conversion of decimal number is:" + bin);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a decimal number:");
        int n = sc.nextInt();
        sc.close();
        convert(n);

    }

}
