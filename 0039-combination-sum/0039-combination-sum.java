class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        result(0, candidates, ans, target, ds);
        return ans;
    }
    public void result(int index, int[] candidates, ArrayList<List<Integer>> ans,int target, ArrayList<Integer> ds) {
        if (index == candidates.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if (candidates[index] <= target) {
            ds.add(candidates[index]);
            result(index, candidates, ans, target - candidates[index], ds);
            ds.remove(ds.size() - 1);
        }
        result(index + 1, candidates, ans, target, ds);
    }
}