public class SellandBuyStock {
    public static int buyand_sell(int price[]){
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;
        int n=price.length;
        //i to n
        for(int i=0;i<n;i++){

            if(buy_price < price[i]){
                
                int profit = price[i] - buy_price; //todays profit is calculated
                max_profit = Math.max(max_profit , profit);
            }
            else{
                buy_price = price[i];
            }
        }
        return max_profit;
    }
    public static void main(String args[]){
        int price[]={7, 1, 5, 3, 6,  4};
        System.out.println("the profit we made is:"+buyand_sell(price));
    }
    
}
