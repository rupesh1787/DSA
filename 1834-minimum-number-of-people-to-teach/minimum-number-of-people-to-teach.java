import java.util.*;

class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        int m = languages.length; // number of users
        List<Set<Integer>> userLanguages = new ArrayList<>();
        
        // Build set of languages per user
        for (int[] langArr : languages) {
            Set<Integer> set = new HashSet<>();
            for (int lang : langArr) {
                set.add(lang);
            }
            userLanguages.add(set);
        }

        // Find problematic users
        Set<Integer> problematicUsers = new HashSet<>();
        for (int[] f : friendships) {
            int u = f[0] - 1; // convert to 0-based
            int v = f[1] - 1;
            Set<Integer> langsU = userLanguages.get(u);
            Set<Integer> langsV = userLanguages.get(v);

            // Check if they already share a language
            boolean canCommunicate = false;
            for (int lang : langsU) {
                if (langsV.contains(lang)) {
                    canCommunicate = true;
                    break;
                }
            }

            if (!canCommunicate) {
                problematicUsers.add(u);
                problematicUsers.add(v);
            }
        }

        // If no problematic users, answer is 0
        if (problematicUsers.isEmpty()) return 0;

        int minTeach = Integer.MAX_VALUE;

        // Try teaching each language
        for (int lang = 1; lang <= n; lang++) {
            int count = 0;
            for (int user : problematicUsers) {
                if (!userLanguages.get(user).contains(lang)) {
                    count++;
                }
            }
            minTeach = Math.min(minTeach, count);
        }

        return minTeach;
    }
}
