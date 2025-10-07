class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int merge[] = new int[m+n];
        int k = m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
            merge[k--] = nums1[i--];
            }
            else {
                merge[k--] = nums2[j--];
            }
        }
        while(i>=0){
            merge[k--] = nums1[i--];
        }
        while(j>=0){
            merge[k--] = nums2[j--];
        }
        for(int r = 0;r<m+n;r++){
            nums1[r] = merge[r];
        }
    }
}