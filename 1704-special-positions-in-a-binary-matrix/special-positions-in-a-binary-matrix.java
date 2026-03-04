class Solution {
    public int numSpecial(int[][] mat) {
           int m = mat.length;
           int n = mat[0].length;
           int ans = 0;
           for(int row=0;row<m;row++){
              for(int col=0;col<n;col++){
                  if(mat[row][col]==1){
                      boolean special = true;
                      // rows
                      for(int i=0;i<m;i++){
                           if(i!=row && mat[i][col]==1){
                            special = false;
                            break;
                           }
                      }
                      // columns
                      for(int j=0;j<n;j++){
                        if(j!=col && mat[row][j]==1){
                            special = false;
                            break;
                        }
                      }
                      if(special==true){
                          ans++;
                      }
                  }
              }
           }
       return ans;          
    }
}