 class Solution {
    public int findMaxLength(int[] nums) {
            int n = nums.length;
            int result = 0;
            int currsum = 0;
           
            HashMap<Integer,Integer> mp = new HashMap<>();
           mp.put(0,-1);
           for(int i=0;i<n;i++){
               currsum+=nums[i]==1?1:-1;
               if(mp.containsKey(currsum)){
                   result = Math.max(result,i-mp.get(currsum));
               }
               else{
                mp.put(currsum,i);
               }
           }
           return result;
    }
}