class Solution {

    public int buyChoco(int[] prices, int money) {

        int smallest = Integer.MAX_VALUE;
        int secondS = Integer.MAX_VALUE;

        for (int price : prices) {

            if (price < smallest) {

                secondS = smallest;
                smallest = price;
            }

            else if (price < secondS) {

                secondS = price;
            }
        }

        int x = money - smallest - secondS;

        if (x < 0) {
            return money;
        }

        return x;
    }
}