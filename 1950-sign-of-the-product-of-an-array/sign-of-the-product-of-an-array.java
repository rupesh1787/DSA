class Solution {
    public int signFunc(int x) {
        if (x > 0) return 1;
        if (x < 0) return -1;
        return 0; 
    }

    public int arraySign(int[] nums) {
        int x = 1;
        for (int i = 0; i < nums.length; i++) {
                // will give wrong ans for lsrger nums-- x*=nums[i]; 
                if(nums[i]==0) return 0;
                if(nums[i]<0) x = -x;
        }
        return signFunc(x);
    }
}
