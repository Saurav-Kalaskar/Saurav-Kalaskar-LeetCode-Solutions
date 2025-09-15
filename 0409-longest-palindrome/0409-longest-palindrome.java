class Solution {
    // public int longestPalindrome(String s) {
    //     if(s==null || s.length() == 0) return 0;
    //     HashSet<Character> lp = new HashSet<Character>();
    //     int count = 0;
    //     for(int i = 0; i<s.length(); i++){
    //         if(lp.contains(s.charAt(i))){
    //             lp.remove(s.charAt(i));
    //             count++;
    //         }else{
    //             lp.add(s.charAt(i));
    //         }
    //     }
    //     if (!lp.isEmpty()) return count*2+1;
    //     return count*2;
    // }
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int len = 0;
        for (char c : s.toCharArray()) {
            if (set.remove(c)) len += 2;
            else set.add(c);
        }
        return set.size() > 0 ? len+1: len;
    }
}