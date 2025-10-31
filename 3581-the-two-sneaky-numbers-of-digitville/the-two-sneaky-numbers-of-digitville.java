class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int duplicate[] = new int[2];
        Arrays.sort(nums);
        int index = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                duplicate[index++] = nums[i];
            }
        }
        return duplicate;
    }
}