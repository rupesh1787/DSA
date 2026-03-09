class Solution {
    public int smallestBalancedIndex(int[] nums) {
           long sum = 0;
           for(int x:nums){
               sum+=x;
           }
           
           long product = 1;
           for(int i=nums.length-1;i>=0;i--){
                     sum-=nums[i];
                     if(sum==product){
                          return i;
                     }
                     if(sum<product){
                          break;
                     }
                     product*=nums[i];
           }
           return -1;
    }
}