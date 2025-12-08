class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0;
        int max = 0;
        int i = 0;
        int j = tokens.length-1;
        while(i<=j){
            if(power>=tokens[i]){
                  power-=tokens[i];
                  score++;
                  max = Math.max(max , score);
                  i++;
            }
            else if(power<tokens[i] && score>=1){
                  power+=tokens[j];
                  score--;
                  j--;

            }
            else{
                break;
            }
        }
        return max;
    }
}