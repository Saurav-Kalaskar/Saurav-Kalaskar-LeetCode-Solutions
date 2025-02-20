class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int diff = Integer.MAX_VALUE;
        for(int i = n-1; i - k + 1 >= 0; i-- ){
            diff = Math.min(diff, nums[i] - nums[i-k+1]);
        }
        return diff;
    }
}