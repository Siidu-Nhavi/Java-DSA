public class Assignment {
    // Q.1) what is the value of x^x for any value of x
    public static int X_OR(int n) {

        return n ^ n;
    }

    // Q.2) swap two number without using third variable
    // public static int [] Swap(int a,int b){
    // // this method is not appropriate
    // a = a+b;
    // b = a-b;
    // a = a-b;
    // return new int[]{a,b};
    // }

    public static int[] swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        return new int[] { a, b };
    }

    // Q.3) add 1 to the given integer number
    public static int add(int n) {
        return ~(~n) + 1;
    }

    // Q.4) convert uppercase to lowercase
    public static void Convertuppercaseto_lowercase() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | 32)+" ");
        }
    }

    public static void main(String args[]) {
        System.out.println("the final ans is:" + X_OR(10));
        int a = 10;
        int b = 13;

        int[] swapped = swap(a, b);
        System.out.println("the swapped value of a is:" + swapped[0]);
        System.out.println("the swapped value of b is:" + swapped[1]);
        System.out.println("after adding 1 to the integer:" + add(6));
        Convertuppercaseto_lowercase();

        // System.out.println("the value of space is:"+(int)(' '));


    }

}
