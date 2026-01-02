class Solution {
    public int repeatedNTimes(int[] nums) {
            int n = nums.length/2;
            Arrays.sort(nums);
            int count = 1;
            for(int i=1;i<2*n;i++){
                  if(nums[i]==nums[i-1]){
                      count+=1;
                      if(count==n){
                          return nums[i];
                
                      }
                  }
                  else{
                    count = 1;
                  }
            }
            return -1;
    }
}