public class Rhombic {
    public static void main(String args[]){
        int n =5;
         //spaces
        

        for(int i =1;i<=n;i++){
            for(int k=1;k<2*(n-i);k++){
                System.out.print(" ");
            }
            for(int j =1;j<=n;j++){
                System.out.print("*"+"  ");
            }
            System.out.println();
        }

       
    }
    
}
