import java.util.HashMap;

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        int result = 0;
        int oddCount = 0;
        
        // we have seen oddCount = 0 once initially
        mp.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            // increment oddCount if current number is odd
            if (nums[i] % 2 != 0) {
                oddCount++;
            }

            // check if (oddCount - k) exists
            if (mp.containsKey(oddCount - k)) {
                result += mp.get(oddCount - k);
            }

            // update frequency of current oddCount
            mp.put(oddCount, mp.getOrDefault(oddCount, 0) + 1);
        }

        return result;
    }
}