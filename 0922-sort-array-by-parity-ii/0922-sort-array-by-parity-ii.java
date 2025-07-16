class Solution {

    public void swap(int[] nums, int a, int b)
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int oddPosition  = 1;
        for(int evenPosition = 0; evenPosition < n; evenPosition += 2)
        {
            if(nums[evenPosition] % 2 == 1)
            {
                while(nums[oddPosition] % 2 == 1)
                    oddPosition += 2;
                swap(nums, evenPosition, oddPosition);
            }
        }
        return nums;
    }
}