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
// class Solution {
//     List<Integer> list=new ArrayList<>();
//     public int countNodes(TreeNode root) {
//         count(root);
//         return list.size();
//     }
//     public void count(TreeNode root){
//         if(root==null) return;
//         list.add(root.val);
//         count(root.left);
//         count(root.right);
//     }
// }
// class Solution {
//     public int countNodes(TreeNode root) {
//         if(root==null) return 0;
//         List<Integer> list=new ArrayList<>();
//         Queue<TreeNode> q=new ArrayDeque<>();
//         q.add(root);
//         while(!q.isEmpty()){
//             TreeNode node=q.poll();
//             list.add(node.val);
//             if(node.left!=null){
//                 q.offer(node.left);
//             }
//             if(node.right!=null){
//                 q.offer(node.right);
//             }
//         }
//         return list.size();
//     }
// }
class Solution {
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int left=lh(root);
        int right=rh(root);
        if(left==right){
            return (1<<(left+1))-1;
        }
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    public int lh(TreeNode root){
        int count=0;
        while(root.left!=null){
            count++;
            root=root.left;
        }
        return count;
    }
    public int rh(TreeNode root){
        int count=0;
        while(root.right!=null){
            count++;
            root=root.right;
        }
        return count;
    }
}