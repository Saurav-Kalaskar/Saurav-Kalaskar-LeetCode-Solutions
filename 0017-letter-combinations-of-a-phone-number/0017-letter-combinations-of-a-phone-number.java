// class Solution {
//     	public List<String> letterCombinations(String digits) {
// 		List<String> ans = new LinkedList<String>();
// 		if (digits.isEmpty())
// 			return ans;
// 		String[] mapping = new String[] { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
// 		ans.add(0, "");
// 		for (int i = 0; i < digits.length(); i++) {
// 			int x = Character.getNumericValue(digits.charAt(i));
// 			int size = ans.size();     // number of nodes/strings already in the queue
// 			for (int k = 1; k <= size; k++) {
// 				String t = ans.remove(0);
// 				for (char s : mapping[x].toCharArray())
// 					ans.add(t + s);
// 			}
// 		}
// 		return ans;
// 	}
// }

import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final String[] PHONE_MAP = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits.isEmpty()) return combinations;
        backtrack(0, digits, new StringBuilder(), combinations);
        return combinations;
    }
    
    private void backtrack(int index, String digits, StringBuilder path, List<String> combinations) {
        if (index == digits.length()) {
            combinations.add(path.toString());
            return;
        }
        
        String possibleLetters = PHONE_MAP[digits.charAt(index) - '0'];
        for (char letter : possibleLetters.toCharArray()) {
            path.append(letter);
            backtrack(index + 1, digits, path, combinations);
            path.deleteCharAt(path.length() - 1); // Backtrack
        }
    }
}