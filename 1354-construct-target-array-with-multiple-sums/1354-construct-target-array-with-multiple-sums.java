import java.util.PriorityQueue;

class Solution {
    public boolean isPossible(int[] target) {
        // Edge case: if the array has only one element, it must be 1 to be valid.
        if (target.length == 1) {
            return target[0] == 1;
        }

        // Max-heap to constantly track the largest element
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        long totalSum = 0;

        // Initialize the heap and calculate the total sum
        for (int num : target) {
            maxHeap.add(num);
            totalSum += num;
        }

        // Work backwards until the largest element in the heap is 1 (meaning all are 1s)
        while (maxHeap.peek() > 1) {
            int maxVal = maxHeap.poll();
            long restSum = totalSum - maxVal;

            // If the sum of the rest of the elements is 1, we can always reach 1 by subtracting 1 repeatedly.
            if (restSum == 1) {
                return true;
            }

            // If restSum is 0 (only one element in array) or the maxVal is not strictly greater than restSum,
            // we can't go backwards anymore.
            if (restSum == 0 || maxVal <= restSum) {
                return false;
            }

            // Calculate the previous value using modulo to prevent TLE
            int prevVal = (int) (maxVal % restSum);
            
            // If the remainder is 0, it means we can't reach a valid previous state (all elements must be >= 1)
            if (prevVal == 0) {
                return false;
            }

            // Push the previous value back into the heap and update the total sum
            maxHeap.add(prevVal);
            totalSum = restSum + prevVal;
        }

        return true;
    }
}