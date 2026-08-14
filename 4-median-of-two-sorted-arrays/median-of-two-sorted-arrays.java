class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
              int i = nums1.length-1;
              int j = nums2.length-1;
              int merge[] = new int[nums1.length+nums2.length];
              int k = merge.length-1;
              while(i>=0 && j>=0){
                   if(nums1[i]>=nums2[j]){
                           merge[k] = nums1[i];
                           k--;
                           i--;
              }
                   else{
                          merge[k] = nums2[j];
                          j--;
                          k--;
                   }
              }
              while(i>=0){
                 merge[k] = nums1[i];
                 k--;
                 i--;
              }
              while(j>=0){
                merge[k] = nums2[j];
                j--;
                k--;
              }
              double ans = 0;
              if(merge.length%2!=0){
              ans =  merge[merge.length/2];
              }
              else{
                  ans = (merge[merge.length/2-1]+merge[merge.length/2])/2.0;
              }

              return ans;
    }
}