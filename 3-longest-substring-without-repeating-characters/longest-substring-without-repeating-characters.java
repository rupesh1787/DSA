class Solution {
    public int lengthOfLongestSubstring(String s) {
          int max = 0;
          HashSet<Character> set = new HashSet<>();
          int n = s.length();
          int i = 0; int j = 0;
          while(j<n){
               char ch  = s.charAt(j);
               if(!set.contains(ch)){
                    set.add(ch);
                    max = Math.max(max,j-i+1);
                    j++;
                    
               }
               else{
                    set.remove(s.charAt(i));
                    i++;
               }
              
          }
          return max;
    }
}