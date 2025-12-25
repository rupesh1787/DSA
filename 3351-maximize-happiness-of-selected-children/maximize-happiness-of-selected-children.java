class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
              long sum = 0;
              int n = happiness.length;
              Arrays.sort(happiness);
              int i = happiness.length-1;
              int j = 0;
              while(i>=n-k){
                int curr = happiness[i]-j;
                if(curr<=0) break;
                  sum+=happiness[i];
                  sum-=j;
                  i--;
                  j++;
              }
         return sum;
    }
}