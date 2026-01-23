class Solution {
    boolean isSorted(int nums[],int n){
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }
    public int minimumPairRemoval(int[] nums) {
           int ans = 0;
           int n = nums.length;
           while(!isSorted(nums,n)){
               int min = Integer.MAX_VALUE;
               ans++;
               int pos = -1;
               for(int i=1;i<n;i++){
                    int sum = nums[i]+nums[i-1];
                    if(sum<min){
                        min = sum;
                        pos = i;
                    }
               }
                nums[pos-1] = min;
               for(int k = pos;k<n-1;k++){
                      nums[k] = nums[k+1];

               }
               n--;

           }
           return ans;
    }
}