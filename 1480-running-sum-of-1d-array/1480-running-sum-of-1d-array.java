class Solution {
    public int[] runningSum(int[] nums) {
        // int[] arr=new int[nums.length];
        // int sum=0;
        // for(int i=0;i<nums.length;i++){
        //     sum=sum+nums[i];
        //     arr[i]=sum;
        // }
        // return arr;
        int n=nums.length;
        int[] prefix=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        return prefix;
    }
}