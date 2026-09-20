class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(new boolean[nums.length],nums,new ArrayList<>(),res);
        return res;
    }
    void backtrack(boolean[] used,int[] nums, List<Integer> curr, List<List<Integer>> res){
        if(curr.size()==nums.length){
            if(!res.contains(new ArrayList<>(curr))){
            res.add(new ArrayList<>(curr));
            }
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
                curr.add(nums[i]);
                used[i]=true;
                backtrack(used,nums,curr,res);
                curr.remove(curr.size()-1);
                used[i]=false;
            }
        }
    }
