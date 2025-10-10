class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int total[]  = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(i+k<n){
                total[i] = energy[i] + total[i+k];

            }
            else{
                total[i] = energy[i];

            }
            max = Math.max(total[i] , max);
        }
return max;
    }
}