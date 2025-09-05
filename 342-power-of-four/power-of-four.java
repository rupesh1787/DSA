class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;  // Negative numbers and 0 are not powers of four

        while (n % 4 == 0) {
            n /= 4;
        }

        return n == 1;
    }
}
