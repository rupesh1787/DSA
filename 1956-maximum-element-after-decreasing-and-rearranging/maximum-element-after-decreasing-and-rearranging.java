import java.util.*;

class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {

        Arrays.sort(arr);
        int n = arr.length;

        arr[0] = 1;

        for(int i = 1; i < n; i++) {
            // why 1 for keeping value as large as possible
            arr[i] = Math.min(arr[i], arr[i-1] + 1);
        }

        return arr[n-1];
    }
}