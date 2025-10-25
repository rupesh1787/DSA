class Solution {
    public int pivotIndex(int[] nums) {
       //prefix sum ;
       int n = nums.length;
       int prefix[] = new int[n];
       prefix[0] = nums[0];
       for(int i=1;i<n;i++){
        prefix[i] = nums[i] + prefix[i-1];
       }


       for(int i=0;i<n;i++){
        int left =(i==0)?0:prefix[i-1];
        int right = prefix[n-1]-left-nums[i];
           if(left==right){
            return i;
           }
           
       }
       return -1;
    }
}