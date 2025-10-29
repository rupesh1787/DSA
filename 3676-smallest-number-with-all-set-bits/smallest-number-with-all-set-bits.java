class Solution {
    public int smallestNumber(int n) {
        int bit = (int)(Math.log(n)/Math.log(2)+1);
        return (1<<bit)-1;
    }
}