class Solution {
    public int numberOfPairs(int[][] points) {
        int n = points.length;
        int ans = 0;

        // Pick point A
        for (int i = 0; i < n; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];

            // Pick point B
            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                int x2 = points[j][0];
                int y2 = points[j][1];

                // A should be upper left of B
                if (x1 <= x2 && y1 >= y2) {
                    boolean valid = true;

                    // Check if there is any point C inside or on the rectangle formed by A & B
                    for (int k = 0; k < n; k++) {
                        if (k == i || k == j) continue;

                        int x3 = points[k][0];
                        int y3 = points[k][1];

                        if (x3 >= x1 && x3 <= x2 && y3 <= y1 && y3 >= y2) {
                            valid = false;
                            break;
                        }
                    }

                    if (valid) ans++;
                }
            }
        }

        return ans;
    }
}
