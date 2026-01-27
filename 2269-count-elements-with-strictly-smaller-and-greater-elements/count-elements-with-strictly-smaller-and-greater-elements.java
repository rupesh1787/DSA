class Solution {
    public int countElements(int[] nums) {
           int n = nums.length;
           
           int idx1 = -1;
           int idx2 = -1;
           Arrays.sort(nums);
           for(int i=1;i<n;i++){
               if(nums[i]>nums[i-1]){
                    idx1= i;
                    break;
               }
           }
           for(int j=n-2;j>=1;j--){
               if(nums[j]<nums[j+1]){
                      idx2 = j;
                      break;
               }
           }
           if(idx1==-1||idx2==-1 || idx2<idx1){
                return 0;
           }
           return idx2-idx1+1;

    }
}