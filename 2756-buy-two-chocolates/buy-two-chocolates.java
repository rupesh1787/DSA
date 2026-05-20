class Solution {
    public int buyChoco(int[] prices, int money) {
           Arrays.sort(prices);
           int sum = 0;
           for(int i=0;i<2;i++){
                sum+=prices[i];
           }
         int x = money-sum;
         if(x<0){
            x = money;
         }
          
          
          return x;
    }
}