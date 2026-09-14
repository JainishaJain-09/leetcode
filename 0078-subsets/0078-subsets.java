class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sb = new ArrayList<>();
        set(nums, 0, sb, ans);
        return ans;
    }
    public void set(int[] nums, int index, List<Integer> sb, List<List<Integer>> ans) {
        if (index >= nums.length) {
            ans.add(new ArrayList<>(sb));
            return;
        }
        sb.add(nums[index]);
        set(nums, index + 1, sb, ans);
        sb.remove(sb.size() - 1);
        set(nums, index + 1, sb, ans);
    }
}