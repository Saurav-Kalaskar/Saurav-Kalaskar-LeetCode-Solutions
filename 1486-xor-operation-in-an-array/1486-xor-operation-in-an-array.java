class Solution {
    public int xorOperation(int n, int start) {
        int nums[] = new int[n];
        int res = nums[0];

        for (int i =0; i<n; i++){
            res = res ^ (start + 2 *i);
        }
        return res;
    }
}