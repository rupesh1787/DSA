class Solution {
    public int countPartitions(int[] nums) {
    
        int sum = 0;
        for(int i=0;i<nums.length;i++){
              sum+=nums[i];
        }
        int left = 0;
        int right = 0;
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
               left+=nums[i];
               right = sum-left;
               int diff = right-left;
               if(diff%2==0){
                   count++;
               }
        }
        return count;
    }
}