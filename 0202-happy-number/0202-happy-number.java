class Solution {
    public boolean isHappy(int n) {
       HashSet <Integer> hs = new HashSet<>();
       int sum = 0;

        while(sum != 1 && !hs.contains(sum)) {
            hs.add(sum);
            sum = 0;
            
            while(n != 0){
                sum += Math.pow(n%10, 2);
                n/=10;
            }

            n = sum;
        }
        return sum == 1;
    }
}