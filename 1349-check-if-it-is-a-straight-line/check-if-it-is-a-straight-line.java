class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
      int n = coordinates.length;
      int dy = coordinates[1][1]-coordinates[0][1];
      int dx = coordinates[1][0]-coordinates[0][0];
      
      for(int i=2;i<n;i++){
        int dyi = coordinates[i][1]-coordinates[0][1];
        int dxi = coordinates[i][0]-coordinates[0][0];
        
        if(dy*dxi!=dyi*dx){
            return false;
        }
      }  
      return true;
    }
}