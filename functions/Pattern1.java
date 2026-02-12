public class Pattern1 {
    public static void invert_half_pyramid(int row){
        // for row 

            for(int i = 1; i<= row; i++){
                //spaces 
                for(int j= 1; j<= row-i; j++){
                    System.out.print(" ");
                }
                // for stars
                for(int j = 1; j<= i; j++){
                    System.out.print("*");
                }
                System.out.println();

            }

    }
    public static void main(String args[]){
        invert_half_pyramid(4);
    }
    
}
