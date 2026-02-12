public class Transpose {
    public static void main(String args[]){
        int mat[][] = {{1,2,3},{4,5,6}};
        System.out.print("original 2d matrix:");
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat+" ");
            }
            System.err.println();
        }
    }
    
}
