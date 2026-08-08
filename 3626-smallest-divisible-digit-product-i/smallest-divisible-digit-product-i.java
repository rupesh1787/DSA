class Solution {
    public int smallestNumber(int n, int t) {
             int x = n;
             while(true){
                    int temp = x;
                    int product = 1;

                    while(temp>0){
                        int last = temp%10;
                        if(last==0){
                            product = 0;
                            break;                            
                        }
                        product*=last;
                        temp/=10;
                    }
                    if(product%t==0){
                        return x;
                    }
                    x++;
             }
             
    }
}