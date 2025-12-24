class Solution {
    public int mirrorDistance(int n) {
        int original = n;
        int rem = 0;
        while(n!=0){
            rem = n%10+rem*10;
            n/=10;

        }
        return Math.abs(original-rem);
    }
}