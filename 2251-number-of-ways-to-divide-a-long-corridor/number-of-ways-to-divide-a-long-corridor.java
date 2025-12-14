class Solution {
    public int numberOfWays(String corridor) {
          long MOD = 1_000_000_007;
          int totalseat = 0;
          for(char c:corridor.toCharArray()){
            if(c=='S') totalseat++;
          }
          if(totalseat<2 || totalseat%2!=0){
                return 0;
          }
           long ways = 1;
           int plant = 0;
           int seat = 0;
           for(char c:corridor.toCharArray()){
               if(c=='S') {
                seat++;
               }
               if(seat==3){
                ways = (ways*(plant+1))%MOD;
                plant = 0;
                seat = 1;
               }
               else {
                  if(seat==2 && c=='P'){
                    plant++;
                  }
               }
           }
           return (int)ways;
    }
}