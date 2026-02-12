public class Pattern {
    public static void hollow_rectangle(int row , int col){

        //for row
        for(int i = 1; i<= row; i++){
            //for column
            for(int j = 1; j<= col; j++ ){
                //boundary conditions 
                if(i == 1 || i == row || j == 1 || j == col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollow_rectangle(4, 5);
    }
    
}
