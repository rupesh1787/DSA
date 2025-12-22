class Solution {
    public boolean judgeCircle(String moves) {
          int vertical = 0;
          int horizontal = 0;
          for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                vertical++;
            }
            else if(moves.charAt(i)=='D'){
                  vertical--;
          }
          else if(moves.charAt(i)=='L'){
                horizontal--;
          }
          else{
            horizontal++;
          }
    }
              return vertical == 0 && horizontal==0;

    }

}