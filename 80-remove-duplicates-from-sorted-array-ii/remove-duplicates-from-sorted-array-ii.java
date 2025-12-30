class Solution {
    public int removeDuplicates(int[] nums) {

        int i = 0;   // write index

        for (int n : nums) {

            // allow first two elements
            // OR allow if current element is different from element at i-2
            if (i < 2 || n != nums[i - 2]) {
                nums[i] = n;
                i++;
            }
        }

        return i;
    }
}
