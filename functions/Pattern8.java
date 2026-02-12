public class Pattern8 {
    public static void rhombic(int n){
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            //star
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        rhombic(5);
    }
    
}
