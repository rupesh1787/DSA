class Solution {
    public int maxScore(int[] cardPoints, int k) {
           int score = 0;
           int n = cardPoints.length;
           for(int i=0;i<k;i++){
                score+=cardPoints[i];
           }
           int max = score;
           int j = n-1;
           for(int i=0;i<k;i++){
                 score+=cardPoints[j];
                 j--;
                 score-=cardPoints[k-i-1];
                 max = Math.max(max,score);
           }
           return max;
    }
}