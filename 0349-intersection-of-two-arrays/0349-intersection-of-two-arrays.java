class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();
        
        // Add all elements from nums1 to the set
        for (int num : nums1) {
            set.add(num);
        }

        // Check for intersection elements
        for (int num : nums2) {
            if (set.contains(num)) {
                intersection.add(num);
            }
        }

        // Convert HashSet to an array
        int[] res = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) {
            res[i++] = num;
        }
        return res;
    }
}