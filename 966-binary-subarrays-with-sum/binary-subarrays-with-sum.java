class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int count = 0;
        int currsum = 0;

        for (int i = 0; i < n; i++) {
            currsum += nums[i];

            int remaining = currsum - goal;

            if (map.containsKey(remaining)) {
                count += map.get(remaining);
            }

          map.put(currsum , map.getOrDefault(currsum,0)+1);
        }

        return count;
    }
}
