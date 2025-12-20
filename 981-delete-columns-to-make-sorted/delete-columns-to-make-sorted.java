class Solution {
    public int minDeletionSize(String[] strs) {
           int delete = 0;
           int row = strs.length;
           int col = strs[0].length();
           for(int i=0;i<col;i++)   {   //columns ke liye
             for(int j=1;j<row;j++){
                if(strs[j].charAt(i)<strs[j-1].charAt(i)){
                    delete++;
                    break;  // uss particular column ko aur check mat kro 

                }
             }          
           }
           return delete;
    }
}