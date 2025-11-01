class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int teams = 0;
        for(int i=1;i<n-1;i++){
              int leftsmall =0;
              int leftlarge = 0;
              int rightsmall = 0;
              int rightlarge = 0;
        for(int j=0;j<i;j++){
            if(rating[i]<rating[j]){
                  leftlarge+=1;
            }
            else if(rating[i]>rating[j]){
                leftsmall+=1;
            }
        }
        for(int k=i+1;k<n;k++){
            if(rating[k]<rating[i]){ 
                rightsmall+=1;
            }
            else if(rating[k]>rating[i]){
                rightlarge+=1;
            }
        }
        teams+=(leftsmall*rightlarge)+(leftlarge*rightsmall);
        
        }
        return teams;
    }
}