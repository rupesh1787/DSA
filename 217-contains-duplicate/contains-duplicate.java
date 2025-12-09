class Solution {
    public boolean containsDuplicate(int[] nums) {
           HashSet<Integer> copy = new HashSet<>();
             for(int num:nums){
                if(copy.contains(num)) {
                    return true;
                }
                else{
                    copy.add(num);
                }
             }
             return false;
    }
}