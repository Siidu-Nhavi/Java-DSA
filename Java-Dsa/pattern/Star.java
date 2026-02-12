import java.util.Scanner;
public class Star{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of lines:");
        int n=sc.nextInt();
        sc.close();
        //logic
        for(int i = 0;i < n ; i++){
            for(int j = 0;j < (i+1); j++){
                System.out.print("*"+" ");
            }
           System.out.println();
        }
        

    }
}