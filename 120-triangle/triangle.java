class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        
        // Start from second-last row and go upwards
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                int curr = triangle.get(i).get(j);
                int belowLeft = triangle.get(i + 1).get(j);
                int belowRight = triangle.get(i + 1).get(j + 1);
                
                // update current cell with min path sum
                triangle.get(i).set(j, curr + Math.min(belowLeft, belowRight));
            }
        }
        
        return triangle.get(0).get(0); // top element has result
    }
}
