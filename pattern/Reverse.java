public class Reverse {
    public static void main(String args[]){
        int n = 5;
        for(int i =1;i<=n;i++){
            //space ko shift karne ke liye
            for(int j =1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int k =1;k<=i;k++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        
        }
     
      
    }
}
    

//           *
//        *  *
//     *  *  * 
// *   *  *  * 

