class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int left=0;
        int right=0;
        int count1=0;
        int maxi=0;
        while(right<n){
            if(nums[right]==1){
                count1++;
                right++;
            }
            else{
                if(k>0){
                    count1++;
                    k--;
                    right++;
                }
                else{
                    if(nums[left]==0){
                        k++;
                    }
                    left++;
                    count1--;
                }
            }
            maxi=Math.max(maxi,count1);
        }
        return maxi;
    }
}