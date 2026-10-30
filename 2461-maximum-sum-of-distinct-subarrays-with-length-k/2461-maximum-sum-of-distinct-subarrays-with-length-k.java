class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left=0;
        int right=0;
        long sum=0;
        long maxi=0;
        HashSet<Integer> set=new HashSet<>();
        while(right<nums.length){
            if(!set.contains(nums[right])){
                set.add(nums[right]);
                sum+=nums[right];
                if(right-left+1==k){
                    maxi=Math.max(maxi,sum);
                    set.remove(nums[left]);
                    sum-=nums[left];
                    left++;
                }
                right++;
            }
            else{
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
        }
        return maxi;
    }
}