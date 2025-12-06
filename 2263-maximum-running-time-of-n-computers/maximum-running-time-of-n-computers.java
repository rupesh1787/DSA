class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long left = 0;
        long sum = 0;
        for(int b:batteries){
              sum+=b;
            
        }
        long ans = 0;
        long right = sum/n;
        while(left<=right){
            long mid = left+(right-left)/2;
        

            if(ispossible(mid , n , batteries)==1){
                  left = mid+1;
                  ans =mid;
            }else{
                right = mid-1;
            }
        }
        return ans;
    }
    long ispossible(long mid , int n , int batteries[]){
        long total = 0;
        for(int b:batteries){
            total+=Math.min(b,mid);
        }
        if(total>=(long)n*mid){
            return 1;
        }else{
            return 0;
        }
    }
}