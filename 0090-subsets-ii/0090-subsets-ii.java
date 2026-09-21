class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        result(0, nums, ans, list);
        return ans;
    }

    public void result(int index, int[] nums, ArrayList<List<Integer>> ans, ArrayList<Integer> list) {
        if(index == nums.length) {
            if(!ans.contains(list)) {
                ans.add(new ArrayList<>(list));
            }
            return;
        }

        list.add(nums[index]);
        result(index+1, nums, ans, list);
        list.remove(list.size()-1);

        result(index+1, nums, ans, list);
    }
}