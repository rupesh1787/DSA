import java.util.*;

class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        int[][] jobs = new int[n][2];

        for (int i = 0; i < n; i++) {
            jobs[i][0] = difficulty[i];
            jobs[i][1] = profit[i];
        }

        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);   // sort by difficulty
        Arrays.sort(worker);                        // sort workers

        int ans = 0;
        int bestProfit = 0;
        int j = 0;

        for (int w : worker) {
            while (j < n && jobs[j][0] <= w) {
                bestProfit = Math.max(bestProfit, jobs[j][1]);
                j++;
            }
            ans += bestProfit;
        }

        return ans;
    }
}
