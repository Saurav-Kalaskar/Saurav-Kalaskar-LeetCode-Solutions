class Solution {
    public boolean repeatedSubstringPattern(String s) {
        // Create the doubled string
        String doubled = s + s;
        
        // Strip the first and last character and search for s
        return doubled.substring(1, doubled.length() - 1).contains(s);
    }
}