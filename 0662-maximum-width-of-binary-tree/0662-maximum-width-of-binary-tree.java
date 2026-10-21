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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> q=new LinkedList<>();
        Queue<Integer> index=new LinkedList<>();
        q.add(root);
        index.add(0);
        int max=0;
        while(!q.isEmpty()){
            int size=q.size();
            int min=index.peek();
            int first=0,last=0;
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                int idx=index.poll()-min;
                if(i==0) first=idx;
                if(i==size-1) last=idx;
                if(node.left!=null){
                    q.add(node.left);
                    index.add(2*idx+1);
                }
                if(node.right!=null){
                    q.add(node.right);
                    index.add(2*idx+2);
                }
            }
            max=Math.max(max,last-first+1);
        }
        return max;
    }
}