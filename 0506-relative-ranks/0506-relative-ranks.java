// public class Solution {
//     public String[] findRelativeRanks(int[] nums) {
//         Integer[] index = new Integer[nums.length];
        
//         for (int i = 0; i < nums.length; i++) {
//             index[i] = i;
//         }
        
//         Arrays.sort(index, (a, b) -> (nums[b] - nums[a]));
        
//         String[] result = new String[nums.length];

//         for (int i = 0; i < nums.length; i++) {
//             if (i == 0) {
//                 result[index[i]] = "Gold Medal";
//             }
//             else if (i == 1) {
//                 result[index[i]] = "Silver Medal";
//             }
//             else if (i == 2) {
//                 result[index[i]] = "Bronze Medal";
//             }
//             else {
//                 result[index[i]] = (i + 1) + "";
//             }
//         }

//         return result;
//     }
// }

class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        int n = score.length;
        String[] res = new String[n];
        
        PriorityQueue<Integer> pq = 
            new PriorityQueue<>((a,b)->score[b]-score[a]);
        
        for(int i=0;i<n;i++){
            pq.add(i);
        }
        int i=1;
        while(!pq.isEmpty()){
            
            int idx = pq.poll();
            
            if(i>3){
                res[idx] = Integer.toString(i);
            }else if(i==1){
                res[idx] = "Gold Medal";
            }else if(i==2){
                res[idx] = "Silver Medal";
            }else if(i==3){
                res[idx] = "Bronze Medal";
            }
            i++;
        }
        
        return res;
        
    }
}
