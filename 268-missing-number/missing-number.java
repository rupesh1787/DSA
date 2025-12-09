class Solution {
    public int missingNumber(int[] nums) {
        // Xor --> a^a = 0
        // a^0 = a , xor --> associative , commutative 
        int ans  = 0;
        for(int i=1;i<=nums.length;i++){
            ans = ans^i;
        }
        for(int i=0;i<nums.length;i++){
            ans = ans^nums[i];
        }
        return ans;       
    } 
}