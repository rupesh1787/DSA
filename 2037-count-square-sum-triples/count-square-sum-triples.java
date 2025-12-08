class Solution {
    public int countTriples(int n) {
        int count = 0;
        for(int a=1;a<=n;a++){
            for(int b=a;b<=n;b++){
                int sqr = a*a+b*b;
                int c = (int)Math.sqrt(sqr);
                if(c<=n && c*c==sqr){
                    count+=2;
                }
            }
        }
        return count;
    }
}