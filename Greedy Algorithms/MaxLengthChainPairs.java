import java.util.*;
public class MaxLengthChainPairs {
    public static void main(String args[]){
        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        //lambda function which sorts onthe basis of first column
        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));
        int chainLength =1;
        int pairEnd = pairs[0][1]; // last select element  or end start of second pair
        for(int i=0;i<pairs.length;i++){
            if(pairs[i][0] > pairEnd ){
                chainLength++;
                pairEnd= pairs[i][1]; // now pair ka end is equal to 1st pair ka end
            }
        }
        System.out.print("maximum length of pair is:"+chainLength);
    }
    
}
