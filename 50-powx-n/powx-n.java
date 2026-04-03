class Solution {
    
    double power(double x, long n) {
        // base case
        if (n == 0) return 1;

        double half = power(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }
    } 

    public double myPow(double x, int n) {
        if (n < 0) {
            return 1 / power(x, -(long)n); // avoid overflow
        }
        return power(x, n);
    }
}