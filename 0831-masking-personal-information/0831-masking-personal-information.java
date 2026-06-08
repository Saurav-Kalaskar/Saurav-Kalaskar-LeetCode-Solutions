class Solution {
    public String maskPII(String s) {
        // Check if the input is an email
        if (s.contains("@")) {
            return maskEmail(s);
        } else {
            return maskPhoneNumber(s);
        }
    }

    private String maskEmail(String s) {
        s = s.toLowerCase();
        int atIndex = s.indexOf('@');
        
        // Extract the first and last character of the name
        char firstChar = s.charAt(0);
        char lastChar = s.charAt(atIndex - 1);
        
        // Construct the masked email
        return firstChar + "*****" + lastChar + s.substring(atIndex);
    }

    private String maskPhoneNumber(String s) {
        // Keep only the digits from the input string
        StringBuilder digits = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.append(c);
            }
        }
        
        String digitStr = digits.toString();
        int totalDigits = digitStr.length();
        
        // Get the last 4 digits (local number suffix)
        String localSuffix = digitStr.substring(totalDigits - 4);
        
        // Determine the country code masking format based on total number of digits
        if (totalDigits == 10) {
            return "***-***-" + localSuffix;
        } else if (totalDigits == 11) {
            return "+*-***-***-" + localSuffix;
        } else if (totalDigits == 12) {
            return "+**-***-***-" + localSuffix;
        } else {
            return "+***-***-***-" + localSuffix;
        }
    }
}