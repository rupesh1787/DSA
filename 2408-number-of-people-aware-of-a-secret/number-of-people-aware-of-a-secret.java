class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int MOD = 1000000007;
        long[] dp = new long[n + 1];  // dp[i] = new people who learn on day i
        dp[1] = 1;  // Day 1, one person knows the secret

        long[] prefix = new long[n + 2];  // prefix sum to track how many can share
        prefix[1 + delay] = (prefix[1 + delay] + dp[1]) % MOD;
        prefix[1 + forget] = (prefix[1 + forget] - dp[1] + MOD) % MOD;

        long curr = 0; // active sharers
        for (int day = 2; day <= n; day++) {
            curr = (curr + prefix[day]) % MOD; // update active sharers
            dp[day] = curr;

            // schedule this group’s sharing/forgetting
            if (day + delay <= n) {
                prefix[day + delay] = (prefix[day + delay] + dp[day]) % MOD;
            }
            if (day + forget <= n) {
                prefix[day + forget] = (prefix[day + forget] - dp[day] + MOD) % MOD;
            }
        }

        long ans = 0;
        for (int day = n - forget + 1; day <= n; day++) {
            if (day >= 1) ans = (ans + dp[day]) % MOD;
        }
        return (int) ans;
    }
}
