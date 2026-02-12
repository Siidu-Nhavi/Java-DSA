public class DiagonalSum {
    public static int sum(int mat[][]){
        int sum = 0;
        for(int i = 0; i < mat.length; i++){
            sum += mat[i][i]; // primary diagonal

            //secondary diagonal
            if(i != mat.length-1-i){
                sum+= mat[i][mat.length-1-i];
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        int mat[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.print("The sum of primary diagonal is: " + sum(mat));        
    }
}
