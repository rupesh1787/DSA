class Solution {
    public int largestAltitude(int[] gain) {
            int n = gain.length;
            int altitude[] = new int[n+1];
            altitude[0] = 0;
            for(int i=1;i<n+1;i++){
                  altitude[i] = altitude[i-1]+gain[i-1];
            }
            int max = Integer.MIN_VALUE;
            for(int i=0;i<n+1;i++){
                max = Math.max(max,altitude[i]);
            }
          return max;
    }
}