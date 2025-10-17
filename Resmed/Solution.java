public class Solution {
    public static void main(String[] args) {
        int[] prices = {44, 30, 25, 32, 35, 30, 40, 38, 15};
    
    int maxProfit = StockPicker(prices);
    
    System.out.println(maxProfit);
    }

    public static int StockPicker(int[] prices) { 
    int minPrice = prices[0];
    int maxProfit = 0;
    
    for(int price: prices){
        if(price<minPrice){
            minPrice = price;
        }
        int profit = price - minPrice;
        if(profit>maxProfit){
            maxProfit = profit;
        }
    }
    return maxProfit;
}
}
