import java.util.*;
public class MaxAreaHistogram {
    public static void maxArea(int [] arr){
         Stack<Integer> s = new Stack<>();
         int maxarea = 0;
         int nsr[] = new int[arr.length];
         int nsl[] = new int[arr.length];

      
        //next smaller left
        for(int i =0; i<arr.length;i++){
            //while loop
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //next smaller right
        s = new Stack<>();
        for(int i =arr.length-1; i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //calculate max area
        for(int i=0; i<arr.length; i++){
            int width = nsr[i] - nsl[i] - 1;
            int area = arr[i] * width;
            maxarea = Math.max(maxarea, area);
        }
        System.out.println("Max Area: " + maxarea);
       
    }
    public static void main(String args[]){
        int arr[] = {2,1,5,6,2,3};
        maxArea(arr);
    }
    
}
