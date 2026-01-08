class Solution {
    public int jump(int[] nums) {
        int range = 0;
        int totaljump = 0;
        int lastjumpidx = 0;
        int finishline = nums.length - 1;

        for (int i = 0; i < nums.length - 1; i++) {
            range = Math.max(range, i + nums[i]);

            if (i == lastjumpidx) {
               
                lastjumpidx = range;
                 totaljump++;
            }
        }
        return totaljump;
    }
}
