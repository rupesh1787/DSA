class Solution {
    public int maxProfit(int[] prices) {
          int b1 = Integer.MAX_VALUE;
          int b2 = Integer.MAX_VALUE;
          int profit1 = 0;
          int profit2 = 0;
          for(int i:prices){
              b1 = Math.min(b1,i);
              profit1 = Math.max(profit1,i-b1);

              b2 = Math.min(b2,i-profit1);
              profit2 = Math.max(profit2,i-b2);
          }
          return profit2;
    }
}