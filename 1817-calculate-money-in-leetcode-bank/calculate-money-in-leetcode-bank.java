class Solution {
    public int totalMoney(int n) {
        int num = 1;
        int day = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum+num+day;
            day++;
            if(day==7){
                num++;
                day = 0;
            }
        }
        return sum;
    }
}