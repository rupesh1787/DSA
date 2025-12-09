class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        
        int out[] = new int[2];
        for(int i=0;i<n-1;i++){
              for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                     out[0] = i;  
                     out[1] = j;  
                }
              }
        }
        return out;
    }
}