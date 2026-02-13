class Solution {
    public int smallestRangeI(int[] nums, int k) {
         int n = nums.length;
         int ans = 0;
         Arrays.sort(nums);
         int min = nums[0]+k;
         int max = nums[n-1]-k;
         if(max-min<0){
               ans = 0;
         }
         else{
            ans = max-min;
         }
         return ans;

    }
}