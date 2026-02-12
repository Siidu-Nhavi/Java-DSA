public class Staircase {
    public static boolean search_in2dmat(int mat[][],int key){
        int row = mat[0].length-1,col = 0;
        while (row <=0 && col <= mat[0].length) {
            if(mat[row][col] ==key){
                System.out.print("element found at index:("+row+","+col+")");
                return true;
            }else if(key < mat[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.print("element not found");
        return false;
    }
    public static void main(String args[]){
        int mat[][] = {{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key = 30;
        search_in2dmat(mat, key);

                        

    }

    
}
