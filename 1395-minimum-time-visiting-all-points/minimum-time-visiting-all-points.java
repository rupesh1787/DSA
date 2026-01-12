class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
          int n = points.length;
          int score = 0;
          
          for(int i=1;i<n;i++){
              int d1 = points[i][0]-points[i-1][0];
              int d2 = points[i][1]-points[i-1][1];
            int max = Math.max(Math.abs(d1),Math.abs(d2));
            score+=max;
          }
          return score;
    }
}