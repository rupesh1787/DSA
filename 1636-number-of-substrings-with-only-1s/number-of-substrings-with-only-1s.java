class Solution {
    public int numSub(String s) {
        int mod = 1_000_000_007;
        long ans  = 0;
        long count = 0; // why long as we are mutlpying it with again and again so it could overflow 
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
        ans = (ans+(count*(count+1)/2))%mod;// this is for last set of 1 , as we are only adding in ans once we hit 0 , but what if we have 1 in last 
        return (int)ans;
    }
}