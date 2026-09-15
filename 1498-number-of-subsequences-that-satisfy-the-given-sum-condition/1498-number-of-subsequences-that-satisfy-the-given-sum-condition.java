class Solution {
    int mod=1000000007;
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int count=0;
        while(left<=right){
            if(nums[left]+nums[right]<=target){
                count=(count+power(2,right-left))%mod;
                left++;
            }
            else{
                right--;
            }
        }
        return count;
    }
    public int power(int a,int b){
        long ans=1;
        long x=a;
        while(b>0){
            if(b%2==1){
                ans=(ans*x)%mod;
            }
            x=(x*x)%mod;
            b=b/2;
        }
        return (int)ans;
    }
}