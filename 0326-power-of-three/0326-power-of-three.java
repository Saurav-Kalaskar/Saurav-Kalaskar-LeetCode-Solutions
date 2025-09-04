class Solution {
    static int maxPow3 = (int) Math.pow(3, 19);
    public boolean isPowerOfThree(int n) {
        return n > 0 && maxPow3 % n == 0;
    }
}