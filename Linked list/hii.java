public class hii {
    public static int[] swap(int a,int b){
        a=a-b;
        b=a+b;
        a=a-b;
        return new int[] {a,b};
        

    }
    public static void main(String args[]){
        int a=5,b=10;
        int result[]=swap(a,b);
        System.out.print(result);

    }
     
}
