class Solution {
    public int minOperations(int[] nums, int x) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            total=total+nums[i];
        }
        int target=total-x;
        if(target<0){
            return -1;
        }
        int left=0;
        int right=0;
        int maxi=-1;
        int sum=0;
        while(right<nums.length){
            sum=sum+nums[right];
            right++;
            while(sum>target && left<right){
                sum=sum-nums[left];
                left++;
            }
            if(sum==target){
                maxi=Math.max(maxi,right-left);
            }
        }
        if(maxi==-1){
            return -1;
        }
        return nums.length-maxi;
    }
}