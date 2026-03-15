class Solution {
    public int maxSubarraySumCircular(int[] nums) {
                 int curr = 0;
                 int max = Integer.MIN_VALUE;
                 int min = Integer.MAX_VALUE;
                 int currmin = 0;
                 int total =0;
                 for(int num:nums){
                    curr = Math.max(num , curr+num);
                    max = Math.max(max , curr);

                    currmin = Math.min(num , currmin+num);
                    min = Math.min(min , currmin);

                    total+=num;
                 }
                 if(max<0){
                    return max;
                 }
                 return Math.max(max , total-min);

    }
}