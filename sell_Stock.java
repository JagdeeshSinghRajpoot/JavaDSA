import java.util.*;

public class sell_Stock {

    public static int buyAndSellStocks(int prices[]){
        int buyPri = Integer.MAX_VALUE;
        int maxProfit = 0;
    for(int i= 0;i<prices.length;i++){
        if(buyPri<prices[i]){
            int profit = prices[i] - buyPri;
            maxProfit = Math.max(maxProfit, profit);
        }else{
            buyPri = prices[i];
        }
    }
       return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyAndSellStocks(prices));
        
    }

}
