class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        boolean[] isVowel = new boolean[26];
        
        // Mark vowels
        for (char v : "aeiou".toCharArray()) {
            isVowel[v - 'a'] = true;
        }

        int maxVowel = 0, maxConsonant = 0;

        // Count and update on the fly
        for (char c : s.toCharArray()) {
            int idx = c - 'a';
            freq[idx]++;

            if (isVowel[idx]) {
                maxVowel = Math.max(maxVowel, freq[idx]);
            } else {
                maxConsonant = Math.max(maxConsonant, freq[idx]);
            }
        }

        return maxVowel + maxConsonant;
    }
}
