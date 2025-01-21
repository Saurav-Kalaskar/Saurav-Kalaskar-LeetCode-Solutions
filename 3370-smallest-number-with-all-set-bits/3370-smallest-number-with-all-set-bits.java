class Solution {
    public int smallestNumber(int n) {
        int num = 0;
        int i = 0;
        while(n>0){
            num = num | (1<<i);
            i++;
            n = n >> 1;
        }
        return num;
    }
}