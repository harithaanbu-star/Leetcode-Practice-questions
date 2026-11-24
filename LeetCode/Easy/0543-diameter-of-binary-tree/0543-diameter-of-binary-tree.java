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
    int dia=0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return this.dia;
        
    }
    int dfs(TreeNode root ){
        if(root ==null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        this.dia = Math.max(left+right,dia);
        return 1+Math.max(left,right);
    }

}