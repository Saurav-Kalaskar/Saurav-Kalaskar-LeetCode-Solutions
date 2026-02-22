class Solution {
    public int maxRotateFunction(int[] A) {
        if(A==null||A.length<1) return 0;
        
        int sum=0;
        int t_pre=0;
        for(int i=0;i<A.length;i++){
            sum+=A[i];
            t_pre+=i*A[i];
        }
        
        
        int max=t_pre;
        for(int i=A.length-1;i>=1;i--){
            int current=t_pre+sum-A.length*A[i];
            max=Math.max(max,current);
            t_pre=current;
        }
        return max;
    }
}