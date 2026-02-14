class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        char arr[] = new char[n+1];
        Arrays.fill(arr,'f');
        for(int i=0;i<n;i++){
           int x =  nums[i] ;
           if(x>0 && x<=n){
           arr[x] = 't';
           }
        }

        for(int i=1;i<=n;i++){
            if(arr[i]=='f'){
                return i;
            }
        }
     return n+1;
     
      
    }
}