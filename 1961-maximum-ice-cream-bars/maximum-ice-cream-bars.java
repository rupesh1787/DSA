class Solution {
    public int maxIceCream(int[] costs, int coins) {
           Arrays.sort(costs);
           int i=0;
           int candies = 0;
           while(i<costs.length && coins>=0){
                 if(costs[i]<=coins){
                      candies++;
                      coins-=costs[i];
                 }
                 i++;

           }
           return candies;
    }
}