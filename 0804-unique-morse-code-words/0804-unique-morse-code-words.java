class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String [] mapping = new String []{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet();

        for(String word : words){
            StringBuilder currentMorse = new StringBuilder();

            for(char c : word.toCharArray()) {
                currentMorse.append(mapping[c - 'a']);
            }
            set.add(currentMorse.toString());
        }

        return set.size();
    }
}