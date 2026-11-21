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
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        return depth(root);
    }
    public int depth(TreeNode root) {
        if(root==null) return 0;
        int left=depth(root.left);
        int right=depth(root.right);
        if(left==0) return 1+right;
        if(right==0) return 1+left;
        return 1+Math.min(left,right);
    }
}
