class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Use 3 hashsets arrays: one for rows, one for cols, one for 3x3 boxes
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char val = board[r][c];

                if (val == '.') continue;

                // Check row
                if (rows[r].contains(val)) return false;
                rows[r].add(val);

                // Check col
                if (cols[c].contains(val)) return false;
                cols[c].add(val);

                // Check 3x3 sub-box
                int boxIndex = (r / 3) * 3 + (c / 3);
                if (boxes[boxIndex].contains(val)) return false;
                boxes[boxIndex].add(val);
            }
        }
        return true;
    }
}
