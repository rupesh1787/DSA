class Solution {
    public int mirrorDistance(int n) {
        String s = String.valueOf(n);
        String reverse = new StringBuilder(s).reverse().toString();
        int x = Integer.parseInt(reverse);
        return Math.abs(n-x);
    }
}