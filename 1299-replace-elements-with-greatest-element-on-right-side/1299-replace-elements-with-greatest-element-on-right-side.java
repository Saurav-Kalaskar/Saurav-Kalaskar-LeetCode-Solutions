class Solution {
    public int[] replaceElements(int[] arr) {
        for (int i = arr.length-1, mx = -1; i >= 0; --i){
            mx = Math.max(arr[i], arr[i] = mx);
        }
        return arr;
    }
}

//expanded version
//   public int[] replaceElements2(int[] A) {
//         int mx = -1, n = A.length, a;
//         for (int i = n - 1; i >= 0; --i) {
//             a = A[i];
//             A[i] = mx;
//             mx = Math.max(mx, a);
//         }
//         return A;
//     }