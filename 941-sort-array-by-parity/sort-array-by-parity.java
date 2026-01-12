class Solution {
    public int[] sortArrayByParity(int[] nums) {
           int  r= nums.length;
           int n = nums.length;
           int k = 0;
           int arr[] = new int[n];
           for(int i=0;i<r;i++){
                if(nums[i]%2==0){
                       arr[k++] = nums[i];

                }
                else{
                      arr[n-1] = nums[i];
                      n--;
                }
           }
           return arr;
    }
}