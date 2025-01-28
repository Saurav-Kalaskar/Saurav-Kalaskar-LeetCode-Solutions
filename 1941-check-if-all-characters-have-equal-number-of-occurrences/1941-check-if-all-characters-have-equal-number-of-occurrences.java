class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }
            else{
                map.put(c, 1);
            }
        }

        Set<Integer> set = new HashSet<Integer>(map.values());
        if(set.size() == 1){
            return true;
        }
        return false;
    }
}