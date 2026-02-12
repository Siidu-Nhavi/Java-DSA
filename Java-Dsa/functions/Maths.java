public class Maths {
    public static int maximum(int a,int b){
        return Math.max(a, b);
    }
    public static int minimum(int a, int b){
        return Math.min(a,b);
    }
    public static int power(int n){
        return (int)Math.pow(n,2);
    }
    public static int SquareRoot(int n){
        return (int)Math.sqrt(n);
    }
    public static void main(String arrgs[]){
        System.out.println(maximum(10, -1));
        System.out.println(minimum(10, -1));
        System.out.println(power(10));
        System.out.println(SquareRoot(81));

    }
    
}
