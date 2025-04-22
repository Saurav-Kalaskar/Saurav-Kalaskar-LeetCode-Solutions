class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
    for(char c : s.toCharArray()) {
        if(Character.isLetterOrDigit(c)) {
            sb.append(Character.toLowerCase(c));
        }
    }
    int n = sb.length();
    int left = 0;
    int right = n-1;

    while (left < right) {
        if(sb.charAt(left) != sb.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}
}