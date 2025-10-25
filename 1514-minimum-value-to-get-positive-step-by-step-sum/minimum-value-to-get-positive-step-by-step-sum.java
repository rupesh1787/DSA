class Solution {
    public int minStartValue(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        prefix[0] = nums[0];
        
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (prefix[i] < min) {
                min = prefix[i];
            }
        }

        if (min < 0) {
            return 1 - min; // bring minimum up to 1
        } else {
            return 1;       // already positive
        }
    }
}
