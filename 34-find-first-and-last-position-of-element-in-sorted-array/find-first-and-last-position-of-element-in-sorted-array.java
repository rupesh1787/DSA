class Solution {

    int fleftmost (int[] nums , int target , int n){
        int left = 0;
        int right = nums.length-1;
        int leftmost = -1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                leftmost = mid;
                right = mid-1;
            }
            else if(target>nums[mid]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return leftmost;
    }
    int frightmost (int[] nums , int target , int n){
        int left = 0;
        int right = nums.length-1;
        int rightmost = -1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                rightmost = mid;
                left = mid+1;
            }
            else if(target>nums[mid]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return rightmost;
    }
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int leffts = fleftmost(nums,target , n);
        int rights = frightmost(nums , target , n);

        return new int [] {leffts , rights};
        
    }
}