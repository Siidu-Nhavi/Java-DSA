import java.util.*;
public class StockSpan {
    public static void stockspan(int stock[],int span[]){
        Stack<Integer> s = new Stack<>();

        span[0] = 1; // the price stocks of day one is = 1
        s.push(0);

        // loop for checking all the days of stocks
        for(int i=1;i<stock.length;i++){
            int currPrice = stock[i];
            
            while(!s.isEmpty() && currPrice > stock[s.peek()]){
            s.pop();
        }
        if(s.isEmpty()){
            span[i] = i+1;
        }else{
            int prevHigh = s.peek();
            span[i] = i-prevHigh;
        }
        s.push(i);
    }
}
    public static void main(String args[]){
        int stock[] = {100,80,60,70,60,85,100};
        int span[] = new int[stock.length];
        stockspan(stock,span);

        for(int i =0; i< stock.length; i++){
            System.out.println(span[i]+" ");
        }
    }
    
}
