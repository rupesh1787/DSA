class Solution {
    public long maxMatrixSum(int[][] matrix) {
            long sum = 0;
            int negative = 0;
            int smallest = Integer.MAX_VALUE;
            int row = matrix.length;
            int col = matrix[0].length;
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                      smallest = Math.min(smallest , Math.abs(matrix[i][j]));
                      sum+=Math.abs(matrix[i][j]);
                      if(matrix[i][j]<0){
                             negative++;
                      }
                }
            }
            if(negative%2==0){
                return sum;
            }
            else{
                return sum-=2*smallest;
            }
    }
}