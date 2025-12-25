class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes , (a,b)->a[1]-b[1]);
        int score = 0;
        int i = boxTypes.length-1;
        while(truckSize!=0 && i>=0){
            int ans =Math.min(truckSize , boxTypes[i][0]);
            score+=ans*boxTypes[i][1];
            i--;
            truckSize-=ans;
        }
        return score;
    }
}