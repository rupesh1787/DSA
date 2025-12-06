class Solution {
    public int countCollisions(String directions) {
        char ch [] = directions.toCharArray();
        int n = ch.length;
        int i = 0;
        while(i<n && ch[i]=='L'){
            i++;
        }
        int j = n-1;
        while(j>=0 && ch[j]=='R'){
            j--;
        }
        int collisions = 0;
        while(i<=j){
           if(ch[i]!='S'){
              collisions++;
              
           }
           i++;
        }
        return collisions;
    }
}