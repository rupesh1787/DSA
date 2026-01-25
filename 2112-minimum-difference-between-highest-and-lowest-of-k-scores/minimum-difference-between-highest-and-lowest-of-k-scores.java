class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n  = nums.length;
        int min = Integer.MAX_VALUE;
        int j=k-1;
        int i= 0;
        while(j<n){
            int diff = nums[j]-nums[i];
            min = Math.min(min,diff);
            i++;
            j++;
        }
        return min;
    }
}