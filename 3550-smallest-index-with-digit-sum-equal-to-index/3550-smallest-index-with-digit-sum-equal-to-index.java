class Solution {
    public int smallestIndex(int[] nums) {
        int sum=0;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            while(num>0){
                int digit=num%10;
                sum=sum+digit;
                num=num/10;
            }
            arr[i]=sum;
            sum=0;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==i){
                return i;
            }
        }
        return -1;
    }
}