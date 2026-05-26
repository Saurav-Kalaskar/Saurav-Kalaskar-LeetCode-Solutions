import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Edge cases
        if (nums1.length == 0 || nums2.length == 0 || k == 0) {
            return result;
        }
        
        // Min-heap to store the array: {sum, index_in_nums1, index_in_nums2}
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        
        // Initialize the heap with the first k elements of nums1 paired with nums2[0]
        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            minHeap.offer(new int[]{nums1[i] + nums2[0], i, 0});
        }
        
        // Extract k times
        while (k > 0 && !minHeap.isEmpty()) {
            int[] current = minHeap.poll();
            int i = current[1];
            int j = current[2];
            
            result.add(List.of(nums1[i], nums2[j]));
            
            // If there is a next element in nums2, push the new pair into the heap
            if (j + 1 < nums2.length) {
                minHeap.offer(new int[]{nums1[i] + nums2[j + 1], i, j + 1});
            }
            
            k--;
        }
        
        return result;
    }
}