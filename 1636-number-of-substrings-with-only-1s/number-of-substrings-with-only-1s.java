class Solution {
    public int numSub(String s) {
        int mod = 1_000_000_007;
        long ans  = 0;
        long count = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                count++;
            }
            else{
                ans = (ans+(count*(count+1)/2))%mod;
                count = 0;
            }
        }
        ans = (ans+(count*(count+1)/2))%mod;
        return (int)ans;
    }
}