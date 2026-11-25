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
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        return tree(root,targetSum)+pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
    }
    public int tree(TreeNode root,long targetSum) {
        int count=0;
        if(root==null) return 0;
        targetSum=targetSum-root.val;
        if(targetSum==0) {
            count++;
        }
        count+=tree(root.left,targetSum);
        count+=tree(root.right,targetSum);
        return count;
    }
}