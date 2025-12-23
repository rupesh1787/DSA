class Solution {
    public int majorityElement(int[] nums) {
           Arrays.sort(nums);
           int n = nums.length;
           // if a elements n/2 se jyada baar aara , toh ofcourse after sorting wo middle ke pass aayega 
           // 1,1,1,2,2,2,2 - - 2 
          return nums[n/2];        
    }
}