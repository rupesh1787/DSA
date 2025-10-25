class Solution {
    public int largestAltitude(int[] gain) {
        int n  = gain.length;
        int prefix[] = new int[n+1];
        prefix[0] = 0;
   
        for(int i=1;i<=n;i++){
            prefix[i] = gain[i-1]+prefix[i-1];
        }
         int max = Integer.MIN_VALUE;
        for(int j=0;j<n+1;j++){
                if(max<prefix[j]){
                    max = prefix[j];
                }
        }
        return max;
    }
}