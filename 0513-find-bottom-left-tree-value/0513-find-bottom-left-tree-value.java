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
    Stack<Integer> st=new Stack<>();
    public int findBottomLeftValue(TreeNode root) {
        leftview(root,0);
        return st.peek();
    }
    public void leftview(TreeNode node,int level) {
        if(node==null) return;
        if(level==st.size()) st.add(node.val);
        leftview(node.left,level+1);
        leftview(node.right,level+1);
    }
}