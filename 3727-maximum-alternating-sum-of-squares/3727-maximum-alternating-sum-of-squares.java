class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                nums[i]=nums[i]*(-1);
            }
        }
        long sumh=0;
        long suml=0;
        Arrays.sort(nums);
        for(int i=0;i<n/2;i++){
            suml=suml+((long)nums[i]*nums[i]);
        }
        for(int i=n/2;i<n;i++){
            sumh=sumh+((long)nums[i]*nums[i]);
        }
        return sumh-suml;
    }
}