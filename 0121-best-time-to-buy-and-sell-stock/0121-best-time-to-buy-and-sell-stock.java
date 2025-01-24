class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min_buy=Integer.MAX_VALUE;

        for(int i: prices){
            min_buy = Math.min(min_buy, i);
            profit = Math.max(profit, i-min_buy);
        }
        return profit;
    }
}