class Solution {
    public int atMost(int[] nums, int k) {
        if (k < 0) return 0;
        int n = nums.length;
        int left = 0;
        int right = 0;
        int oddcount = 0;
        int ans = 0;
        while (right < n) {
            if (nums[right] % 2 != 0) {
                oddcount++;
            }
            while (oddcount > k) {
                if (nums[left] % 2 != 0) {
                    oddcount--;
                }
                left++;
            }
            ans += (right - left + 1);
            right++;
        }
        return ans;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }
}