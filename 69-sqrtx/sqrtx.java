class Solution {
    public int mySqrt(int x) {
        double sqrt = Math.sqrt(x);
        int floor = (int)Math.floor(sqrt);
        return floor;
    }
}