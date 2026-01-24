class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
           int n = s.length();
           int i = 0; int j = 0;
           int cost = 0;
           int max = 0;
           while(j<n){
            cost+=Math.abs(s.charAt(j)-t.charAt(j));
            while(cost>maxCost){
                  cost-=Math.abs(s.charAt(i)-t.charAt(i));
              i++;            
            }
             max = Math.max(max,j-i+1);
             j++;
                  

           }
           return max;
    }
}