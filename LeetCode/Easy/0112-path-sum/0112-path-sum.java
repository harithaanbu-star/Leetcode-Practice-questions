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
    static 
    public boolean hasPathSum(TreeNode root, int targetSum) {
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return false;
        Queue<Integer> sum = new LinkedList<>();
        q.offer(root);
        
        sum.offer(root.val);
        while(!q.isEmpty()){
            TreeNode cur=q.poll();
            int cursum =sum.poll();
            if(cur.left == null && cur.right==null){
                if(cursum==targetSum) return true;
            }
            if(cur.left!=null){
                q.offer(cur.left);
                sum.offer(cursum+cur.left.val);
            }
            if(cur.right!=null){
                q.offer(cur.right);
                sum.offer(cursum+cur.right.val);
            }

        }
        return false;
    }
}