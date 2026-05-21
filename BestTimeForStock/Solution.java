package BestTimeForStock;

public class Solution {
    public static void main(String[] args) {
        int[] prices = { 10, 1, 5, 6, 7, 1 };
        int profit = maxProfit(prices);
        System.out.println(profit);
    }

    private static int maxProfit(int[] prices) {

        int maxP = 0;
        int minBuy = prices[0];

        for (int sell : prices) {
            maxP = Math.max(maxP, sell - minBuy);
            minBuy = Math.min(minBuy, sell);
        }
        return maxP;
    }
}
