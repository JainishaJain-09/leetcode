class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int maxi=0;
        for(int i=0;i<n;i++){
            int zero=0;
            for(int j=i;j<n;j++){
                if(nums[j]==0){
                    zero++;
                }
                if(zero<=k){
                    maxi=Math.max(maxi,j-i+1);
                }
                else{
                    break;
                }
            }
        }
        return maxi;

    }
}