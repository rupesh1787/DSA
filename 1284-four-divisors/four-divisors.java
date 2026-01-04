class Solution {
    int numbers(int n){
          int ans = 0;
          int count = 0;
          for(int i=1;i*i<=n;i++){
              if(n%i==0){
                 int d1 = i;
                 int d2 = n/i;
            if(d1==d2){
                count+=1;
                ans+=d2;
            } else{
                count+=2;
                ans+=d1+d2;
            }
              }
          }
          if(count!=4){
            return 0;
          }
          else{
            return ans;
          }
    }
    public int sumFourDivisors(int[] nums) {
                int result = 0;
                for(int num:nums){
                    result+=numbers(num);
                }
                return result;
    }
}