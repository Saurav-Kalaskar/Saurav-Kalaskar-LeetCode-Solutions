class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();

        int index = 0;

        for (int num = 1; num <= n; num++) {
            result.add("Push");

            if (target[index] == num) {
                index++;
            } else {
                result.add("Pop");
            }

            if (index == target.length) {
                break;
            }
        }

        return result;
    }
}