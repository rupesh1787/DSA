class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
            int n = dist.length;
            int time[] = new int[n];
            for(int i=0;i<n;i++){
                // here we want exact divison -- isliye use kiya ceil division
                time[i] = (dist[i]+speed[i]-1)/speed[i];
            }
            Arrays.sort(time);
            int monster = 0;
            
            for(int i=0;i<n;i++){
                if(time[i]<=i){
                    break;
                }
                else{
                    monster++;
                }
            }
            return monster;
    }
}