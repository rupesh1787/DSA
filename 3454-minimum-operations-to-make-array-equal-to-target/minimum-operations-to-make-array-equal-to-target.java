class Solution {
    public long minimumOperations(int[] nums, int[] target) {
          int current = 0;
          int previous = 0;
          long result = 0;
          for(int i=0;i<nums.length;i++){
                 current = target[i]-nums[i];
            if(current>0 && previous<0 || previous>0 && current<0){
                   result+=Math.abs(current);
            }
            else if(Math.abs(current)>Math.abs(previous)){
                result+=Math.abs(current-previous);
            }
            previous = current;
          }
          return result;
    }
}