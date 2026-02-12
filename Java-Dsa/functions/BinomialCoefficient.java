public class BinomialCoefficient {
    // helper function
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        return fact;

    }

    public static int bincoef(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmsr_fact = factorial(n - r);
        int bc = n_fact / (r_fact * nmsr_fact);
        return bc;
    }

    public static void main(String args[]) {
        int n = 5, r = 4;
        System.out.println("the binomial coefficient is:" + bincoef(n, r));
    }

}
