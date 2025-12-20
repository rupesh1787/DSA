class Solution {
    public int[] shuffle(int[] nums, int n) {
          int first[] = Arrays.copyOfRange(nums,0,n);
          int second[] = Arrays.copyOfRange(nums,n,nums.length);
          int arr[] = new int[nums.length];
          for(int i=0;i<nums.length;i++){
            if(i%2==0){
                arr[i] = first[i/2];
            }
            else{
                arr[i] = second[i/2];
            }
          }
          return arr;
    }
}