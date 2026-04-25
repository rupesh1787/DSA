class Solution {
    public int furthestDistanceFromOrigin(String moves) {
            int Left = 0;
            int Right = 0;
            int blank = 0;
            for(int i=0;i<moves.length();i++){
                   if(moves.charAt(i)=='L'){
                          Left++;
                   }
                   else if(moves.charAt(i)=='R'){
                          Right++;
                        
                   }
                   else{
                    blank++;
                   }
                  

            }
            int ans = Math.abs(Left-Right) + blank;
            return ans;
    }
}