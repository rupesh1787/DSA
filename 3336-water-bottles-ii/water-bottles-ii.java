class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int drunk = 0;
        int empty = 0;

        // drink all initial bottles
        drunk += numBottles;
        empty += numBottles;

        while (empty >= numExchange) {
            // trade once
            empty -= numExchange;
            numExchange++;
            // get 1 new bottle
            drunk++;
            empty++; // because we drink it immediately
        }

        return drunk;
    }
}
