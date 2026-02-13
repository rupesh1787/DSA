class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) {
            int current = nums[i];
            int next = nums[i + 1];

            for (int val = current + 1; val < next; val++) {
                list.add(val);
            }
        }
        return list;
    }
}
