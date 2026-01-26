class Solution {
    public int[] finalPrices(int[] prices) {
          int n = prices.length;
          int arr[] = new int[n];
          for(int i=0;i<n;i++){
              arr[i] = prices[i];
                for(int j=i+1;j<n;j++){
                    if(prices[j]<=prices[i]){
                          arr[i] = prices[i]-prices[j];
                          break;
                    }
                }
          }
          return arr;
    }
}