import java.util.Arrays;

class Solution {

    int[] dp;


    int helper(int n) {
        if (n == 0)
            return 0;

        if (dp[n] != -1)
            return dp[n];

        int minCount = Integer.MAX_VALUE;

        // try all perfect squares
        for (int i = 1; i * i <= n; i++) {
            int result = 1 + helper(n - i * i);
            minCount = Math.min(minCount, result);
        }

        // store result (memoization)
        dp[n] = minCount;
        return dp[n];
    }

    public int numSquares(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1); 
        return helper(n);
    }
}