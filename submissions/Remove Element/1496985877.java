# Title: Remove Element
# Submission ID: 1496985877
# Status: Accepted
# Date: January 3, 2025 at 10:55:05 PM MST

class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        int x = val;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
    }
    return index;
}
}