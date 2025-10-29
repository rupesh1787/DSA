class Solution {
    public int countValidSelections(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int result = 0;
        int leftsum = 0;
        for(int i=0;i<n;i++){
             leftsum+= nums[i];
            int rightsum = sum-leftsum;
            if(nums[i]==0){
            if(leftsum == rightsum){
                result+=2;
            }
            if(Math.abs(leftsum-rightsum)==1){
                result+=1;
            }
            }
        }
        return result;
    }
}