import java.util.*;
public class FractionalKnapsack {
    public static void main(String args[]){
        int val[] ={60,100,120};
        int weight[] ={10,20,30};
        int W = 50;
        //0th column:index , 1st column ratio
        double ratio [][] = new double[val.length][2];

        for(int i=0;i<val.length;i++){
            ratio[i][0] =i;
            ratio[i][1] = val[i]/ (double)weight[i];

        }
        //asending order me sort hoga
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int finalVal =0;

        //now sort it in decending order
        for(int i=ratio.length-1;i>=0;i--){
             int idx = (int) ratio[i][0];
            if(capacity >= weight[idx]){//include full item
                finalVal += val[idx];
               capacity -= weight[idx];
            }else{
                //include fractional
                finalVal += (ratio[i][1] * capacity);
                capacity =0; 
            }
        }
        System.out.print("The Final Value is="+finalVal);
    }
    
}
