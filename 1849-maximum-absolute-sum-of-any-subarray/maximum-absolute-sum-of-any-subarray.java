class Solution {
    public int maxAbsoluteSum(int[] nums) {
          int n = nums.length;
          int curr = nums[0];
          int maximum = nums[0];
          for(int i=1;i<n;i++){
              curr = Math.max(nums[i],curr+nums[i]);
              maximum = Math.max(maximum , curr);
          }
          int minimum = nums[0];
          int currmin = nums[0];
          for(int i=1;i<n;i++){
              currmin = Math.min(nums[i],currmin+nums[i]);
              minimum = Math.min(minimum , currmin);
          }
          return Math.max(Math.abs(minimum),maximum);

    }
}