/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        tree(root,targetSum,list,ans);
        return list;
    }
    public void tree(TreeNode root,int targetSum,List<List<Integer>> list,List<Integer> ans){
        if(root==null) return;
        targetSum=targetSum-root.val;
        ans.add(root.val);
        if(root.left==null && root.right==null){
            if(targetSum==0){
                list.add(new ArrayList<>(ans));
            }
        }
        tree(root.left,targetSum,list,ans);
        tree(root.right,targetSum,list,ans);
        ans.remove(ans.size()-1);
    }
}