class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes , (a,b)->a[1]-b[1]);
        int score = 0;
        int i = boxTypes.length-1;
        while(truckSize!=0 && i>=0){
            if(truckSize>=boxTypes[i][0]){
                score+=boxTypes[i][0]*boxTypes[i][1];
                truckSize-=boxTypes[i][0];
            }
            else{
                 score+=truckSize*boxTypes[i][1];
                 truckSize = 0;
            }
            i--;
        }
        return score;
    }
}