class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] prefix=new int[n];
        int[] suffix=new int[n];
        prefix[0]=nums[0];
        int maxi=prefix[0];
        suffix[n-1]=nums[n-1];
        int mini=suffix[n-1];
        int result;
        for(int i=1;i<n;i++){
            maxi=Math.max(maxi,nums[i]);
            prefix[i]=maxi;
        }
        for(int i=n-2;i>=0;i--){
            mini=Math.min(mini,nums[i]);
            suffix[i]=mini;
        }
        for(int i=0;i<n;i++){
            result=prefix[i]-suffix[i];
            if(result<=k){
                return i;
            } 

        }
        return -1;
    }
}