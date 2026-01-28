class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int result = 0;
        int zero = 0;
        int i = 0;
        int j =  0;
        int windowsum = 0;
        while(j<n){
            windowsum+=nums[j];
            while(i<j && (nums[i]==0 || windowsum>goal)){
                if(nums[i]==0){
                      zero++;
                }else{
                    zero=0;
                }
                windowsum-=nums[i];
                i++;
            }
            if(windowsum==goal){
                  result+=1+zero;
            }
            j++;
        }
        return result;
    }
}
