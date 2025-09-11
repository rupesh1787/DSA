class Solution {
    public String sortVowels(String s) {
        // Define vowels
        String vowels = "aeiouAEIOU";
        
        // Step 1: Collect vowels
        List<Character> vowelList = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                vowelList.add(c);
            }
        }
        
        // Step 2: Sort vowels by ASCII value
        Collections.sort(vowelList);
        
        // Step 3: Build result
        StringBuilder result = new StringBuilder();
        int idx = 0; // pointer for sorted vowels
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                result.append(vowelList.get(idx++)); // replace with sorted vowel
            } else {
                result.append(c); // keep consonant
            }
        }
        
        return result.toString();
    }
}
