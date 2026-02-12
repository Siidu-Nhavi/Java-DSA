public class Pattern10 {
    public static void pallindrome_pyramid(int n){
        int num=1;
        //i to n
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //number
            for(int j=1;j<=i;j++){
                System.out.print("*");
                num++;
            }
            //number decrease ho rahe hai to hame loop ko chalana hai n-i se 1 tak
            for(int j=i-1;j>=1;j--){
                System.out.print("*");
            } 
            System.out.println();
        }
    }
    public static void main(String args[]){
        pallindrome_pyramid(5);
    }
    
}
