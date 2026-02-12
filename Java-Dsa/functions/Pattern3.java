public class Pattern3 {
    public static void inverted_half_pyramid_with_numbers(int row){
        //for rows
        for(int i = 1; i<= row; i++){
            //for printing numbers
            for(int j = 1; j<= (row-i+1); j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
       
        inverted_half_pyramid_with_numbers(5);
      
    }
    
}
