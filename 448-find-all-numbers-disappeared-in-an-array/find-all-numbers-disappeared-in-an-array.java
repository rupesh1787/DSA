class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
           // set is more flexible as compare to Hashset as later we can change it too treset and linkedset 
           Set<Integer> set = new HashSet<>();
           for(int num:nums){
                set.add(num);
           }

           ArrayList<Integer> list = new ArrayList<>();
           for(int i=1;i<=nums.length;i++){
                     if(!set.contains(i)){
                        list.add(i);
                     }
           }
           return list;
    }
}