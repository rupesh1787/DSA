class Solution {
    public long maximumScore(int[] nums) {
        // for every i we need two things -- 1) prefix sum till that i 2) minimum element from right to 
        //i+1 ;
        int n = nums.length;
        long prefix[] = new long[n];
        prefix[0] = nums[0];
        for(int i=1;i<n;i++){
           prefix[i]=prefix[i-1]+nums[i];
        }
        long suffixmin[] = new long[n];
        suffixmin[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffixmin[i] = Math.min(nums[i],suffixmin[i+1]);
        }
        long score = Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
              long current = prefix[i]-suffixmin[i+1];
           score = Math.max(score,current);
        }
        return score;
    }
}