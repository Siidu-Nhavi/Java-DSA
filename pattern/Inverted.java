public class Inverted {
    public static void main(String args[]) {
        int n = 5,m=6;
        //inverted triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {// the place of m we can put  (n-i+1) because of each time the value of * are decreasing.
                if(i<=j)
                System.out.print("*" + " ");
            }
            System.out.println();
        }
System.out.println("    ");
//triangle pattern

        for(int i =1;i<=n;i++){
            for(int j =1;j<=m;j++){
                if(j<=i)
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
