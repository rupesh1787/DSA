class Solution {
    public int countAsterisks(String s) {
        int ans =0;
        int condition = 0;
        for(int i =0;i<s.length();i++){
            char hh = s.charAt(i);

            if(hh == '|'){
                condition++;
            }
            else if (hh == '*' && condition%2==0){
                ans++;
            }

        }
        return ans;
    }
}