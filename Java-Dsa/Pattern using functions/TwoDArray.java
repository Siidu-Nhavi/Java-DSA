import java.util.Scanner;
public class TwoDArray {
    public static boolean search(int mat[][], int key){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == key){
                    System.out.print("element foud at index/location:"+mat[i][j]);
                    return true;
                }
            }
        }
        System.out.println("element not found");
        return false;
    }

    //counting the occurances of no in an 2d array
    public static int Count_Occurance(int mat[][]){
        int n = mat.length;
        int m = mat[0].length;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 7){
                    count++;
                }
            }
        }
        System.out.print("the no of occurances of 7 are:"+count);
       return count;
    }

//calculating the sum row 
    public static int rowSum(int mat[][]){
        int n = mat.length;
        int m = mat[0].length;//calculating the length of the row
        int rowsum = 0;
        for(int i=0;i<n;i++){
            rowsum+= mat[0][i];
        }
        System.out.print("the row sum is:"+rowsum);
        return rowsum;
    }




    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int mat[][] = {{1,4,9},{11,4,3},{2,2,3}} ;

        rowSum(mat);


        //Count_Occurance(mat);
        // int n = mat.length;//row length
        // int m = mat[0].length;

        // //creting an 2d array
        // System.out.print("enter array Elements:");
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
                
        //         mat[i][j] = sc.nextInt();
        //     }
        // }
        // //printing an 2d array
        // System.out.print("your array is:");
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //        System.out.print( mat[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // search(mat,1);

    }
    
}
