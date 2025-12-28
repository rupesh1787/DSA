class Solution {
    public int countNegatives(int[][] grid) {
           int m = grid.length;  //rows
           int n = grid[0].length; //columns

           int row = 0;
           int col = n-1;
           int count = 0;
           while(row<m && col>=0){
               if(grid[row][col]<0){
                count+=(m-row);
                 col--;
               }
               else{
                row++;
               }
           }
           return count;
    }
}