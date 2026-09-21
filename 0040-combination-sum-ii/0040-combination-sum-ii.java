class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        Arrays.sort(candidates);
        result(0, candidates, ans, target, ds);
        return ans;
    }

    public void result(int index, int[] candidates, ArrayList<List<Integer>> ans, int target, ArrayList<Integer> ds) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (candidates[i] > target) {
                break;
            }
            ds.add(candidates[i]);
            result(i + 1, candidates, ans, target - candidates[i], ds);
            ds.remove(ds.size() - 1);
        }
    }
}