class Solution {
    public int maxProfit(int[] prices) {
           int n = prices.length;
           int arr[] = new int[n-1];
           for(int i=0;i<n-1;i++){
               arr[i] = prices[i]-prices[i+1];
           } 
           int sum = 0;
           for(int i=0;i<n-1;i++){
              if(arr[i]<0){
                  sum+=arr[i];
              }
           }
           return Math.abs(sum);
    }
}