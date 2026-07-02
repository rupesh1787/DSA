class Solution {
    public boolean canJump(int[] nums) {
            int finals = nums.length-1;
            for(int i=finals-1;i>=0;i--){
                 if(i+nums[i]>=finals){
                      finals = i;
                 }
            }
            return finals==0;
    }
}