class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
              if(nums[i]<0){
                 nums[i] = nums[i]*-1;
              }
        }
        Arrays.sort(nums);
        int start = 0;
        int end = n-1;
        long count = 0;
        while(start<=end){
            if(start == end){
                count+=nums[start]*nums[start];
            }
          count+= nums[end]*nums[end] - nums[start]*nums[start];
          start++;
          end--; 
        }
        return count;
    }
}