class Solution {
    public boolean canPartitionGrid(int[][] grid) {
          int n = grid.length;
          int m = grid[0].length;
          long total = 0;
          long row[] = new long[n];
          long col[] = new long[m];
          for(int i=0;i<n;i++){
              for(int j=0;j<m;j++){
                  total+=grid[i][j];
                  row[i]+=grid[i][j];
                  col[j]+=grid[i][j];
              }
          }
          if(total%2!=0){
            return false;
          }
          //Horizontal
          long upper = 0;
          for(int i=0;i<n-1;i++){
               upper+=row[i];
               if(total-upper == upper){
                  return true;
               }
          }
          //Vertical
          long side = 0;
          for(int i=0;i<m-1;i++){
              side+=col[i];
              if(total-side == side){
                return true;
              }
          }
          return false;
    }
}