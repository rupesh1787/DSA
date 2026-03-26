class Solution {
      int pivot(int nums[], int n){
        int l = 0;
        int r = n - 1;
        while(l < r){
            int mid = l + (r - l) / 2;
            if(nums[mid] > nums[r]){
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return r; // it will give minimum element ka index after that we need to use binary search 2 time for 0  to pivot-1 and one from pivot to n-1
    }

    int Binary(int l, int r, int[] nums, int target){
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int n = nums.length;
        int min = pivot(nums, n);

        int idx = Binary(0, min - 1, nums, target);
        if(idx != -1){
            return idx;
        }

        return Binary(min, n - 1, nums, target);
    }
}