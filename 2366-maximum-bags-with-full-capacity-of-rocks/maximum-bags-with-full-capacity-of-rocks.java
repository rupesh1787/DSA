class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
                int n = capacity.length;
                int count = 0;
                int difference[] = new int[n];
                for(int i=0;i<n;i++){
                     difference[i] = capacity[i]-rocks[i];
                   
                }
                Arrays.sort(difference);
                int i = 0;
                while(additionalRocks>0 && i<n){
                    if(difference[i]==0){
                        count++;
                    }
                    else if(difference[i]<=additionalRocks){
                          additionalRocks-=difference[i];
                          count++;
                    }
                    else{
                        break;
                    }
                    i++;
                }
                return count;
                     
    }
}