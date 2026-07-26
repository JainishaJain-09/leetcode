class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return solve(nums,k)-solve(nums,k-1);
    }
    public int solve(int[] nums,int k){
        int count=0;
        int i=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int j=0;j<nums.length;j++){
            int ch=nums[j];
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
            while(map.size()>k){
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                i++;
            }
            count=count+(j-i+1);
        }
        return count;
    }
}