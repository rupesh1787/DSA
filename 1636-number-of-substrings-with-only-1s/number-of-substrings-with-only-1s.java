class Solution {
    public int numSub(String s) {
        int mod = 1_000_000_007;
        long ans  = 0;
        long count = 0; 
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                count++;
                ans = (ans + count) % mod;
            } else {
                count = 0;
            }
        }

        return (int) ans;
    }
}
