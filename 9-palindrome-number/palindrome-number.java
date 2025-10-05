class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;

        }
        else{
            return x == reverse(x);
        }
        
    }
    public int reverse(int n){
        int reverse = 0;
        while(n>0){
            int remainder = n%10;
            reverse = reverse*10+remainder;
            n/=10;
        }
        return reverse;
    }
}