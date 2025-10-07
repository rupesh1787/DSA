class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = nums1.length-1;
        int j = nums2.length-1;
        int merge[] = new int[nums1.length+nums2.length];
        int k = nums1.length+nums2.length-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                merge[k--] = nums1[i--];
            }
            else{
                merge[k--] = nums2[j--];

            }

        }
        while(i>=0){
            merge[k--] = nums1[i--];
        }
        while(j>=0){
            merge[k--] = nums2[j--];
        }
          int r = merge.length;
          double median = 0;
       if(r%2!=0){
             median = merge[r/2];
           return median;
       }
       else{
           median = (merge[r/2-1]+merge[r/2])/2.0;
             return median;
       }

    }
}