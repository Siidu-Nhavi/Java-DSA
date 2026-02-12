import java .util.*;
public class PairSum1 {
    public static boolean pairsum(ArrayList<Integer> list,int target){
        for(int i=0;i<list.size();i++){
            for(int j = i+1;j<list.size();j++){
                if(list.get(i)+list.get(j) ==target){
                    return true;
                }
            }
        }
        return false;
    }
    // optimized code
    // with o(n) tc

    //using two pointer approach
    public static boolean pairSum(ArrayList<Integer> list,int tar){
        int lp =0;
        int rp = list.size()-1;
        while(lp < rp){
            if(list.get(lp) + list.get(rp) == tar){
                return true;
            }else if(list.get(lp) + list.get(rp) < tar){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target =5;
        System.out.print(pairSum(list, target));

    }
    
}
