class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total =0; // at the end when we will be travesring the loop agar mera total gas - total cost negative aaye toh return -1
        int ans = 0;
        // ek aur vairable rkhunga for checking a particular index fit baith rha ya nhi
         int index = 0;
         // track of index
         for(int i=0;i<gas.length;i++){
            total+=gas[i]-cost[i];
            ans+=gas[i]-cost[i];
            if(ans<0){
                ans = 0;
                index = i+1;

            }
         }
         if(index>gas.length || total<0) return -1;
         return index;
     }
}