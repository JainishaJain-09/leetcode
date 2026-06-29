class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int i=nums[0];
        int j=nums[nums.length-1];
        while (j != 0) {
            int rem = i % j;
            i = j;
            j = rem;
        }
        return i;
    }
}