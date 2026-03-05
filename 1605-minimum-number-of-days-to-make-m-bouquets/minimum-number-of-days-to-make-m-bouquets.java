class Solution {
    boolean canbloom(int [] bloomDay , int k ,int  m , int mid){
             int flowers = 0;
             int bouqets = 0;
             for(int i=0;i<bloomDay.length;i++){
                  if(mid>=bloomDay[i]){
                       flowers++;
                       if(flowers==k){
                           bouqets++;
                           flowers = 0;
                       }
                       

                  }
                  else{
                        flowers = 0;
                       }
             }
             return bouqets>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
            int min = Integer.MAX_VALUE;
            int max  = Integer.MIN_VALUE;
            int n = bloomDay.length;

            if((long)m*k>n) return -1;
            for(int i=0;i<n;i++){
                min = Math.min(min , bloomDay[i]);
                max = Math.max(max , bloomDay[i]);

            }
            int start = min;
            int end = max;
            int ans = -1;
            while(start<=end){
                int mid =start+(end-start)/2;
                if(canbloom(bloomDay , k , m , mid)){
                      end = mid-1;
                      ans = mid;
                }else{
                    start = mid+1;

                }
            }
            return ans;
    }
}