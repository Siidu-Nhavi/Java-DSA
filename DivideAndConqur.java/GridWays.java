public class GridWays {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

      return n*factorial(n-1);
    }

    public static int gridWays(int i, int j, int n, int m) {
        return factorial(n + m - 2) / (factorial(n - 1) * factorial(m - 1));
    }

    public static void main(String args[]) {
        int n = 3;
        int m = 3;

        System.out.print("Total number of ways to calculate Gridways are:" + gridWays(0, 0, n, m));

    }
}

// the solution obtained from this is not optimized

// public static int gridWays(int i,int j,int n,int m){
// // base case
// if(i == n-1 & j == m-1){
// return 1;
// }else if(i == n || j == m){ // out of boundary conditions
// return 0;
// }

// int w1 = gridWays(i, j+1, n, m);
// int w2 = gridWays(i+1, j, n, m);
// return w1+w2;
// }