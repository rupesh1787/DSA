class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
          Stack<Integer> st = new Stack<>();
          int n = pushed.length;
          int j = 0;
          for(int i=0;i<n;i++){
                 st.push(pushed[i]);
                 while(!st.isEmpty() && st.peek()==popped[j]){
                         j++;
                         st.pop();
                 }

          }
          if(!st.isEmpty()){
               return false;
          }
          else{
              return true;
          }


    }
}