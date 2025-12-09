class Solution {
    public int missingNumber(int[] nums) {
        
        // sorting se ho jaata 
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
              if(nums[i]!=i){
                return i;
              }
        }

        return nums.length;
    } 
}