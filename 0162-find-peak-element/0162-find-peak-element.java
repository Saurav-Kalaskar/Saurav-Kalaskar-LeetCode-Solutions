class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length, l=0, h=n-1;
        while(l < h){ // l<=h when u are expecting to return from loop itself
            int m=(l+h) >> 1;
            if(nums[m+1] > nums[m])
                l = m+1;
            else
                h = m; //m is still part of selected subarray as m+1 is possible peak
        }
        return l;
    }
}