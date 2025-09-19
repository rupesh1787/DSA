class Spreadsheet {
    private int[][] grid;  // rows x 26

    public Spreadsheet(int rows) {
        grid = new int[rows][26];
    }

    // Set cell value
    public void setCell(String cell, int value) {
        int[] pos = parseCell(cell);
        grid[pos[0]][pos[1]] = value;
    }

    // Reset cell to 0
    public void resetCell(String cell) {
        int[] pos = parseCell(cell);
        grid[pos[0]][pos[1]] = 0;
    }

    // Evaluate formula of form "=X+Y"
    public int getValue(String formula) {
        // Remove leading '='
        formula = formula.substring(1);
        String[] parts = formula.split("\\+");
        
        int left = getTokenValue(parts[0]);
        int right = getTokenValue(parts[1]);
        
        return left + right;
    }

    // Get value from either number or cell
    private int getTokenValue(String token) {
        if (Character.isDigit(token.charAt(0))) {
            return Integer.parseInt(token);
        } else {
            int[] pos = parseCell(token);
            return grid[pos[0]][pos[1]];
        }
    }

    // Parse "A1" → row,col
    private int[] parseCell(String cell) {
        char colChar = cell.charAt(0);
        int col = colChar - 'A';

        int row = Integer.parseInt(cell.substring(1)) - 1;
        return new int[]{row, col};
    }
}
