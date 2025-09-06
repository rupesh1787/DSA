class Solution {
    public long minOperations(int[][] queries) {
        long total = 0;
        for (int[] q : queries) {
            long l = q[0], r = q[1];
            long s = prefix(r) - prefix(l - 1);
            total += ceilDiv2(s);
        }
        return total;
    }

    // F(n) = sum_{x=1..n} steps(x) = sum_{k>=0} max(0, n - 4^k + 1)
    private long prefix(long n) {
        if (n <= 0) return 0L;
        long ans = 0L;
        long pow = 1L; // 4^0
        while (pow <= n) {
            ans += (n - pow + 1);
            // advance pow = pow * 4 safely
            if (pow > Long.MAX_VALUE / 4) break; // guard overflow
            pow *= 4;
        }
        return ans;
    }

    private long ceilDiv2(long x) {
        // x >= 0 always here
        return (x + 1) >> 1;
    }
}
