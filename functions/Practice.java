public class Practice {
    public static void rectangle(int row,int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
        public static void hollow_rect(int row,int col){
            for(int i=1;i<=row;i++){
                for(int j=1;j<=col;j++){
                 if(i==1||i==row||j==1||j==col){
                    System.out.print("*");
                 }else{
                    System.out.print(" ");
                 }
                }
               System.out.println();
            }
        }

        public static void inverted_pyramid_number(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
               for(int j=1;j<=i;j++){
                System.out.print(j);
               }
               System.out.println();
            }
        }

        public static void inverted_pyramid(int n){
            for(int i=1;i<=n;i++){
                //space
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                //star
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void butterfly(int n){
            //1st half
            for(int i=1;i<=n;i++){
                //star
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                //space
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
                }
                //star
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            //2nd half
            for(int i=n;i>=1;i--){
                //star
                for(int j=1;j<=i;j++){
                    System.out.print("*");

                }
                
                //space
                for(int j=1;j<=2*(n-i);j++){
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
        // rectangle(4, 5);
        // hollow_rect(4, 4);
        // inverted_pyramid(4);
        // inverted_pyramid_number(4);
        // butterfly(4);
        triangle(3);
      
        
        
        
      
        
    }
    
}
