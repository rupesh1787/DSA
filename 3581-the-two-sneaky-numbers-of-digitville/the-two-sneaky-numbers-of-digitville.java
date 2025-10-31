import java.util.*;

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        // Step 1: Create a HashMap to count frequencies
        Map<Integer, Integer> map = new HashMap<>();

        // Step 2: Count occurrences of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 3: Find numbers that appear twice
        int[] result = new int[2];
        int index = 0;

        for (int keys : map.keySet()) {
            if (map.get(keys) == 2) { // found a sneaky number
                result[index++] = keys;
            }
        }

        return result;
    }
}
