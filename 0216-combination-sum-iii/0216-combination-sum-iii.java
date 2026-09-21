class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int[] nums = {1,2,3,4,5,6,7,8,9};
        result(k,n,nums,0,ans,list);
        return ans;
    }
    public void result(int k,int n,int[] nums,int index,ArrayList<List<Integer>> ans,ArrayList<Integer> list) {
        if (index == nums.length) {
            if (list.size() == k && n == 0) {
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if (nums[index] <= n && list.size() < k) {
            list.add(nums[index]);
            result(k,n-nums[index],nums,index+1,ans,list);
            list.remove(list.size()-1);
        }
        result(k,n,nums,index+1,ans,list);
    }
}