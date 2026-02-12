public class Pattern9 {
    public static void mirror(int n){
        for(int i=5;i>=1;i--){
            //spaces
            for(int j=1;j<n-i+1;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        mirror(4);
    }
    
}
