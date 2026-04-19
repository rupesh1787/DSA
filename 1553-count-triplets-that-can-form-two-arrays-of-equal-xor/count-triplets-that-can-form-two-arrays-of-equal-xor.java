class Solution {
    public int countTriplets(int[] arr) {
             int cost = 0;
             int n = arr.length;
             for(int i=0;i<n;i++){
                int xors = 0;
                for(int k=i;k<n;k++){
                    xors^=arr[k];
                    if(xors==0){
                          cost+= k-i;
                    }
                }
             }
             return cost;
    }
}