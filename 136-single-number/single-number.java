import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);   // sort the array
        int n = nums.length;

        // Check pairs of numbers
        for (int i = 0; i < n - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];  // this one is unique
            }
        }

        return nums[n - 1];
    }
}
