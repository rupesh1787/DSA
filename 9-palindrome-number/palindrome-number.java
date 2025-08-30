class Solution {
    public boolean isPalindrome(int n) {
        if(n<0){
            return false;
        }
       return n == isreverse(n);
          
    }
    public int isreverse(int x){
        int reverse = 0;
        while(x>0){
           int remainder = x%10;
           reverse = reverse*10+remainder;
           x/=10;
        }
        return reverse;
    }
}