class Solution {
    public boolean checkOnesSegment(String s) {
          // s = 1001 -- false
          // s = 110 -- True
         int n = s.length();
         int segment = 0;
         for(int i =0;i<n;i++){
               if(s.charAt(i)=='1'){
                    if(i==0 || s.charAt(i-1)=='0'){
                        segment++;
                    }
               }
         }
               return segment==1;
    }
}