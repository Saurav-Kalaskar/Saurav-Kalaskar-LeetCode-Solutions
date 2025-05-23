class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l = 0, r = arr.length, m;
        while(l<r){
            m = l+(r-l)/2;
            if(arr[m]-1-m < k){
                l = m + 1;
            }
            else r = m;
        }
        return l + k;
    }
}