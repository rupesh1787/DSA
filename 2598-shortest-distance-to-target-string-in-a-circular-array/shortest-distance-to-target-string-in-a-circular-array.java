class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
               int n = words.length;
               int result = Integer.MAX_VALUE;
               for(int i=0;i<n;i++){
                    if(words[i].equals(target)){
                           int d = Math.abs(i-startIndex);
                           int circle = Math.min(d,n-d);
                           result = Math.min(circle,result);
                    }
               }
               return result == Integer.MAX_VALUE?-1:result;
    }
}