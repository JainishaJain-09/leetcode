class Solution {
    public int maxProduct(int[] nums) {
        // int n=nums.length;
        // Arrays.sort(nums);
        // return (nums[n-1]-1)*(nums[n-2]-1);
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=max){
                smax=max;
                max=nums[i];
            }
            else if(nums[i]>smax){
                smax=nums[i];
            }
        }
    return (max-1)*(smax-1);
    }
}