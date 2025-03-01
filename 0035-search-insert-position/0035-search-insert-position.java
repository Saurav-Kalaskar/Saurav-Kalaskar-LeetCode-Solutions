class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) return 0;

        int n = nums.length;
        int l = 0;
        int r = n - 1;
        while(l <= r){
            int mid = l+(r-l)/2;
            if(target == nums[mid]) return mid;
            else if (nums[mid] > target) r = mid-1;
            else l = mid + 1;
        }
        return l; // why are we only returning left, why not mid or ri
    }
}