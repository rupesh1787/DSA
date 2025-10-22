class Solution {
    public int strStr(String haystack, String needle) {
        int m  = haystack.length();
        int n  = needle.length();
        if(n==0) return 0;
        for(int i=0;i<=m-n;i++){
            String part = haystack.substring(i,i+n);
            if(part.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}