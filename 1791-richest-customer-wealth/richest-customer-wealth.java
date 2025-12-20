class Solution {
    public int maximumWealth(int[][] accounts) {
          int maxrich = 0;
         for(int customer[]:accounts){
              int sum = 0;
              for(int money:customer){
                   sum+=money;
                  maxrich  = Math.max(maxrich , sum);
              }
         }
         return maxrich;
    }
}