class Solution {
    public int maxProfit(int[] prices) {
           int max = Integer.MIN_VALUE;
           int min = Integer.MAX_VALUE;
           for(int num:prices){
                min = Math.min(min,num);
                int curr = num-min;
                max = Math.max(max,curr);
           }
           return max;
    }
}