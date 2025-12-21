class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
            ArrayList<Integer> list = new ArrayList<>();   
            int m = matrix.length; //rows
            int n = matrix[0].length; //columns
            int top = 0;    // dir = 0 (left to right) top++;
            int bottom = m-1; //dir = 1(top to bottom) right--;
            int left = 0; // dir = 2(rt to left) bottom--;
            int right = n-1; //dir = 3 (bottom to up)left++;
            int dir = 0;
            while(top<=bottom && left<=right){
                if(dir==0){
                    for(int i=left;i<=right;i++){
                          list.add(matrix[top][i]);
                    }
                    top++;
                }
                if( dir==1){
                    for(int i=top;i<=bottom;i++){
                           list.add(matrix[i][right]);
                    }
                    right--;
                }
                if(dir==2){
                    for(int i=right;i>=left;i--){
                          list.add(matrix[bottom][i]);
                    }
                    bottom--;
                }
                if(dir==3){
                    for(int i=bottom;i>=top;i--){
                        list.add(matrix[i][left]);
                    }
                    left++;
                }
                dir++;

                if(dir==4){
                    dir = 0;
                }
            }
            return list;
              
            }
}