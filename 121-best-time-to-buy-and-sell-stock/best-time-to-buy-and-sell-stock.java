class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int minvalue = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            minvalue = Math.min(minvalue,prices[i]);
            int profit =(prices[i] - minvalue);
            maxprofit = Math.max(profit,maxprofit);
        }

        return maxprofit;
    }
}