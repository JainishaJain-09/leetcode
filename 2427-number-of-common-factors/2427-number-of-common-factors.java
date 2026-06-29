class Solution {
    public int commonFactors(int a, int b) {
        int count = 0;
        int mini = Math.min(a, b);
        for (int i = 1; i <= mini; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }
        return count;
    }
}