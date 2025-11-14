// class Solution {
//     public String largestNumber(int[] nums) {
//         String[] a = new String[nums.length];
//         for (int i = 0; i < nums.length; i++) {
//             a[i] = String.valueOf(nums[i]);
//         }
//         Arrays.sort(a, (x, y) -> (y + x).compareTo(x + y));
//         StringBuilder s = new StringBuilder();
//         for (String x : a) {
//             s.append(x);
//         }
//         while (s.length() > 1 && s.charAt(0) == '0') {
//             s.deleteCharAt(0);
//         }
//         return s.toString();
//     }
// }

// public class Solution {
//     public String largestNumber(int[] nums) {
//         if (nums == null || nums.length == 0) return "";
//         String[] strs = new String[nums.length];
//         for (int i = 0; i < nums.length; i++) {
//             strs[i] = nums[i]+"";
//         }
//         Arrays.sort(strs, new Comparator<String>() {
//             @Override
//             public int compare(String i, String j) {
//                 String s1 = i+j;
//                 String s2 = j+i;
//                 return s1.compareTo(s2);
//             }
//         });
//         if (strs[strs.length-1].charAt(0) == '0') return "0";
//         String res = new String();
//         for (int i = 0; i < strs.length; i++) {
//             res = strs[i]+res;
//         }
//         return res;
//     }
// }

public class Solution {
    public String largestNumber(int[] nums) {
        // 1.Convert to Integer array since Arrays.sort(A,T) forces that
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        // 2.Sort in descending order
        Arrays.sort(strs, (s1, s2) -> ((s2 + s1).compareTo(s1 + s2)));

        // 3.Append together and check final result
        String result = String.join("", strs);
        if (result.isEmpty() || result.charAt(0) == '0') {
            return "0";
        }
        return result;
    }
}