class Solution {

    boolean isMagicSquare(int[][] grid, int r, int c) {

        HashSet<Integer> set = new HashSet<>();

        // 1️Check numbers 1–9 and unique
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = grid[r + i][c + j];

                if (num < 1 || num > 9 || set.contains(num)) {
                    return false;
                }
                set.add(num);
            }
        }

        // Check row, column, diagonal sums
        int sum = grid[r][c] + grid[r][c + 1] + grid[r][c + 2];

        // Row wise
        for (int i = 0; i < 3; i++) {
            if (grid[r + i][c] + grid[r + i][c + 1] + grid[r + i][c + 2] != sum) {
                return false;
            }
        }

        // Column wise
        for (int i = 0; i < 3; i++) {
            if (grid[r][c + i] + grid[r + 1][c + i] + grid[r + 2][c + i] != sum) {
                return false;
            }
        }

        // Diagonals
        if (grid[r][c] + grid[r + 1][c + 1] + grid[r + 2][c + 2] != sum) {
            return false;
        }

        if (grid[r][c + 2] + grid[r + 1][c + 1] + grid[r + 2][c] != sum) {
            return false;
        }

        return true;
    }

    public int numMagicSquaresInside(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        for (int i = 0; i <= rows - 3; i++) {
            for (int j = 0; j <= cols - 3; j++) {
                if (isMagicSquare(grid, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }
}
