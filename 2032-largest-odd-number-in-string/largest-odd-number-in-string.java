class Solution {
    public String largestOddNumber(String num) {
        int i = num.length()-1;
        StringBuilder sb = new StringBuilder(num);
        char last = 0;
        while(i>=0){
            char ch = num.charAt(i);
            if(ch%2!=0){
                return sb.toString();
            }
            else{
                                sb.deleteCharAt(i);

                i--;
                
            }

        }
        return sb.toString();

    }
}