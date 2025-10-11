class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> occur = new HashMap<>();
        for(int num:nums){
            occur.put(num,occur.getOrDefault(num,0)+1);

        }
        for(Map.Entry<Integer,Integer>entry:occur.entrySet()){
            if(entry.getValue()>n/2){
                return entry.getKey();
            }

        }
        return -1;
    }
}