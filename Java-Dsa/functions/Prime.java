public class Prime {
    // most optimized method to find prime number
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Maths.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // calculating in range
    public static void isPrim(int n) {
            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }

            } 
        }
    
    public static void main(String args[]) {
        System.out.print(isPrime(5));
        isPrim(10);

    }

}
