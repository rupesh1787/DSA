class Solution {
    public String reverseWords(String s) {
        s = s.trim(); // extra space (first last mai hai wo remove )
        // for splitting 
        String words[] = s.split("\\s+"); // for one or more space we use regex 
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
              sb.append(words[i]);
              if(i!=0) sb.append(" ");
   
        }
        return sb.toString();
    }
}