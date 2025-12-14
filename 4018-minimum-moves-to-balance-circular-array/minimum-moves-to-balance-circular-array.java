class Solution {
    public long minMoves(int[] balance) {
           long sum = 0;
           int neg = -1;
           int n = balance.length;
           for(int i=0;i<n;i++){
                sum+=balance[i];
                if(balance[i]<0){
                    neg = i;
                }
           }
           if(sum<0) {
            return -1;
           }
           if(neg==-1){
               return 0;
           }
           int dis = 1;
           long moves = 0;
           while(balance[neg]<0){
                 int left = (neg-dis+n)%n;
                 int right = (neg+dis)%n;

                 long amount = balance[left]+balance[right];
                 if(left==right){
                    amount-=balance[left];
                 }
                 long need = -balance[neg];
                 long take = Math.min(amount , need);
                 balance[neg]+=take;
                 moves+=dis*take;
                 dis++;
           }
        return moves;
    }
}