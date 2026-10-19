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
    List<Integer> ds=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        rightview(root,0);
        return ds;
    }
    public void rightview(TreeNode node,int level) {
        if(node==null) return;
        if(level==ds.size()) ds.add(node.val);
        rightview(node.right,level+1);
        rightview(node.left,level+1);
    }
}