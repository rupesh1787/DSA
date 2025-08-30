class Solution {
    public boolean isPalindrome(int x) {
        String s1 = String.valueOf(x);
        int left = 0;
        int right = s1.length() - 1;
        
        while (left < right) {
            if (s1.charAt(left) != s1.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
