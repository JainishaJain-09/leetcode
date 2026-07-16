import java.util.Arrays;
class Solution {
    public long gcdSum(int[] nums) {
        int maxi = 0;
        long sum = 0;   
        int n = nums.length;
        int[] nums1 = new int[n];
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, nums[i]);
            int m = gcd(maxi, nums[i]);
            nums1[i] = m;
        }
        Arrays.sort(nums1);
        int left = 0;
        int right = n - 1;
        while (left < right) {
            sum += gcd(nums1[left], nums1[right]);  
            left++;
            right--;
        }
        return sum;
    }
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}