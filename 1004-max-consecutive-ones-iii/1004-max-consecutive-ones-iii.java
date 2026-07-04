class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        // int maxi=0;
        // for(int i=0;i<n;i++){
        //     int zero=0;
        //     for(int j=i;j<n;j++){
        //         if(nums[j]==0){
        //             zero++;
        //         }
        //         if(zero<=k){
        //             maxi=Math.max(maxi,j-i+1);
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // return maxi;
        int maxlen=0,l=0,r=0;
        int zero=0;
        int maxi=0;
        while(r<n){
            if(nums[r]==0){
                zero++;
            }
            while(zero>k){
                if(nums[l]==0){
                    zero--;
                }
                l=l+1;
            }
            if(zero<=k){
                maxi=Math.max(maxi,r-l+1);
                r++;

            }
        }
        return maxi;

    }
}