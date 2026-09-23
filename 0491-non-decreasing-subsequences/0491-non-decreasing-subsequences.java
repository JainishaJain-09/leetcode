class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        ArrayList<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        result(nums,0,ans,list);
        return ans;
    }
    public void result(int[] nums,int index,ArrayList<List<Integer>> ans,ArrayList<Integer> list) {
        if(list.size()>=2) {
            ans.add(new ArrayList<>(list));
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=index;i<nums.length;i++) {
            if(!set.contains(nums[i]) && (list.size()==0 || nums[i]>=list.get(list.size()-1))) {
                set.add(nums[i]);
                list.add(nums[i]);
                result(nums,i+1,ans,list);
                list.remove(list.size()-1);
            }
        }
    }
}