import java.util.*;

class Solution {
    public int numberOfPairs(int[][] points) {
        int n = points.length;

        // Sort points: first by x ascending, then by y descending
        Arrays.sort(points, (a, b) -> {
            if (a[0] == b[0]) return b[1] - a[1];
            return a[0] - b[0];
        });

        int result = 0;

        for (int i = 0; i < n; i++) {
            // Alice's position (upper-left corner)
            int x1 = points[i][0];
            int y1 = points[i][1];

            int maxY = Integer.MIN_VALUE;

            // Find Bob's position (lower-right corner)
            for (int j = i + 1; j < n; j++) {
                int x2 = points[j][0];
                int y2 = points[j][1];

                // Bob must be strictly below Alice
                if (y2 > y1) {
                    continue;
                }

                if (y2 > maxY) {
                    result++;
                    maxY = y2;
                }
            }
        }

        return result;
    }
}
