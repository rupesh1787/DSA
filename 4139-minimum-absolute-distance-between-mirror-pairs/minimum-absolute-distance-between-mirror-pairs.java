import java.util.*;

class Solution {

    int reverse(int n){
        int rev = 0;
        while(n > 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }

    public int minMirrorPairDistance(int[] nums) {
        int n = nums.length;
        int result = Integer.MAX_VALUE;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            // check if current number exists as reversed before
            if(map.containsKey(nums[i])){
                result = Math.min(result, i - map.get(nums[i]));
            }

            // store reverse of current number
            map.put(reverse(nums[i]), i);
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }
}