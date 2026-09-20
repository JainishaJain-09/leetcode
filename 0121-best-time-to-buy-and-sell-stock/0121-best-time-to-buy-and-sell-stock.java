class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int n = prices.length;
        for (int i = 0; i < n; i++) {
            if (min > prices[i]) {
                min = prices[i];
            }
            if (max < prices[i] - min) {
                max = prices[i] - min;
            }
        }
        return max;
    }
}