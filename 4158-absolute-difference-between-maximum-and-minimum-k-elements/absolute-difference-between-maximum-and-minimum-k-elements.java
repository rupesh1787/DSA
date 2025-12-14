class Solution {
    public int absDifference(int[] nums, int k) {
         Arrays.sort(nums);
         int n = nums.length;
         int max = 0;
         int min = 0;
         for(int i=0;i<k;i++){
               min+=nums[i];
         }   
         for(int i=n-1;i>=n-k;i--){
               max+=nums[i];
         }
         return max-min;
    }
}