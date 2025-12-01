class Solution {
    public int countElements(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        
        if(k==0){
            return n;
        }
        int count = 0;
        int max = nums[n-k];
        for(int num:nums){
            if(num<max) count++;
        }    
         return count;       
    }
}