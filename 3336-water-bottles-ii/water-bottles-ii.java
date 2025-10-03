class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int bottlesDrunk = numBottles;   // initially drink all full bottles
        int empty = numBottles;          // now all are empty

        while (empty >= numExchange) {
            // exchange empty bottles for 1 full bottle
            empty -= numExchange;
            numExchange++; 
            empty++;       
            bottlesDrunk++;
        }

        return bottlesDrunk;
    }
}
