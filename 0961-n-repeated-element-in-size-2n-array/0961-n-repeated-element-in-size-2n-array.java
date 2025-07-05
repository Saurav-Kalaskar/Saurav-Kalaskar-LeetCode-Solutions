// using hashmap

// class Solution {
//     public int repeatedNTimes(int[] nums) {
//         HashMap<Integer, Integer> hmap = new HashMap<>();
//         for(int num: nums){
//             hmap.put(num, hmap.getOrDefault(num, 0)+1);
//             if(hmap.get(num)>1){
//                 return num;
//             }
//         }
//         return -1;
//     }
// }

// using hashset 

class Solution {
    public int repeatedNTimes(int[] nums) 
    {
        HashSet<Integer> hset=new HashSet<>();
        for(int num:nums)
        {
            if(hset.contains(num))
                return num;
            hset.add(num);
        }
        return -1;
    }
}