class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] result = new int[m * n];
        int idx = 0;

        // sum = i + j ranges from 0 to m + n - 2
        for (int sum = 0; sum <= m + n - 2; sum++) {
            // Even sum → traverse upwards (reverse order)
            if (sum % 2 == 0) {
                int i = Math.min(sum, m - 1);
                int j = sum - i;
                while (i >= 0 && j < n) {
                    result[idx++] = mat[i][j];
                    i--;
                    j++;
                }
            } 
            // Odd sum → traverse downwards (normal order)
            else {
                int j = Math.min(sum, n - 1);
                int i = sum - j;
                while (j >= 0 && i < m) {
                    result[idx++] = mat[i][j];
                    i++;
                    j--;
                }
            }
        }
        return result;
    }
}

