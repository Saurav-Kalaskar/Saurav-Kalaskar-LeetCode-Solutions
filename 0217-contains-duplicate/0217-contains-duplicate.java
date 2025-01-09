class Solution {
    public boolean containsDuplicate(int[] nums) {
        // int index = 0;
        // for(int i = 0; i<nums.length; i++){

        // }
        HashSet<Integer> duplicate = new HashSet<>();

        for(int num : nums){
            if(duplicate.contains(num)){
                return true;
            }
            duplicate.add(num);
        }
        return false;
    }
}