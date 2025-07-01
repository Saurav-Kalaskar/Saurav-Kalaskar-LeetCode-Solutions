class Solution {
     public List<Integer> minSubsequence(int[] nums) {
        int[] count = new int[101];     // count[i] is the number of occurrences of i in nums
        int totalSum = 0;
        for (int currInt : nums) {
            totalSum += currInt;
            count[currInt]++;
        }
    
       List<Integer> currSubseq = new ArrayList<>();
       int currSum = 0;
    
    // Keep putting the greatest available value into the subsequence and return the subsequence as soon as its sum is greater than the rest.
        for (int i = count.length - 1; i >= 0 && currSum <= totalSum / 2; --i) {
 
            while (count[i] > 0 && currSum <= totalSum / 2) {
                currSubseq.add(i);
                currSum += i;
                count[i]--;
            }
        }
        return currSubseq;
    }
}