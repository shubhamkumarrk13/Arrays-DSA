// Problem Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;

        int cost = prices[0];

        for(int i=0 ; i<prices.length ; i++) {

            int currentProfit = prices[i] - cost;

            maxProfit = Math.max(maxProfit , currentProfit);

            if(prices[i] < cost) cost = prices[i];
        }

        return maxProfit;
        
    }
}
