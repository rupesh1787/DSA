class Solution {
    public int bulbSwitch(int n) {
        
       
        
        int ans  = 0;
        for(long i=1;i<=n;i++){
               if(i*i<=n){
                  ans++;
               }
        }
        return ans;
    }
}