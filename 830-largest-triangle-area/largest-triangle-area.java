import java.util.*;

class Solution {
    public double largestTriangleArea(int[][] points) {
        // Step 1: Build convex hull
        List<int[]> hull = convexHull(points);
        int h = hull.size();
        double maxArea = 0.0;

        // Step 2: Rotating calipers to find max triangle area
        for (int i = 0; i < h; i++) {
            int k = i + 2;
            for (int j = i + 1; j < h; j++) {
                while (k < h && area(hull.get(i), hull.get(j), hull.get((k + 1) % h)) >
                               area(hull.get(i), hull.get(j), hull.get(k % h))) {
                    k++;
                }
                maxArea = Math.max(maxArea, area(hull.get(i), hull.get(j), hull.get(k % h)));
            }
        }
        return maxArea;
    }

    // Convex hull (Monotone chain algorithm)
    private List<int[]> convexHull(int[][] points) {
        Arrays.sort(points, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        List<int[]> lower = new ArrayList<>();
        for (int[] p : points) {
            while (lower.size() >= 2 && cross(lower.get(lower.size()-2), lower.get(lower.size()-1), p) <= 0)
                lower.remove(lower.size()-1);
            lower.add(p);
        }
        List<int[]> upper = new ArrayList<>();
        for (int i = points.length - 1; i >= 0; i--) {
            int[] p = points[i];
            while (upper.size() >= 2 && cross(upper.get(upper.size()-2), upper.get(upper.size()-1), p) <= 0)
                upper.remove(upper.size()-1);
            upper.add(p);
        }
        lower.remove(lower.size()-1);
        upper.remove(upper.size()-1);
        lower.addAll(upper);
        return lower;
    }

    private double area(int[] a, int[] b, int[] c) {
        return 0.5 * Math.abs(
            a[0]*(b[1]-c[1]) + b[0]*(c[1]-a[1]) + c[0]*(a[1]-b[1])
        );
    }

    private int cross(int[] a, int[] b, int[] c) {
        return (b[0]-a[0])*(c[1]-a[1]) - (b[1]-a[1])*(c[0]-a[0]);
    }
}
