import java.util.*;

class Solution {
    boolean possible(int[] price, int mid, int k) {
        int count = 1; // first element taken
        int last = price[0];

        for (int i = 1; i < price.length; i++) {
            if (price[i] - last >= mid) {
                count++;
                last = price[i];
            }
        }
        return count >= k;
    }

    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int n = price.length;

        int start = 0;
        int end = price[n - 1] - price[0];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (possible(price, mid, k)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
}