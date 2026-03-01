class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
          Arrays.sort(nums);
          int freq[] = new int[101];
          for(int num:nums){
               freq[num]++;
          }
          
          int min = nums[0];
          int minfreq = freq[min];
          for(int i:nums){
              if(i!=min && freq[i]!=freq[min]){
                   return new int[]{min , i};
              }
          }
          return new int[] {-1,-1};
    }
}