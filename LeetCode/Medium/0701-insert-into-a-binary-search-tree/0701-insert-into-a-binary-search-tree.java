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
    static TreeNode insert(TreeNode root,int ele){
        if(root==null){
            return new TreeNode(ele);
        }
        if(root.val<ele){
            root.right=insert(root.right,ele);
        }if(root.val>ele){
            root.left=insert(root.left,ele);
        }
        return root;
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        return insert(root,val);
    }
}