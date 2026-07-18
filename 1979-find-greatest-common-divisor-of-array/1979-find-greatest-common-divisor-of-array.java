class Solution {
    public int findGCD(int[] nums) {
        // Arrays.sort(nums);
        // int i=nums[0];
        // int j=nums[nums.length-1];
        // while (j != 0) {
        //     int rem = i % j;
        //     i = j;
        //     j = rem;
        // }
        // return i;
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        while (min != 0) {
            int rem = max % min;
            max = min;
            min = rem;
        }
        return max;
    }
}
   