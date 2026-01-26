class Solution {
    public int minimumCost(int[] cost) {
         Arrays.sort(cost);
         int n = cost.length;
         int count = 0;
         int num = 0;
         for(int i=n-1;i>=0;i--){
               num++;
             if(num%3==0){
                 continue;
             }
             count+=cost[i];


         }
         return count;
    }
}