public class TilingProblem {

    public static int tiling(int n){
        if(n==0||n==1){
            return 1;
        }
        // both horizontal and vertical tiles are added 
        //this will return final total ways to fill tile
        return tiling(n-1) + tiling(n-2);
    }
    public static void main(String args[]){
        System.out.println(10);

    }
    
}
