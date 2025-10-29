class Solution {
    public int countValidSelections(int[] nums) {
           int count = 0;
           int result = 0;
           int n = nums.length;
           for(int i=0;i<n;i++){
              if(nums[i]!=0){
                count++;
              }
           }
           for(int i=0;i<n;i++){
            if(nums[i]==0){
                if(check(nums,i,1,count)){
                    result+=1;
                }
                if(check(nums,i,-1,count)){
                    result+=1;
                }
            }
           }
           return result;

 }
    public boolean check(int nums[],int idx , int dir ,int count){
        
        
        int temp[] = nums.clone();
        while(idx>=0 && idx<nums.length && count>0){
            if(temp[idx]>0){
                temp[idx]--;
                dir*=-1;
                if(temp[idx]==0){
                    count--;
                }
            }
            idx+=dir;
        }
        return count == 0;
    }

}