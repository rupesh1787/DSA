class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int min = 1;
        int max = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        int result = max;
        while(min<=max){
            int mid = min+(max-min)/2;
            int sum = 0;
            for(int i=0;i<nums.length;i++){
                 sum +=(nums[i]+mid-1)/mid;
            }
            if(sum<=threshold){
                result = mid;
                max = mid-1;
            }
            else{
                min = mid+1;
            }
        }
        return result;
    }
}