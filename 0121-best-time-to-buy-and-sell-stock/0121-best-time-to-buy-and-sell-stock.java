class Solution {
    public int maxProfit(int[] prices) {
        int min_buy=Integer.MAX_VALUE;
        int max_profit=0;

        for(int i: prices){
            min_buy = Math.min(i, min_buy);
            max_profit = Math.max(max_profit, i-min_buy);
        }

        return max_profit;

    }
}