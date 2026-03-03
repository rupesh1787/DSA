class Solution {
    boolean caneat(int piles[] , int mid , int h){
          int actualhours = 0;
          for(int x:piles){
            actualhours+=x/mid;
            if(x%mid!=0){    // extra hours ke liye
                actualhours++;
            }
          }
          return actualhours<=h;  // if it satisfy we are good to go
          
    }
    public int minEatingSpeed(int[] piles, int h) {
             int max = Integer.MIN_VALUE;
             int n  = piles.length;
             for(int i=0;i<n;i++){
                max = Math.max(max , piles[i]);
             }

             int l = 1;
             int r = max;
             while(l<r){
                int mid = l+(r-l)/2;
                if(caneat(piles , mid , h)){
                    r = mid;  // agar wo kr paa rha toh usse bade bhi kr hi paa rhe hoge , not need to check will look for smaller
                }
                else{
                    l = mid+1;
                }
             }
             return l;
    }
}