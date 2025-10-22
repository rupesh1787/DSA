class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;

        int pehla1 = 2;
        int pehla2 = 1;
        int current = 0;
        for(int i=3;i<=n;i++){
            current = pehla2 + pehla1;
            int temp = pehla2;
            pehla2 = pehla1;
            pehla1 = current;
        }
        return current;
    }
}