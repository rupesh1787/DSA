class Solution {
    public int maxCoins(int[] piles) {
           Arrays.sort(piles);
           int n = piles.length;
           int coins = 0;
           int rounds = n/3;
           for(int i=n-2;i>=rounds;i-=2){
                  coins+=piles[i];
           }
           return coins;
    }
}