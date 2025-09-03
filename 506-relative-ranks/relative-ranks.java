import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] answer = new String[n];

        // Pair score with original index
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = score[i]; // score
            arr[i][1] = i;        // index
        }

        // Sort by score descending
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

        // Assign ranks
        for (int i = 0; i < n; i++) {
            int idx = arr[i][1]; // original index
            if (i == 0) answer[idx] = "Gold Medal";
            else if (i == 1) answer[idx] = "Silver Medal";
            else if (i == 2) answer[idx] = "Bronze Medal";
            else answer[idx] = String.valueOf(i + 1);
        }

        return answer;
    }
}
