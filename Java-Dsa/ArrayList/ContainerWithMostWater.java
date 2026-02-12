import java.util.*;
public class ContainerWithMostWater {
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0; //if height == 0 then it cant able to store water
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht = Math.min(height.get(i),height.get(j)); 
                int width = j-i; // wd = index difference
                int currWater = ht*width; // this is area of container
                maxWater = Math.max(maxWater,currWater);
            }
        }
        return maxWater;
    }

    //by 2 pointer approach
    public static int storWater(ArrayList<Integer> height){
        int lp = 0;
        int rp = height.size()-1;
        int maxWater = 0;
        while(lp < rp){
            int ht = Math.min(height.get(lp),height.get(rp));//height
            int wd = rp - lp;//width
            int cuurWater = ht*wd;//area
            maxWater = Math.max(maxWater,cuurWater);
            if(height.get(lp) < height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(0);
        System.out.print("the container with most water is:"+storWater(height));
    }
    
}
